package QuizApplicationcom.example.Quiz.Application.controller;

import QuizApplicationcom.example.Quiz.Application.Model.quiztable;
import QuizApplicationcom.example.Quiz.Application.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/question")
public class QuestionController {
    // Create a method to get all questions
    @Autowired
    QuestionService questionService;

    @GetMapping("/my-questions")
    public List<quiztable> getAllQuestions(){
     return questionService.getAllQuestions(); // We don't want to return a string, we want to return an object
    }

    @GetMapping("/category/{category}")
    public List<quiztable> getAllQuestionsByCategory(@PathVariable String category){
        return questionService.getAllQuestionsByCategory(category);
    }

}
