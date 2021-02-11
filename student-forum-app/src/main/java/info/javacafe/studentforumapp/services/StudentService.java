package info.javacafe.studentforumapp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import info.javacafe.studentforumapp.entities.Student;
import info.javacafe.studentforumapp.repositories.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    public Optional<Student> findById(String regNo) {
        return studentRepository.findById(regNo);
    }

    public void save(Student student) {
        studentRepository.save(student);
    }
}
