package in.pwskills.akash.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import in.pwskills.akash.entity.Student;

public interface IStudentRepository extends ReactiveMongoRepository<Student, String> {

}
