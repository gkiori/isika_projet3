package fr.isika.cda15.projets.projet3.service.association;

import fr.isika.cda15.projets.projet3.entity.*;
import fr.isika.cda15.projets.projet3.service.Service;

import java.util.List;

public interface AssociationService extends Service<Association> {
    Product createProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Product product);
    Product findByProductId(Long id);
    List<Product> findAllProduct();
    Long countProduct();
    Boolean existByIdProduct(Long id);


    void deleteOrder(Order order);
    void updateOrder(Order order);

    Crowdfunding createCrowdfunding(Crowdfunding crowdfunding);
    void updateCrowdfunding(Crowdfunding crowdfunding);
    void deleteCrowdfunding(Crowdfunding crowdfunding);
    Crowdfunding findByCrowdfundingId(Long id);
    List<Crowdfunding> findAllCrowdfunding();
    Long countCrowdfunding();
    Boolean existByIdCrowdfunding(Long id);

    Adhesion createAdhesion(Adhesion adhesion);
    void updateAdhesion(Adhesion adhesion);
    void deleteAdhesion(Adhesion adhesion);
    Adhesion findByAdhesionId(Long id);
    List<Adhesion> findAllAdhesion();
    Long countAdhesion();
    Boolean existByIdAdhesion(Long id);

    void deleteAdherent(UserAccount userAccount);

    Subscription createSubscription(Subscription subscription);
    void updateSubscription(Subscription subscription);
}
