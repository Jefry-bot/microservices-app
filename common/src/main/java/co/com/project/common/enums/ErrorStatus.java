package co.com.project.common.enums;

import lombok.Getter;

@Getter
public enum ErrorStatus {

    NOT_FOUND(404), INTERNAL_SERVER_ERROR(500), OK(200);

    private final Integer value;

    ErrorStatus(Integer value) {
        this.value = value;
    }
}
