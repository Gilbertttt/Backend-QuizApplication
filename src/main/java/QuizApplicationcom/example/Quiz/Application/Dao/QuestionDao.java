package QuizApplicationcom.example.Quiz.Application.Dao;

import QuizApplicationcom.example.Quiz.Application.Model.quiztable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// Fetches data from the database
//It is the last layer when collecting data
//It connects to the database
// Parameters must have the table name which maps with the class name, primary key data type
@Repository
public interface QuestionDao extends JpaRepository<quiztable, Integer> {

    List<quiztable> findByCategory(String category);

}
