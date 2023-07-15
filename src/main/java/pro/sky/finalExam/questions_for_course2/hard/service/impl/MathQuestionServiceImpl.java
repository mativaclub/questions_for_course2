package pro.sky.finalExam.questions_for_course2.hard.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pro.sky.finalExam.questions_for_course2.hard.model.Question;
import pro.sky.finalExam.questions_for_course2.hard.service.QuestionService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
@Service
@Component("MathQuestionServiceImpl")
public class MathQuestionServiceImpl implements QuestionService {

    private final List<Question> mathQuestions = new ArrayList<>();

    @Override
    public Question add(String question, String answer) {
        Question question1 = new Question(question, answer);
        return add(question1);
    }

    @Override
    public Question add(Question question) {
        if (!mathQuestions.contains(question)) {
            mathQuestions.add(question);
        }
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (mathQuestions.contains(question)) {
            mathQuestions.remove(question);
            return question;
        }
        return null;
    }

    @Override
    public Collection<Question> getAll() {
        return mathQuestions;
    }

    @Override
    public Question getRandomQuestion() {
        int random = new Random().nextInt(mathQuestions.size()); //Random random = new Random();int index = random.nextInt(mathQuestions.size());
        return mathQuestions.get(random);
    }
}
