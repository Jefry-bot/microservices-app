package co.com.project.management.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "SENTENCES")
public class Sentence extends EntityBase {
    @Column(name = "VALUE")
    private String value;

    @OneToMany
    @JoinColumn(name = "SENTENCE_ID")
    private List<Word> words;
}
