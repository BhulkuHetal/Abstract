package Abstraction;

public class BankTest {
    public static void main(String[] args) {

        IciciBank IC = new IciciBank();
        IC.savingAccount();
        IC.creditCard();
        IC.freeCashWithdrawals();
        IC.chequeBook();
        IC.noAdminFee();
        IC.onlineBanking();
        IC.timing();



    }
}
