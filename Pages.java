package Abstraction;

public abstract class Pages {
    public abstract void header();
    public abstract void title();

    public void logout(){
        System.out.println("Non-abstract method");
    }
}
