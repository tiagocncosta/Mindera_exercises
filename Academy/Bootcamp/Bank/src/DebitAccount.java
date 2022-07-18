public class DebitAccount extends Account {

    public DebitAccount(int id, String bank) {
        super(id, bank);
        typeOfAccount = "Debit";

    }

    @Override
    public void createAccount(int id, String bank) {
        super.createAccount(id, bank);
    }

    @Override
    public void subtractMoney(int amount) {
        if (balance - amount <= 0){
            System.out.println("You don't have enough money in your debit account");
            return;
        }
        super.subtractMoney(amount);
    }
}
