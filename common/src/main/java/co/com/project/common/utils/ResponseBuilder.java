package co.com.project.common.utils;

import co.com.project.common.dtos.ExceptionBody;
import co.com.project.common.dtos.Response;
import co.com.project.common.enums.ErrorStatus;
import co.com.project.common.exceptions.NotFoundException;
import lombok.experimental.UtilityClass;
import org.springframework.http.HttpStatus;

@UtilityClass
public class ResponseBuilder {
    private final String MESSAGE = "Success process in server";

    public <T> Response<T> success(T data) {
        return Response
                    .<T>init()
                        .data(data)
                        .message(MESSAGE)
                        .status(200)
                    .build();
    }

    public Response<Void> success(ApplicationFunction func) {
        func.apply();

        return Response
                    .<Void>init()
                        .message(MESSAGE)
                        .status(200)
                    .build();
    }

    public Response<String> failed(Throwable exception) {
        return Response
                    .<String>init()
                        .message(exception.getMessage())
                        .status(500)
                    .build();
    }

    public Response<String> failed(NotFoundException exception) {
        return Response
                    .<String>init()
                        .message(exception.getMessage())
                        .status(404)
                    .build();
    }

    public Response<String> failed(Throwable exception, HttpStatus status) {
        return Response
                    .<String>init()
                        .message(exception.getMessage())
                        .status(status.value())
                    .build();
    }

    public Response<String> failed(Throwable exception, ErrorStatus status) {
        return Response
                    .<String>init()
                        .message(exception.getMessage())
                        .status(status.getValue())
                    .build();
    }

}
