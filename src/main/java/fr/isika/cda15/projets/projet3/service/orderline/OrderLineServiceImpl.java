package fr.isika.cda15.projets.projet3.service.orderline;

import fr.isika.cda15.projets.projet3.domaine.exception.UserAlreadyExistsException;
import fr.isika.cda15.projets.projet3.entity.OrderLine;
import fr.isika.cda15.projets.projet3.entity.Product;
import fr.isika.cda15.projets.projet3.repository.orderline.OrderLineDao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class OrderLineServiceImpl implements OrderLineService{

    @Inject
    private OrderLineDao orderLineDao;

    /**
     * @param product 
     * @param quantity
     * @return
     */
    @Override
    public Double calculateSubtotal(Product product, Integer quantity) {
        return null;
    }

    /**
     * @param orderLine 
     * @return
     * @throws UserAlreadyExistsException
     */
    @Override
    public OrderLine createService(OrderLine orderLine) throws UserAlreadyExistsException {
        return null;
    }

    /**
     * @param orderLine 
     */
    @Override
    public void updateService(OrderLine orderLine) {

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
    public OrderLine findByIdService(Long id) {
        return null;
    }

    /**
     * @return 
     */
    @Override
    public List<OrderLine> findAllService() {
        return null;
    }
}
