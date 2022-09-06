package co.com.project.common.dtos;

import lombok.Data;

@Data
public class Response<T> {
    private T data;

    private String message;

    private Integer status;
}
