package in.pwskills.akash.service;

import in.pwskills.akash.entity.Student;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IStudentService {
	
		public Mono<Student> saveStudent(Student student);
		public  Mono<Student> getOneStudentInfo(String id);
		public Flux<Student> findAllStudents();
		public Mono<Void> deleteStudent(String id);
}
