package fr.isika.cda15.projets.projet3.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_accounts")
@NamedQuery(name = "UserAccount.findByEmail", query = "select ua from UserAccount ua where ua.email = :email_param")
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String username;
    private String email;
    private String phone;
    private String address;
    private String password;
    @OneToMany
    @JoinColumn()
    private List<Order> orders;
    @OneToMany
    @JoinColumn()
    private List<Contribution> contributions;
    @OneToMany
    @JoinColumn()
    private List<Cotisation> cotisations;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}