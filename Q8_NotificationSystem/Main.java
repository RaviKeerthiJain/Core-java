class Notification {
    void sendNotification() {
        System.out.println("Sending a notification...");
    }
}

class EmailNotification extends Notification {
    @Override
    void sendNotification() {
        System.out.println("Email: You have a new email in your inbox.");
    }
}

class SMSNotification extends Notification {
    @Override
    void sendNotification() {
        System.out.println("SMS: Your OTP is 482916.");
    }
}

class PushNotification extends Notification {
    @Override
    void sendNotification() {
        System.out.println("Push: Your order has been shipped!");
    }
}

public class Main {
    public static void main(String[] args) {
        Notification[] list = {
            new EmailNotification(),
            new SMSNotification(),
            new PushNotification()
        };
        for (Notification n : list) {
            n.sendNotification();
        }
    }
}
