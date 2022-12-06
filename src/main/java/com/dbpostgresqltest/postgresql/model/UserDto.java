package com.dbpostgresqltest.postgresql.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
public class UserDto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;
    @Column(name = "full_name")
    private String fullName;
    private String email;
    @Column(name = "birth_date")
    private LocalDate birthDate;

    @OneToMany(mappedBy = "userDto")
    List<PurchaseDto> purchaseDtos;

    public UserDto() {
    }

    public UserDto(String fullName, String email, LocalDate birthDate) {
        this.fullName = fullName;
        this.email = email;
        this.birthDate = birthDate;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
