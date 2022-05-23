package fr.isika.cda15.projets.projet3.repository.crowdfunding;

import fr.isika.cda15.projets.projet3.entity.Crowdfunding;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class CrowdfundingDaoImpl implements CrowdfundingDao {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * @param crowdfunding 
     * @return
     */
    @Override
    public Crowdfunding create(Crowdfunding crowdfunding) {
        return null;
    }

    /**
     * @param crowdfunding 
     */
    @Override
    public void update(Crowdfunding crowdfunding) {

    }

    /**
     * @param id 
     */
    @Override
    public void delete(Long id) {

    }

    /**
     * @param id 
     * @return
     */
    @Override
    public Crowdfunding findById(Long id) {
        return null;
    }

    /**
     * @return 
     */
    @Override
    public List<Crowdfunding> findAll() {
        return null;
    }
}
