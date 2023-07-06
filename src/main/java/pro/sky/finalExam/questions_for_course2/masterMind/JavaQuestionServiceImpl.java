//package pro.sky.finalExam.questions_for_course2.masterMind;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//
//import java.util.Collection;
//import java.util.List;
//import java.util.Random;
//import java.util.Set;
//@Service("javaService")
////@Component("JavaQuestionServiceImpl")
//public class JavaQuestionServiceImpl implements QuestionService {
//
//    public final QuestionRepository javaQuestionRepository;
//    private final Random random = new Random();
//
//    public JavaQuestionServiceImpl(@Qualifier("JavaQuestionRepository") QuestionRepository javaQuestionRepository) {
//        this.javaQuestionRepository = javaQuestionRepository;
//    }
//
//    @Override
//    public Question add(String question, String answer) {
//        Question addQuestion = new Question(question, answer);  //creating new object of Question
//        javaQuestionRepository.add(addQuestion);  //adding
//        return addQuestion;
//    }
//
//    @Override
//    public Question add(Question question) {  //no need to create a new object, as in argument there is ready object
//        javaQuestionRepository.add(question);
//        return question;
//    }
//
//    @Override
//    public Question remove(Question question) {
////        if (javaQuestionRepository.contains(question)) {
//            javaQuestionRepository.remove(question);
//            return question;
//        }
////       return null;
//
//
//    @Override
//    public Collection<Question> getAll() {
//        return Set.copyOf(javaQuestionRepository.getAll());
//    }
//
//    @Override
//    public Question getRandomQuestion() {
//        int randomIndex = new Random().nextInt(javaQuestionRepository.getAll().size());    //creating new Random object
//        List<Question> questionStream = javaQuestionRepository.getAll().stream()           //to get the index need to convert set to list
//                .toList();                                                 // or .collect(Collectors.toList())
//        return questionStream.get(randomIndex);
//    }
////    public Question getRandomQuestion() {
////        return List.copyOf(questionStorage).get(random.nextInt(questionStorage.size()));
//
//
////        List<Question> questionList = List.copyOf(questions);  Version 1
////        ArrayList<Question> questionArrayList = new ArrayList<>(questions);  Version 2
////        ArrayList<Question> questionsAddAll = new ArrayList<>();  //Version 4
////        questionsAddAll.addAll(questions);
//}
