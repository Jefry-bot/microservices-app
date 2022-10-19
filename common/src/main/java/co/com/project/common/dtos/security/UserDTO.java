package co.com.project.common.dtos.security;

import co.com.project.common.dtos.EntityBaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserDTO extends EntityBaseDTO {
    private String name;
    private String lastname;
    private String cellphone;
    private String phone;
    private List<RoleDTO> roles;
}
