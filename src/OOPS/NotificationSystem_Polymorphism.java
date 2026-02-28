package OOPS;
//Superclass
class Notification {
 void send(String message) {
     System.out.println("Sending generic notification: " + message);
 }
}

//Subclass 1
class EmailNotification extends Notification {
 void send(String message) {
     System.out.println("📧 Email sent: " + message);
 }
}

//Subclass 2
class SMSNotification extends Notification {
 void send(String message) {
     System.out.println("📱 SMS sent: " + message);
 }
}

//Subclass 3
class WhatsAppNotification extends Notification {
 void send(String message) {
     System.out.println("💬 WhatsApp message: " + message);
 }
}

public class NotificationSystem_Polymorphism {
	public static void main(String[] args) {
		Notification n;

        n = new EmailNotification();
        n.send("Welcome to our platform!");

        n = new SMSNotification();
        n.send("Your OTP is 123456");
        
        n = new WhatsAppNotification();
        n.send("Order shipped successfully.");


	}

}
