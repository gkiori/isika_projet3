package fr.isika.cda15.projets.projet3.service.crowdfunding;

import fr.isika.cda15.projets.projet3.domaine.exception.UserAlreadyExistsException;
import fr.isika.cda15.projets.projet3.entity.Crowdfunding;
import fr.isika.cda15.projets.projet3.repository.crowdfunding.CrowdfundingDao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class CrowdfundingServiceImpl implements CrowdfundingService {

    @Inject
    private CrowdfundingDao crowdfundingDao;

    /**
     * @param id
     * @return
     */
    @Override
    public Crowdfunding findCrowdunfingById(Long id) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Crowdfunding> findAllCrowdunfing() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Crowdfunding> sortByAssociation() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Crowdfunding> sortByTag() {
        return null;
    }

    /**
     * @param crowdfunding
     * @return
     * @throws UserAlreadyExistsException
     */
    @Override
    public Crowdfunding createService(Crowdfunding crowdfunding) throws UserAlreadyExistsException {
        return null;
    }

    /**
     * @param crowdfunding
     */
    @Override
    public void updateService(Crowdfunding crowdfunding) {

    }

    /**
     * @param id
     */
    @Override
    public void deleteService(Long id) {

    }

    /**
     * @param id
     * @return
     */
    @Override
    public Crowdfunding findByIdService(Long id) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Crowdfunding> findAllService() {
        return null;
    }
}
