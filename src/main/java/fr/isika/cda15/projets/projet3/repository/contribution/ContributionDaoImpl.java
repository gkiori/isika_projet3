package fr.isika.cda15.projets.projet3.repository.contribution;

import fr.isika.cda15.projets.projet3.entity.Contribution;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ContributionDaoImpl implements ContributionDao {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * @param contribution 
     * @return
     */
    @Override
    public Contribution create(Contribution contribution) {
        return null;
    }

    /**
     * @param contribution 
     */
    @Override
    public void update(Contribution contribution) {

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
    public Contribution findById(Long id) {
        return null;
    }

    /**
     * @return 
     */
    @Override
    public List<Contribution> findAll() {
        return null;
    }
}
