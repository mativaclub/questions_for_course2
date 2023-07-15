//package pro.sky.finalExam.questions_for_course2.masterMind;
//
//import org.springframework.stereotype.Repository;
//
//import javax.annotation.PostConstruct;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.Set;
//@Repository("JavaQuestionRepository")
//public class JavaQuestionRepository implements QuestionRepository {
//
//    private final Set<Question> javaQuestions;
//
//    public JavaQuestionRepository() {
//        javaQuestions = new HashSet<>();
//    }
//
//    @PostConstruct
//    public void init() {
//        add(new Question("javaQuestion1", "javaAnswer1"));
//        add(new Question("javaQuestion2", "javaAnswer2"));
//        add(new Question("javaQuestion3", "javaAnswer3"));
//        add(new Question("javaQuestion4", "javaAnswer4"));
//        add(new Question("javaQuestion5", "javaAnswer5"));
//    }
//
//    @Override
//    public Question add(Question question) {
//        javaQuestions.add(question);
//        return question;
//    }
//
//    @Override
//    public Question remove(Question question) {
//        if (javaQuestions.contains(question)) {
//            javaQuestions.remove(question);
//            return question;
//        }
//        return null;
//    }
//
//    @Override
//    public Collection<Question> getAll() {
//        return Collections.unmodifiableCollection(javaQuestions);
//    }
//}
