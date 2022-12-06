package com.dbpostgresqltest.postgresql.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "purchases")
public class PurchaseDto {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_purchase")
    private Long idPurchase;
    @Column(name = "id_user")
    private Long idUser;
    @Column(name = "date_purchase")
    private LocalDate datePurchase;

    @ManyToOne
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private UserDto userDto;

    public PurchaseDto() {
    }

    public PurchaseDto(Long idUser, LocalDate datePurchase) {
        this.idUser = idUser;
        this.datePurchase = datePurchase;
    }

    public Long getIdPurchase() {
        return idPurchase;
    }

    public void setIdPurchase(Long idPurchase) {
        this.idPurchase = idPurchase;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public LocalDate getDatePurchase() {
        return datePurchase;
    }

    public void setDatePurchase(LocalDate datePurchase) {
        this.datePurchase = datePurchase;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }
}
