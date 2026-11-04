class DeliveryPartner {
    void deliverOrder() {
        System.out.println("Delivery partner delivers the order.");
    }
}

class BikeDelivery extends DeliveryPartner {
    @Override
    void deliverOrder() {
        System.out.println("Bike delivery: Delivers the order quickly through traffic on a motorbike.");
    }
}

class CycleDelivery extends DeliveryPartner {
    @Override
    void deliverOrder() {
        System.out.println("Cycle delivery: Delivers nearby orders on a bicycle, eco-friendly and low cost.");
    }
}

class CarDelivery extends DeliveryPartner {
    @Override
    void deliverOrder() {
        System.out.println("Car delivery: Delivers large or long-distance orders safely in a car.");
    }
}

public class FoodDelivary {
    public static void main(String[] args) {
     DeliveryPartner partner;

        partner = new BikeDelivery();
        partner.deliverOrder();

        partner = new CycleDelivery();
        partner.deliverOrder();

        partner = new CarDelivery();
        partner.deliverOrder();
    
}
}
