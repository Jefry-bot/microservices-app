package co.com.project.security.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "USER_TABLE")
public class User extends EntityBase {
    @Column(name = "NAME")
    private String name;
    @Column(name = "LASTNAME")
    private String lastname;
    @Column(name = "CELLPHONE")
    private String cellphone;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLE",
        joinColumns = @JoinColumn(name = "USER_ID"),
        inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
    private List<Role> roles;
}