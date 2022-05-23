package fr.isika.cda15.projets.projet3.repository.payment;

import fr.isika.cda15.projets.projet3.entity.Payment;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class PaymentDaoImpl implements PaymentDao {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * @param payment 
     * @return
     */
    @Override
    public Payment create(Payment payment) {
        return null;
    }

    /**
     * @param payment 
     */
    @Override
    public void update(Payment payment) {

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
    public Payment findById(Long id) {
        return null;
    }

    /**
     * @return 
     */
    @Override
    public List<Payment> findAll() {
        return null;
    }
}
