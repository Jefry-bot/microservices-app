package co.com.project.management.services;

import co.com.project.common.dtos.management.sentence.SentenceDTO;
import co.com.project.management.entities.Sentence;
import co.com.project.management.exceptions.NotSentenceFoundException;
import co.com.project.management.repositories.SentenceRepository;
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
public class SentenceServiceImpl implements SentenceService {
    private final SentenceRepository repository;
    private final EntityManager em;

    @Setter(onMethod_ = @Autowired)
    private ModelMapper mapper;

    @Override
    @Transactional(readOnly = true)
    public SentenceDTO findById(Long id) {
        return repository
                .findById(id)
                .map(Sentence -> mapper.map(Sentence, SentenceDTO.class))
                .orElseThrow(NotSentenceFoundException::new);
    }

    @Override
    @Transactional(readOnly = true)
    public List<SentenceDTO> findAll(Pageable pageable) {
        return repository
                .findAll(pageable)
                .stream()
                .map(Sentence -> mapper.map(Sentence, SentenceDTO.class))
                .toList();
    }

    @Override
    @Transactional
    public void save(SentenceDTO sentence) {
        em.merge(mapper.map(sentence, Sentence.class));
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
