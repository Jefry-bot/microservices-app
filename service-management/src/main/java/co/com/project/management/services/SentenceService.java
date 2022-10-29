package co.com.project.management.services;

import co.com.project.common.dtos.management.sentence.SentenceDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SentenceService {
    SentenceDTO findById(Long id);
    List<SentenceDTO> findAll(Pageable pageable);
    void save(SentenceDTO sentence);
    void delete(Long id);
}
