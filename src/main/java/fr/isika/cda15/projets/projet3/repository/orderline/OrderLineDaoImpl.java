package fr.isika.cda15.projets.projet3.repository.orderline;

import fr.isika.cda15.projets.projet3.entity.OrderLine;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class OrderLineDaoImpl implements OrderLineDao {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * @param orderLine
     * @return
     */
    @Override
    public OrderLine create(OrderLine orderLine) {
        return null;
    }

    /**
     * @param orderLine
     */
    @Override
    public void update(OrderLine orderLine) {

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
    public OrderLine findById(Long id) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<OrderLine> findAll() {
        return null;
    }
}
