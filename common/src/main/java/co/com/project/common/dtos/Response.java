package co.com.project.common.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName = "init")
public class Response<T> {
    private T data;
    private String message;
    private Integer status;
}
