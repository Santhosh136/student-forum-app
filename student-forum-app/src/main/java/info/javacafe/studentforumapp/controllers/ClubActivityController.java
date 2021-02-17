package info.javacafe.studentforumapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import info.javacafe.studentforumapp.entities.ClubActivity;
import info.javacafe.studentforumapp.entities.Student;
import info.javacafe.studentforumapp.services.ClubActivityService;
import info.javacafe.studentforumapp.services.StudentService;

@Controller
@RequestMapping("/students/activity")
public class ClubActivityController {
    @Autowired
    private ClubActivityService clubActivityService;

    @Autowired
    private StudentService studentService;

    @GetMapping("/new")
    public String displayForm(Model model) {
        model.addAttribute("activity", new ClubActivity());
        return "students/activity-form";
    }

    @PostMapping("/save")
    public String saveActivity(ClubActivity clubActivity ) {
        Student student = studentService.findById("136");
        clubActivity.setStudent(student);

        clubActivityService.save(clubActivity);
        return "redirect:/students/activity/new";
    }
}
