package OOPS;

//Parent class (Super Class)
class Payment {
 void pay() {
     System.out.println("Payment method not specified");
 }
}

//Child class 1
class CreditCard extends Payment {
 void pay() {
     System.out.println("Paid using Credit Card");
 }
}

//Child class 2
class DebitCard extends Payment {
 void pay() {
     System.out.println("Paid using Debit Card");
 }
}

//Child class 3
class UPI extends Payment {
 void pay() {
     System.out.println("Paid using UPI");
 }
}
public class PaymentWithPolymorphism {
	public static void main(String[] args) {
		Payment p;  // Reference of superclass

        p = new CreditCard();
        p.pay();  // Output: Paid using Credit Card

        p = new DebitCard();
        p.pay();  // Output: Paid using Debit Card

        p = new UPI();
        p.pay();  // Output: Paid using UPI

	}

}
