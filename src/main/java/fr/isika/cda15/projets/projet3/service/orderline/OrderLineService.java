package fr.isika.cda15.projets.projet3.service.orderline;

import fr.isika.cda15.projets.projet3.entity.OrderLine;
import fr.isika.cda15.projets.projet3.entity.Product;
import fr.isika.cda15.projets.projet3.service.Service;

public interface OrderLineService extends Service<OrderLine> {
    Double calculateSubtotal(Product product, Integer quantity);
}
