package fr.isika.cda15.projets.projet3.service.association;

import fr.isika.cda15.projets.projet3.entity.*;
import fr.isika.cda15.projets.projet3.repository.association.AssociationDao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class AssociationServiceImpl implements AssociationService {

    @Inject
    private AssociationDao associationDao;

    /**
     * @param association 
     * @return
     */
    @Override
    public Association createService(Association association) {
        return associationDao.create(association);
    }

    /**
     * @param association 
     */
    @Override
    public void updateService(Association association) {
        associationDao.update(association);
    }

    /**
     * @param id 
     */
    @Override
    public void deleteService(Long id) {
        associationDao.delete(id);
    }

    /**
     * @param id 
     * @return
     */
    @Override
    public Association findByIdService(Long id) {
        return associationDao.findById(id);
    }

    /**
     * @return 
     */
    @Override
    public List<Association> findAllService() {
        return associationDao.findAll();
    }


    /**
     *
     * @param product
     * @return
     */
    @Override
    public Product createProduct(Product product) {
        return null;
    }

    /**
     *
     * @param product
     */
    @Override
    public void updateProduct(Product product) {

    }

    /**
     *
     * @param product
     */
    @Override
    public void deleteProduct(Product product) {

    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Product findByProductId(Long id) {
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Product> findAllProduct() {
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public Long countProduct() {
        return null;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Boolean existByIdProduct(Long id) {
        return null;
    }

    /**
     *
     * @param order
     */
    @Override
    public void deleteOrder(Order order) {

    }

    /**
     *
     * @param order
     */
    @Override
    public void updateOrder(Order order) {

    }

    /**
     *
     * @param crowdfunding
     * @return
     */
    @Override
    public Crowdfunding createCrowdfunding(Crowdfunding crowdfunding) {
        return null;
    }

    /**
     *
     * @param crowdfunding
     */
    @Override
    public void updateCrowdfunding(Crowdfunding crowdfunding) {

    }

    /**
     *
     * @param crowdfunding
     */
    @Override
    public void deleteCrowdfunding(Crowdfunding crowdfunding) {

    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Crowdfunding findByCrowdfundingId(Long id) {
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Crowdfunding> findAllCrowdfunding() {
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public Long countCrowdfunding() {
        return null;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Boolean existByIdCrowdfunding(Long id) {
        return null;
    }

    /**
     *
     * @param adhesion
     * @return
     */
    @Override
    public Adhesion createAdhesion(Adhesion adhesion) {
        return null;
    }

    /**
     *
     * @param adhesion
     */
    @Override
    public void updateAdhesion(Adhesion adhesion) {

    }

    /**
     *
     * @param adhesion
     */
    @Override
    public void deleteAdhesion(Adhesion adhesion) {

    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Adhesion findByAdhesionId(Long id) {
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Adhesion> findAllAdhesion() {
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public Long countAdhesion() {
        return null;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Boolean existByIdAdhesion(Long id) {
        return null;
    }

    /**
     *
     * @param userAccount
     */
    @Override
    public void deleteAdherent(UserAccount userAccount) {

    }

    /**
     *
     * @param subscription
     * @return
     */
    @Override
    public Subscription createSubscription(Subscription subscription) {
        return null;
    }

    /**
     *
     * @param subscription
     */
    @Override
    public void updateSubscription(Subscription subscription) {

    }
}
