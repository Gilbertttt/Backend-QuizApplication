package QuizApplicationcom.example.Quiz.Application.Service;

import QuizApplicationcom.example.Quiz.Application.Dao.QuestionDao;
import QuizApplicationcom.example.Quiz.Application.Model.quiztable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public List<quiztable> getAllQuestions() {
        return questionDao.findAll();
    }
    public List<quiztable> getAllQuestionsByCategory(String category){
       return questionDao.findByCategory(category);
    }
    public String addquestions(quiztable quiztable){
        questionDao.save(quiztable);
        return "Success";
    }
}
