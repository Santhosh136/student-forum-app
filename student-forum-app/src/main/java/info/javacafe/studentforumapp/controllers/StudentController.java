package info.javacafe.studentforumapp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import info.javacafe.studentforumapp.entities.Student;
import info.javacafe.studentforumapp.services.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/new")
    public String displayForm(Model model) {
        model.addAttribute("student", new Student());
        return "students/student-form";
    }

    @PostMapping("/save")
    public String save(Student student) {
        studentService.save(student);
        return "redirect:/students/new";
    }

    @GetMapping("/display")
    public String displayAll(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "students/student-list";
    }

}
