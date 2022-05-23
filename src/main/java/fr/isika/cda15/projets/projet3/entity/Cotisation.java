package fr.isika.cda15.projets.projet3.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cotisation")
public class Cotisation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private Double amount;
    private Date cotisationDate;
    private byte[] invoice;
    @OneToOne
    @JoinColumn()
    private Payment payment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getCotisationDate() {
        return cotisationDate;
    }

    public void setCotisationDate(Date cotisationDate) {
        this.cotisationDate = cotisationDate;
    }

    public byte[] getInvoice() {
        return invoice;
    }

    public void setInvoice(byte[] invoice) {
        this.invoice = invoice;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}