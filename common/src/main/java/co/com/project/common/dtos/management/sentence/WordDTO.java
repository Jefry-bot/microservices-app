package co.com.project.common.dtos.management.sentence;

import co.com.project.common.dtos.EntityBaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class WordDTO extends EntityBaseDTO {
    private String value;
}
