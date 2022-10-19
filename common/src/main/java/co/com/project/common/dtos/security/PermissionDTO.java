package co.com.project.common.dtos.security;

import co.com.project.common.dtos.EntityBaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PermissionDTO extends EntityBaseDTO {
    private String name;
    private String token;
}
