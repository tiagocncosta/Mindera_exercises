public class CreditAccount extends Account {

    public CreditAccount(int id, String bank) {
        super(id, bank);
        typeOfAccount = "Credit";
    }

    @Override
    public void subtractMoney(int amount) {
        if (balance - amount <= -100){
            System.out.println("You don't have enough money in your credit account");
            return;
        }
        super.subtractMoney(amount);
        if (balance - amount >= 0){
            System.out.println("You can use your credit card without fees");
            return;
        }
        System.out.println("You will pay more 5€ for using your credit account");
        balance -= 5;
    }

}
