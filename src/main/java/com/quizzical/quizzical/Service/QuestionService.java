package com.quizzical.quizzical.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizzical.quizzical.Question;
import com.quizzical.quizzical.Repository.QuestionRepo;

@Service
public class QuestionService {

    @Autowired
    QuestionRepo questionRepo;

    public List<Question> getAllQuestions() {
        return questionRepo.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionRepo.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionRepo.save(question);
        return "Success";
    }
}
