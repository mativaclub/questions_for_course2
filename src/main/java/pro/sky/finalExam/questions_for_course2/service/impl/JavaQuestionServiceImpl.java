package pro.sky.finalExam.questions_for_course2.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.finalExam.questions_for_course2.model.Question;
import pro.sky.finalExam.questions_for_course2.service.QuestionService;

import java.util.*;
@Service
public class JavaQuestionServiceImpl implements QuestionService {

    private final Set<Question> questionsStorage = new HashSet<>();


    @Override
    public Question add(String question, String answer) {
        Question addQuestion = new Question(question, answer);  //creating new object of Question
        questionsStorage.add(addQuestion);  //adding
        return addQuestion;
    }

    @Override
    public Question add(Question question) {  //no need to create a new object, as in argument there is ready object
        questionsStorage.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (questionsStorage.contains(question)) {
            questionsStorage.remove(question);
            return question;
        }
       return null;
    }

    @Override
    public Collection<Question> getAll() {
        return questionsStorage;
    }   //need copy of?

    @Override
    public Question getRandomQuestion() {
        int randomIndex = new Random().nextInt(questionsStorage.size());    //creating new Random object
        List<Question> questionStream = questionsStorage.stream()           //to get the index need to convert set to list
                .toList();                                                 // or .collect(Collectors.toList())
        return questionStream.get(randomIndex);
    }
//    public Question getRandomQuestion() {
//        return List.copyOf(questionStorage).get(random.nextInt(questionStorage.size()));


//        List<Question> questionList = List.copyOf(questions);  Version 1
//        ArrayList<Question> questionArrayList = new ArrayList<>(questions);  Version 2
//        ArrayList<Question> questionsAddAll = new ArrayList<>();  //Version 4
//        questionsAddAll.addAll(questions);
}
