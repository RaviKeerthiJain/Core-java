class Shopping {
    double calculatePrice(double p1) {
        return p1;
    }

    double calculatePrice(double p1, double p2) {
        return p1 + p2;
    }

    double calculatePrice(double p1, double p2, double p3) {
        return p1 + p2 + p3;
    }
}

public class ShoppingApp {
    public static void main(String[] args) {
        Shopping shop = new Shopping();
        System.out.println("One product: " + shop.calculatePrice(499.0));
        System.out.println("Two products: " + shop.calculatePrice(499.0, 299.0));
        System.out.println("Three products: " + shop.calculatePrice(499.0, 299.0, 150.0));
    }
    
}
