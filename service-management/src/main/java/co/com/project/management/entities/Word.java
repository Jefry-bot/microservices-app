package co.com.project.management.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "WORDS")
public class Word extends EntityBase {
    @Column(name = "VALUE")
    private String value;
}
