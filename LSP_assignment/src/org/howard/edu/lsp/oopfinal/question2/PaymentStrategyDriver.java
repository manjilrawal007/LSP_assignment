package org.howard.edu.lsp.oopfinal.question2;

//Define Payment interface
interface Payment {
 void makePayment(double amount);
}

//Concrete CreditCard class
class CreditCard implements Payment {
 private String cardNumber;

 public CreditCard(String cardNumber) {
     this.cardNumber = cardNumber;
 }

 @Override
 public void makePayment(double amount) {
     System.out.println("Paid " + amount + " using credit card " + cardNumber);
 }
}

//Concrete PayPal class
class PayPal implements Payment {
 private String email;

 public PayPal(String email) {
     this.email = email;
 }

 @Override
 public void makePayment(double amount) {
     System.out.println("Paid " + amount + " using PayPal account " + email);
 }
}

//Concrete Bitcoin class
class Bitcoin implements Payment {
 private String address;

 public Bitcoin(String address) {
     this.address = address;
 }

 @Override
 public void makePayment(double amount) {
     System.out.println("Paid " + amount + " using Bitcoin address " + address);
 }
}

//ShoppingCart class
class ShoppingCart {
 private Payment paymentMethod;

 public void setPaymentMethod(Payment paymentMethod) {
     this.paymentMethod = paymentMethod;
 }

 public void checkout(double amount) {
     paymentMethod.makePayment(amount);
 }
}

//PaymentDriver class
public class PaymentStrategyDriver {
 public static void main(String[] args) {
     ShoppingCart cart = new ShoppingCart();

     // Credit card payment
     cart.setPaymentMethod(new CreditCard("1234-5678-9012-3456"));
     cart.checkout(100.0);

     // PayPal payment this is for the paypal for the acount
     cart.setPaymentMethod(new PayPal("user@example.com"));
     cart.checkout(50.0);

     // Bitcoin payment
     cart.setPaymentMethod(new Bitcoin("1AaBbCcDdEeFfGgHh"));
     cart.checkout(75.0);
 }
}
