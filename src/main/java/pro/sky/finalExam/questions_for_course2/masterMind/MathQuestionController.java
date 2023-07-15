//package pro.sky.finalExam.questions_for_course2.masterMind;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Collection;
//
//@RestController
//@RequestMapping("/math")
//public class MathQuestionController {
//
//        private final QuestionService mathQuestionService;
//
//    public MathQuestionController(@Qualifier("mathService") QuestionService mathQuestionService) {
//        this.mathQuestionService = mathQuestionService;
//    }
//
//    @GetMapping("/add")
//    Question addQuestion(@RequestParam String question, @RequestParam String answer) {
//        return mathQuestionService.add(question, answer);
//    }
//
//    @GetMapping("/remove")
//    Question removeQuestion(@RequestParam String question, @RequestParam String answer) {
//        return mathQuestionService.remove(new Question(question, answer));
//    }
//
//    @GetMapping("")
//    Collection<Question> getAll() {
//        return mathQuestionService.getAll();
//    }
//}
