package fr.isika.cda15.projets.projet3.service.cart;

import fr.isika.cda15.projets.projet3.entity.OrderLine;
import fr.isika.cda15.projets.projet3.repository.order.OrderDao;
import fr.isika.cda15.projets.projet3.repository.orderline.OrderLineDao;
import fr.isika.cda15.projets.projet3.repository.useraccount.UserAccountDao;

import javax.ejb.Stateful;
import javax.inject.Inject;
import java.util.List;

@Stateful
public class CartServiceImpl implements CartService {

    @Inject
    private UserAccountDao userAccountDao;
    @Inject
    private OrderLineDao orderLineDao;
    @Inject
    private OrderDao orderDao;

    /**
     * @param oderLineList
     * @return
     */
    @Override
    public Double calculateTotal(List<OrderLine> oderLineList) {
        return null;
    }

    /**
     *
     */
    @Override
    public void emptyCart() {

    }

    /**
     * @param orderLine
     */
    @Override
    public void deleteOrderLine(OrderLine orderLine) {

    }
}
