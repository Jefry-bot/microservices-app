package co.com.project.management.exceptions;

import co.com.project.common.exceptions.NotFoundException;

public class NotSentenceFoundException extends NotFoundException {
    public NotSentenceFoundException() {
        super("Not found sentence in server");
    }
}
