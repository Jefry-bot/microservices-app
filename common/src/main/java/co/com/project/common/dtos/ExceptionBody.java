package co.com.project.common.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName = "init")
public class ExceptionBody {
    private String filename;
    private String method;
    private String clazz;
    private String message;
    private String localizedMessage;
    private Integer line;
}