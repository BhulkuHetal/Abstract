package Abstraction;

public class TestPage {
    public static void main(String[] args) {
        LoginPage Ip = new LoginPage();
        Ip.header();
        Ip.title();
        Ip.login("Admin ", " test 123");
        Ip.logout();
    }
}
