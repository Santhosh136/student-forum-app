package info.javacafe.studentforumapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import info.javacafe.studentforumapp.entities.Activity;
import info.javacafe.studentforumapp.services.ActivityService;
import info.javacafe.studentforumapp.services.StudentService;

@Controller
@RequestMapping("/students/activity")
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    @Autowired
    private StudentService studentService;
    
    @GetMapping("/new-activity") 
    public String displayForm(Model model) {
        model.addAttribute("activity", new Activity());
        return "students/activity-form";
    }

    @PostMapping("/save-activity")
    public String saveActivity(@ModelAttribute("activity") Activity activity){

        activity.setStudent(studentService.findById("136"));;

        activityService.save(activity);
        return "redirect:/students/activity/new-activity";
    }
}
