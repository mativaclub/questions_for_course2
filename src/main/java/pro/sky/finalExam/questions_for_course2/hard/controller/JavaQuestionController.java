package pro.sky.finalExam.questions_for_course2.hard.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.finalExam.questions_for_course2.hard.model.Question;
import pro.sky.finalExam.questions_for_course2.hard.service.QuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/java")
public class JavaQuestionController {

    private final QuestionService javaQuestionService;  //can work with questions in QuestionService, that's why we inject interface

    public JavaQuestionController(@Qualifier("JavaQuestionServiceImpl") QuestionService javaQuestionService) {   //continue working with interface in constructor
        this.javaQuestionService = javaQuestionService;
    }

    @GetMapping("/add")
    public Question addQuestion(@RequestParam String question,
                                @RequestParam String answer) {
        Question newQuestion = new Question(question, answer);
        javaQuestionService.add(newQuestion);
        return newQuestion;
    }

    //Удалить: “/exam/java/remove?question=QuestionText&answer=QuestionAnswer”
    @GetMapping("/remove")
    public Question removeQuestion(@RequestParam String question,
                                   @RequestParam String answer) {
        Question removeQuestion = new Question(question, answer);
        return javaQuestionService.remove(removeQuestion);
    }

    //Получить все вопросы: “/exam/java”
    @GetMapping()
    public Collection<Question> getQuestions() {
        return javaQuestionService.getAll();
    }


}
