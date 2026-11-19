class Food {
    String foodName;
    double price;

    Food(String foodName, double price) {
        this.foodName = foodName;
        this.price = price;
    }

    void displayFood() {
        System.out.println("Food Name  : " + foodName);
        System.out.println("Base Price : " + price);
    }
}

class Pizza extends Food {
    String size;

    Pizza(String foodName, double price, String size) {
        super(foodName, price);
        this.size = size;
    }

    double calculatePrice() {
        switch (size.toLowerCase()) {
            case "small":  return price;
            case "medium": return price * 1.5;
            case "large":  return price * 2;
            default:       return price;
        }
    }

    void displayPizza() {
        displayFood();
        System.out.println("Size       : " + size);
        System.out.println("Final Price: " + calculatePrice());
    }
}

public class Main {
    public static void main(String[] args) {
        Pizza p = new Pizza("Margherita Pizza", 200, "Large");
        p.displayPizza();
    }
}
