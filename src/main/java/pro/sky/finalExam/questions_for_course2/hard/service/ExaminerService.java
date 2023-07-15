package pro.sky.finalExam.questions_for_course2.hard.service;

import pro.sky.finalExam.questions_for_course2.hard.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);

}
