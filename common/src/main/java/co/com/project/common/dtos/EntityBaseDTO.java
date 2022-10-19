package co.com.project.common.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public abstract class EntityBaseDTO {
    private Long id;
    private LocalDate createAt;
    private LocalDate updateAt;
    private Boolean status;
}
