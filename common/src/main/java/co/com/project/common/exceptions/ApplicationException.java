package co.com.project.common.exceptions;

import co.com.project.common.enums.ErrorStatus;

public class ApplicationException extends RuntimeException {
    protected ErrorStatus errorStatus;


    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, ErrorStatus errorStatus) {
        super(message);
        this.errorStatus = errorStatus;
    }
}
