package info.javacafe.studentforumapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import info.javacafe.studentforumapp.entities.ClubActivity;
import info.javacafe.studentforumapp.entities.Student;
import info.javacafe.studentforumapp.services.ClubActivityService;
import info.javacafe.studentforumapp.services.ClubService;
import info.javacafe.studentforumapp.services.StudentService;

@Controller
@RequestMapping("/students/activity")
public class ClubActivityController {
    @Autowired
    private ClubActivityService clubActivityService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private ClubService clubService;

    @GetMapping("/new")
    public String displayForm(Model model) {

        model.addAttribute("activity", new ClubActivity());
        model.addAttribute("clubData", clubService.findAllClubData());
        return "students/activity-form";
    }

    @PostMapping("/save")
    public String saveActivity(ClubActivity clubActivity ,@RequestParam("clubId") Integer clubId) {
        Student student = studentService.findById("136");
        clubActivity.setStudent(student);
        clubActivity.setClub(clubService.findById(clubId).get());

        clubActivityService.save(clubActivity);
        
        return "redirect:/students/activity/new";
    }
}
