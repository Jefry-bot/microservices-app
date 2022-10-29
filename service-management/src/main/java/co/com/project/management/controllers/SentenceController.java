package co.com.project.management.controllers;

import co.com.project.common.dtos.Response;
import co.com.project.common.dtos.management.sentence.SentenceDTO;
import co.com.project.common.utils.ResponseBuilder;
import co.com.project.management.services.SentenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Sentences")
@CrossOrigin(originPatterns = "*")
public class SentenceController {
    private final SentenceService service;

    @GetMapping
    public Response<List<SentenceDTO>> findAll(Pageable pageable) {
        return ResponseBuilder.success(service.findAll(pageable));
    }

    @GetMapping("/{id}")
    public Response<SentenceDTO> findById(@PathVariable Long id) {
        return ResponseBuilder.success(service.findById(id));
    }

    @PostMapping
    public Response<Void> save(@RequestBody SentenceDTO sentence) {
        return ResponseBuilder.success(() -> service.save(sentence));
    }

    @DeleteMapping("/{id}")
    public Response<Void> delete(@PathVariable Long id) {
        return ResponseBuilder.success(() -> service.delete(id));
    }
}
