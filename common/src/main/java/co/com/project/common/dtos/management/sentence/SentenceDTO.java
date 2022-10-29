package co.com.project.common.dtos.management.sentence;

import co.com.project.common.dtos.EntityBaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class SentenceDTO extends EntityBaseDTO {
    private String value;
    private List<WordDTO> words;
}
