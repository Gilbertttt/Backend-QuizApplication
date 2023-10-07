package QuizApplicationcom.example.Quiz.Application.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class quiztable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String category;
    private String difficultylevel;
    private String questiontitle;
    private String a;
    private String b;
    private String c;
    private String d;
    private String answers;
}
