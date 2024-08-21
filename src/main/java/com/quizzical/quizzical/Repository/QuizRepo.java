package com.quizzical.quizzical.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizzical.quizzical.Model.Quiz;

@Repository
public interface QuizRepo extends JpaRepository<Quiz,Integer> {
}
