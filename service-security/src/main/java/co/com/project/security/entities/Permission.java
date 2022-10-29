package co.com.project.security.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "PERMISSION_TABLE")
public class Permission extends EntityBase {
    @Column(name = "NAME")
    private String name;

    @Column(name = "TOKEN")
    private String token;
}
