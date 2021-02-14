package info.javacafe.studentforumapp.controllers;

import info.javacafe.studentforumapp.services.ClubService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clubs")
public class ClubController {
    
    @Autowired
    private ClubService clubService;

    @GetMapping("/display")
    public String displayAll(Model model) {
        model.addAttribute("clubs", clubService.findAll());
        return "clubs/club-list";
    }
}
