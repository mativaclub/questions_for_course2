package pro.sky.finalExam.questions_for_course2.hard.service;

import org.springframework.stereotype.Service;
import pro.sky.finalExam.questions_for_course2.hard.model.Question;

import java.util.Collection;
@Service
public interface QuestionService {

    Question add(String question, String answer);
    Question add(Question question);
    Question remove(Question question);
    Collection<Question> getAll();
    Question getRandomQuestion();

}
