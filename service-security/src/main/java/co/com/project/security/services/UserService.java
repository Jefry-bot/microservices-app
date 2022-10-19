package co.com.project.security.services;

import co.com.project.common.dtos.security.UserDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    UserDTO findById(Long id);
    List<UserDTO> findAll(Pageable pageable);
    void save(UserDTO user);
    void delete(Long id);
}
