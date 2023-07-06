package pro.sky.finalExam.questions_for_course2.hard.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ExamException extends RuntimeException{

    public ExamException() {
    }
}
