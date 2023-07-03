package pro.sky.finalExam.questions_for_course2.service;

import pro.sky.finalExam.questions_for_course2.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);

}
