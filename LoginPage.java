package Abstraction;

public class LoginPage extends Pages {
    @Override
    public void header() {
        System.out.println("Login page -Header");
    }

    @Override
    public void title() {
        System.out.println("Login page -title");
    }

    public void login(String un, String pwd) {
        System.out.println("LP - login");
        System.out.println("login with " + un + "and" + pwd);
    }
}