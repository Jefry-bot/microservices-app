package co.com.project.common.exceptions;

import co.com.project.common.enums.ErrorStatus;

public class NotFoundException extends ApplicationException {
    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, ErrorStatus errorStatus) {
        super(message, errorStatus);
    }
}
