package pro.sky.finalExam.questions_for_course2;

import org.junit.jupiter.api.Test;
import pro.sky.finalExam.questions_for_course2.easy.model.Question;
import pro.sky.finalExam.questions_for_course2.easy.service.impl.JavaQuestionServiceImpl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.finalExam.questions_for_course2.Constants.*;

public class JavaQuestionServiceImplTest {
    private JavaQuestionServiceImpl javaQuestionServiceImpl = new JavaQuestionServiceImpl(); //creating new object with whom will make tests

    @Test
    void shouldAddQuestion() {
        Question expected = new Question(QUESTION_ONE, ANSWER_ONE);  //creating new object with expected question and answer
        Question actual = javaQuestionServiceImpl.add(QUESTION_ONE, ANSWER_ONE); //actually adding question with method add
        assertEquals(expected, actual);  //checking if they are equal
        assertEquals(1, javaQuestionServiceImpl.getAll().size());  //checking that now size is 1
        assertTrue(javaQuestionServiceImpl.getAll().contains(expected)); //checking that now get all contains our expected question
    }

    @Test
    void shouldRemoveQuestion() {
        Question expected = new Question(QUESTION_ONE, ANSWER_ONE);  //creating new object that is expected Question answer why?
        javaQuestionServiceImpl.add(expected); //adding this expected question object
        Question actual = javaQuestionServiceImpl.remove(expected); //removing our expected question
        assertEquals(expected, actual); //checkin if they match
        assertEquals(0, javaQuestionServiceImpl.getAll().size());

    }

    @Test
    void shouldReturnAllQuestions() {
        Question question1 = javaQuestionServiceImpl.add(QUESTION_ONE, ANSWER_ONE);
        Question question2 = javaQuestionServiceImpl.add(QUESTION_TWO, ANSWER_TWO);
        Question question3 = javaQuestionServiceImpl.add(QUESTION_THREE, ANSWER_THREE);
        Collection<Question> questions = new HashSet<>(Set.of(question1, question2, question3));
        assertEquals(questions, javaQuestionServiceImpl.getAll());
    }

    @Test
    void getRandomQuestionFromOne() {
        Question randomQuestion = javaQuestionServiceImpl.add(QUESTION_ONE, ANSWER_ONE);
        assertEquals(randomQuestion, javaQuestionServiceImpl.getRandomQuestion());
    }

    @Test
    void getRandomQuestionFromTwo() {
        Question question1 = javaQuestionServiceImpl.add(QUESTION_ONE, ANSWER_ONE);
        Question question2 = javaQuestionServiceImpl.add(QUESTION_TWO, ANSWER_TWO);
        Collection<Question> questions = new HashSet<>(Set.of(question1, question2));
        Question randomQuestion = javaQuestionServiceImpl.getRandomQuestion();
//        boolean checkActual = questions.contains(randomQuestion);
        assertTrue(questions.contains(randomQuestion)); //checking if really contains randomQuestion
    }

}
