package com.quizzical.quizzical.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("question")
public class QuestionController {
    @GetMapping("/allQuestions")
    public String getAllQuestions() {
        System.out.println("Hi all questions");
        return "Hi all questions";
    }
    
}
