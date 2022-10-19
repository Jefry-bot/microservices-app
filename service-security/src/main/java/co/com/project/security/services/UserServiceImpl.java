package co.com.project.security.services;

import co.com.project.common.dtos.security.UserDTO;
import co.com.project.security.entities.User;
import co.com.project.security.exceptions.NotUserFoundException;
import co.com.project.security.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final EntityManager em;

    @Setter(onMethod_ = @Autowired)
    private ModelMapper mapper;

    @Override
    @Transactional(readOnly = true)
    public UserDTO findById(Long id) {
        return repository
                .findById(id)
                    .map(user -> mapper.map(user, UserDTO.class))
                        .orElseThrow(NotUserFoundException::new);
    }

    @Override
    @Transactional(readOnly = true)
    public List<UserDTO> findAll(Pageable pageable) {
        return repository
                 .findAll(pageable)
                    .stream()
                        .map(user -> mapper.map(user, UserDTO.class))
                    .toList();
    }

    @Override
    @Transactional
    public void save(UserDTO user) {
        em.merge(mapper.map(user, User.class));
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
