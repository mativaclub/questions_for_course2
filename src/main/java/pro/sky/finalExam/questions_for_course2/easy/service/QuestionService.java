package pro.sky.finalExam.questions_for_course2.easy.service;

import pro.sky.finalExam.questions_for_course2.easy.model.Question;

import java.util.Collection;

public interface QuestionService {

    Question add(String question, String answer);
    Question add(Question question);
    Question remove(Question question);
    Collection<Question> getAll();
    Question getRandomQuestion();

}
