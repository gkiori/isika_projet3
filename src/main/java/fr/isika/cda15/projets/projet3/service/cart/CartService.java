package fr.isika.cda15.projets.projet3.service.cart;

import fr.isika.cda15.projets.projet3.entity.OrderLine;

import java.util.List;

public interface CartService {
    Double calculateTotal(List<OrderLine> oderLineList);
    void emptyCart();
    void deleteOrderLine(OrderLine orderLine);
}
