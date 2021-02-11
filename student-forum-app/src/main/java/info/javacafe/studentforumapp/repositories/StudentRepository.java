package info.javacafe.studentforumapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import info.javacafe.studentforumapp.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, String>{
    Student findByRegNo(String regNo);
}
