package pro.sky.finalExam.questions_for_course2.service;

import pro.sky.finalExam.questions_for_course2.model.Question;

import java.util.Collection;

public interface QuestionService {

    Question add(String question, String answer);
    Question add(Question question);
    Question remove(Question question);
    Collection<Question> getAll();
    Question getRandomQuestion();

}
