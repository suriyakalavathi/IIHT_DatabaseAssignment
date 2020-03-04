package home.cognizant.cmassignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EntryPointController {

    @GetMapping("/welcome")
    @ResponseBody
    public String  welcomeBuddy() {
        return "Welcome, Super Buddy";
    }
}

