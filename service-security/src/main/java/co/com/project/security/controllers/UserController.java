package co.com.project.security.controllers;

import co.com.project.common.dtos.Response;
import co.com.project.common.dtos.security.UserDTO;
import co.com.project.common.utils.ResponseBuilder;
import co.com.project.security.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
@CrossOrigin(originPatterns = "*")
public class UserController {
    private final UserService service;

    @GetMapping
    public Response<List<UserDTO>> findAll(Pageable pageable) {
        return ResponseBuilder.success(service.findAll(pageable));
    }

    @PostMapping("/login")
    public Response<String> verify(@RequestBody UserDTO user, Pageable pageable) {
        AtomicBoolean status = new AtomicBoolean(false);

        service.findAll(pageable).forEach(userDTO -> {
            if(user.getUsername().equalsIgnoreCase(userDTO.getUsername()) && user.getPassword().equals(userDTO.getPassword())) {
                 status.set(true);
            }
        });
        return ResponseBuilder.success(status.get() ? "verify" : "no");
    }

    @GetMapping("/{id}")
    public Response<UserDTO> findById(@PathVariable Long id) {
        return ResponseBuilder.success(service.findById(id));
    }

    @PostMapping
    public Response<Void> save(@RequestBody UserDTO user) {
        return ResponseBuilder.success(() -> service.save(user));
    }

    @DeleteMapping("/{id}")
    public Response<Void> delete(@PathVariable Long id) {
        return ResponseBuilder.success(() -> service.delete(id));
    }
}
