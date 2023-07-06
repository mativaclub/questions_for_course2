package pro.sky.finalExam.questions_for_course2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.finalExam.questions_for_course2.easy.exceptions.ExamException;
import pro.sky.finalExam.questions_for_course2.easy.model.Question;
import pro.sky.finalExam.questions_for_course2.easy.service.QuestionService;
import pro.sky.finalExam.questions_for_course2.easy.service.impl.ExaminerServiceImpl;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static pro.sky.finalExam.questions_for_course2.Constants.*;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTestMock {

    @InjectMocks
    private ExaminerServiceImpl examinerServiceImpl;

    @Mock
    private QuestionService questionService;


    @Test
    void shouldGetAllQuestions() {
        Collection<Question> expectedQuestions = new ArrayList<>(List.of(new Question(QUESTION_ONE, ANSWER_ONE)));
        when(questionService.getAll()).thenReturn(expectedQuestions);
        when(questionService.getRandomQuestion()).thenReturn(new Question(QUESTION_ONE, ANSWER_ONE));
        assertEquals(questionService.getAll(), examinerServiceImpl.getQuestions(1));
    }


    @Test
    void shouldThrowExceptionWhenNumberOfQuestionsExceeded() {
        Collection<Question> expectedQuestions = new ArrayList<>(List.of(new Question(QUESTION_ONE, ANSWER_ONE),
                new Question(QUESTION_TWO, ANSWER_TWO)));
        when(questionService.getAll()).thenReturn(expectedQuestions);
        assertThrows(ExamException.class, () -> examinerServiceImpl.getQuestions(3));
    }

//    @Test
//    void shouldGetAllQuestions() {
//        Collection<Question> expectedQuestions = new HashSet<>(Set.of(
//                new Question(QUESTION_ONE, ANSWER_ONE),
//                new Question(QUESTION_TWO, ANSWER_TWO),
//                new Question(QUESTION_THREE, ANSWER_THREE)));
//        when(questionService.getAll()).thenReturn(expectedQuestions);
//        Random random = new Random();
//        List<Question> questionList = new ArrayList<>(expectedQuestions);
//        when(questionService.getRandomQuestion()).thenReturn(questionList.get(random.nextInt(expectedQuestions.size())));
////        when(questionService.getRandomQuestion()).thenReturn(new ArrayList<>(questions)
////                .get(new Random().nextInt(questions.size())));
//        assertTrue(examinerServiceImpl.getQuestions(expectedQuestions.size()).containsAll(expectedQuestions));
//        //checking if all questions of examinerServiceImpl contains our expected questions.
//    }


}
