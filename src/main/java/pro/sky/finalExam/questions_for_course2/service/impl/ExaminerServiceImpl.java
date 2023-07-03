package pro.sky.finalExam.questions_for_course2.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.finalExam.questions_for_course2.exceptions.ExamException;
import pro.sky.finalExam.questions_for_course2.model.Question;
import pro.sky.finalExam.questions_for_course2.service.ExaminerService;
import pro.sky.finalExam.questions_for_course2.service.QuestionService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    //for what should be used this random?
    private final Random random = new Random();
    private final QuestionService questionService;  //getRandomQuestion() which is in question service

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) { //creating method which will return amount of questions
        if (amount > questionService.getAll().size()) {  //if qty of questions is bigger then all questions size
            throw new ExamException();                        // throw exception
        }
        List<Question> uniqueQuestions = new ArrayList<>();  //creating collection List, which will contain unique questions
        while (uniqueQuestions.size() < amount) {          //while this unique questions qty is lower than the amount that we need to get
            Question newQuestion = questionService.getRandomQuestion();  //we creat new object of Question, get random question
            if (!uniqueQuestions.contains(newQuestion)) {        //if it is not already in our list
                uniqueQuestions.add(newQuestion);              //we add that question
            }
        }
        return uniqueQuestions;
    }


}
