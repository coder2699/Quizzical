package com.quizzical.quizzical.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quizzical.quizzical.Question;
import com.quizzical.quizzical.Service.QuestionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionsService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions() {
        return questionsService.getAllQuestions();
    }
    
}
