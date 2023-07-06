package pro.sky.finalExam.questions_for_course2.easy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.finalExam.questions_for_course2.easy.model.Question;
import pro.sky.finalExam.questions_for_course2.easy.service.QuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/java")
public class JavaQuestionController {

    private final QuestionService questionService;  //can work with questions in QuestionService, that's why we inject interface

    public JavaQuestionController(QuestionService questionService) {   //continue working with interface in constructor
        this.questionService = questionService;
    }

    @GetMapping("/add")
    public Question addQuestion(@RequestParam String question,
                                @RequestParam String answer) {
        Question newQuestion = new Question(question, answer);
        questionService.add(newQuestion);
        return newQuestion;
    }

    //Удалить: “/exam/java/remove?question=QuestionText&answer=QuestionAnswer”
    @GetMapping("/remove")
    public Question removeQuestion(@RequestParam String question,
                                   @RequestParam String answer) {
        Question removeQuestion = new Question(question, answer);
        return questionService.remove(removeQuestion);
    }

    //Получить все вопросы: “/exam/java”
    @GetMapping()
    public Collection<Question> getQuestions() {
        return questionService.getAll();
    }


}
