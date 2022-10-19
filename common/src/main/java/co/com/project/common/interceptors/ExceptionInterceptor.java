package co.com.project.common.interceptors;

import co.com.project.common.dtos.Response;
import co.com.project.common.enums.ErrorStatus;
import co.com.project.common.exceptions.ApplicationException;
import co.com.project.common.exceptions.NotFoundException;
import co.com.project.common.utils.ExceptionBuilder;
import co.com.project.common.utils.JsonUtility;
import co.com.project.common.utils.ResponseBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ExceptionInterceptor {

    @ExceptionHandler(Exception.class)
    public Response<String> exceptionInterceptor(Exception exception) {
        log.error(JsonUtility.toJson(ExceptionBuilder.build(exception)));

        return ResponseBuilder.failed(exception);
    }

    @ExceptionHandler(ApplicationException.class)
    public Response<String> applicationException(ApplicationException exception) {
        log.error(JsonUtility.toJson(ExceptionBuilder.build(exception)));

        return ResponseBuilder.failed(exception);
    }

    @ExceptionHandler(NotFoundException.class)
    public Response<String> notFoundException(NotFoundException exception) {
        log.error(JsonUtility.toJson(ExceptionBuilder.build(exception)));

        return ResponseBuilder.failed(exception, ErrorStatus.NOT_FOUND);
    }
}
