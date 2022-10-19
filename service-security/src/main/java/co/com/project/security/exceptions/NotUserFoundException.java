package co.com.project.security.exceptions;

import co.com.project.common.exceptions.NotFoundException;

public class NotUserFoundException extends NotFoundException {
    public NotUserFoundException() {
        super("Not found user in server.");
    }
}
