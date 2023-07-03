package pro.sky.finalExam.questions_for_course2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.finalExam.questions_for_course2.model.Question;
import pro.sky.finalExam.questions_for_course2.service.ExaminerService;

import java.util.Collection;

@RestController
@RequestMapping()
public class ExaminerController {

    private final ExaminerService examinerService;

    public ExaminerController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/get/{amount}")
    public Collection<Question> getQuestions(@PathVariable int amount) { //in {} is written the amount that can be different in browser
        return examinerService.getQuestions(amount);
    }


}
