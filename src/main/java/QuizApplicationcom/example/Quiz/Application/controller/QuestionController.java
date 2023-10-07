package QuizApplicationcom.example.Quiz.Application.controller;

import QuizApplicationcom.example.Quiz.Application.Model.quiztable;
import QuizApplicationcom.example.Quiz.Application.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

        // A path variable is used to retrieve data from the URL
        // @PathVariable is used to extract the value from the URL
        // @PathVariable is used to collect incoming data from the URL
        // In this work, @PathVariable is collecting data from the database (category)
        // and storing it in a variable type string named (category)
    }
    @PostMapping("/add")
    public String addquestions(@RequestBody quiztable quiztable){
        return questionService.addquestions(quiztable);
        // To retrieve data use @PathVariable, while sending @RequestBody
    }
}
