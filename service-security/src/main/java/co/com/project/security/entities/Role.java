package co.com.project.security.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "_ROLE")
public class Role extends EntityBase {
    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "ROLE_PERMISSION",
                joinColumns = @JoinColumn(name = "ROLE_ID"),
                inverseJoinColumns = @JoinColumn(name = "PERMISSION_ID"))
    private List<Permission> permissions;
}
