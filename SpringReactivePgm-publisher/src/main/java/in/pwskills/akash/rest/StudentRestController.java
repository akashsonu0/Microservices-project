package in.pwskills.akash.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pwskills.akash.entity.Student;
import in.pwskills.akash.service.IStudentService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/api/student")
public class StudentRestController {
	
	@Autowired
	private IStudentService service;
	
	/*
	 * CREATE DOCUMENT
	 * METHOD : POST
	 * PATH   : /create
	 * INPUT  : Student(@RequestBody)
	 * R.T    : Mono<Student>
	 */

	@PostMapping("/create")
	public Mono<Student> saveStudent(
			@RequestBody Student student
			) {
		return service.saveStudent(student);
	}
	
	/*
	 * FIND DOCUMENT
	 * METHOD : GET
	 * PATH   : /fetch/{id}
	 * INPUT  : id
	 * R.T    : Mono<Student> or Empty
	 */
	
	@GetMapping("/fetch/{id}")
	public Mono<Student> getOneStudentDetails(
			@PathVariable String id
			) {
		return service.getOneStudentInfo(id);
	}
	

	/*
	 * READ ALL DOCUMENT
	 * METHOD : GET
	 * PATH   : /fetchAll
	 * INPUT  : no input
	 * R.T    : Flux<Student>
	 */
	
	@GetMapping("/findAll")
	public Flux<Student> fetchAllStudents() {
		return service.findAllStudents();
	}
	
	/*
	 * DELETE ONE DOCUMENT
	 * METHOD : DELETE
	 * PATH   : /delete/{id}
	 * INPUT  : String(@PathVariable)
	 * R.T    : Mono<Void>
	 */
	
	@DeleteMapping("/delete/{id}")
	public Mono<Void> deleteStudentById(
			@PathVariable String id){
		
		return service.deleteStudent(id);
	}
	
	
	
	
}
