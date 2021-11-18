package Abstraction;

public interface AusBank {
    public void onlineBanking();
    //After JDK 1.8 - you can have method body in interface using default method.

    default void creditCard(){
        System.out.println("Aus Bank ---- Credit Card");

    }
}
