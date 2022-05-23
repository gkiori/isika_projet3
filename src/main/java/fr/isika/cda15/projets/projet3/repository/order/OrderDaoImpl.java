package fr.isika.cda15.projets.projet3.repository.order;

import fr.isika.cda15.projets.projet3.entity.Order;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class OrderDaoImpl implements OrderDao {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * @param order
     * @return
     */
    @Override
    public Order create(Order order) {
        return null;
    }

    /**
     * @param order
     */
    @Override
    public void update(Order order) {

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
    public Order findById(Long id) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Order> findAll() {
        return null;
    }
}
