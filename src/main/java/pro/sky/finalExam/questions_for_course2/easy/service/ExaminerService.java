package pro.sky.finalExam.questions_for_course2.easy.service;

import pro.sky.finalExam.questions_for_course2.easy.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);

}
