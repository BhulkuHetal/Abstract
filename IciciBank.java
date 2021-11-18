package Abstraction;

public class IciciBank implements USBank,UKBank, AusBank{


    @Override
    public void onlineBanking() {
        System.out.println("Aus Bank ----- Online Account");

    }

    @Override
    public void debitCard() {
        System.out.println("UK Bank ------ debit Account");


    }

    @Override
    public void chequeBook() {
        System.out.println("Uk Bank ---- Chequebook");

    }

    @Override
    public void freeCashWithdrawals() {
        System.out.println(" US Bank ---- Free Cash withdrawal");

    }

    @Override
    public void savingAccount() {
        System.out.println("US Bank ---- Saving Account");}
        //ICICI own rules
        public void noAdminFee(){
            System.out.println("ICICI- No Admin Fee");}

            public void timing(){
                System.out.println("ICICI ---- Sunday Closed");
        }

    }


