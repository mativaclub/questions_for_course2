//package pro.sky.finalExam.questions_for_course2.masterMind;
//
//import org.springframework.stereotype.Repository;
//
//import javax.annotation.PostConstruct;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.Set;
//
//@Repository("MathQuestionRepository")
//public class MathQuestionRepository implements QuestionRepository {
//
//    private final Set<Question> mathQuestions;
//
//    private MathQuestionRepository() {
//        mathQuestions = new HashSet<>();
//    }
//
//    @PostConstruct
//    public void init() {
//        add(new Question("mathQuestion1", "mathAnswer1"));
//        add(new Question("mathQuestion2", "mathAnswer2"));
//        add(new Question("mathQuestion3", "mathAnswer3"));
//        add(new Question("mathQuestion4", "mathAnswer4"));
//        add(new Question("mathQuestion5", "mathAnswer5"));
//    }
//    @Override
//    public Question add(Question question) {
//        mathQuestions.add(question);
//        return question;
//    }
//
//    @Override
//    public Question remove(Question question) {
//        if (mathQuestions.contains(question)) {
//            mathQuestions.remove(question);
//            return question;
//        }
//        return null;
//    }
//
//    @Override
//    public Collection<Question> getAll() {
//        return Collections.unmodifiableCollection(mathQuestions);
//    }
//
//}
