package fr.isika.cda15.projets.projet3.repository.subscription;

import fr.isika.cda15.projets.projet3.entity.Subscription;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class SubscriptionDaoImpl implements SubscriptionDao {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * @param subscription
     * @return
     */
    @Override
    public Subscription create(Subscription subscription) {
        return null;
    }

    /**
     * @param subscription
     */
    @Override
    public void update(Subscription subscription) {

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
    public Subscription findById(Long id) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Subscription> findAll() {
        return null;
    }
}
