package exceptionHandling.creatingexception.shopping;

public class Shopping {
    int availableStock;

    Shopping(int availableStock) {
        this.availableStock = availableStock;
    }

    void placeOrder(int requestedQuantity) throws InsufficientStockException {
        if (requestedQuantity > availableStock) {
            throw new InsufficientStockException("Insufficient stock. Available: " + availableStock);
        }
        availableStock -= requestedQuantity;
        System.out.println("Order confirmed for " + requestedQuantity + " item(s)");
    }
}
