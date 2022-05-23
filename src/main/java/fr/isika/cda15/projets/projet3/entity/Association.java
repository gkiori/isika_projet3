package fr.isika.cda15.projets.projet3.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "associations")
public class Association {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String email;
    private String theme;
    private String description;
    private byte[] image;
    private String publishStatus;
    @Temporal(TemporalType.DATE)
    private Date inscriptionDate;
    @OneToOne
    @JoinColumn(name = "admin_asso_id")
    private UserAccount adminAsso;

    @OneToOne
    @JoinColumn()
    private Subscription subscription;

    @OneToMany
    @JoinColumn()
    private List<Product> productList;

    @OneToMany
    @JoinColumn()
    private List<Crowdfunding> crowdfundings;

    public Association() {
        this.productList = new ArrayList<>();
        this.crowdfundings = new ArrayList<>();
    }

    public Association(String name, String email, String description) {
        this.name = name;
        this.email = email;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Date getInscriptionDate() {
        return inscriptionDate;
    }

    public void setInscriptionDate(Date inscriptionDate) {
        this.inscriptionDate = inscriptionDate;
    }

    public UserAccount getAdminAsso() {
        return adminAsso;
    }

    public void setAdminAsso(UserAccount adminAsso) {
        this.adminAsso = adminAsso;
    }

    public Subscription getSouscription() {
        return subscription;
    }

    public void setSouscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Crowdfunding> getCrowdfundings() {
        return crowdfundings;
    }

    public void setCrowdfundings(List<Crowdfunding> crowdfundings) {
        this.crowdfundings = crowdfundings;
    }
}