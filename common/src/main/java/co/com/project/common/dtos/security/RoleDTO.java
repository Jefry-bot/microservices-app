package co.com.project.common.dtos.security;

import co.com.project.common.dtos.EntityBaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class RoleDTO extends EntityBaseDTO {
    private String name;
    private String description;
    private List<PermissionDTO> permissions;
}
