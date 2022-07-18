public class Bank {

    private boolean doIHaveAccount;
    private boolean doIHaveCard;
    private Account account;
    private String name;

    public Bank(String name) {
        this.name = name;
        this.doIHaveAccount = doIHaveAccount;
        this.doIHaveCard = doIHaveCard;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public void checkAccount(int id){
        account.checkAccount(id, this.name);
    }
    public void withdrawMoney(int amount){
        if (account.typeOfAccount == "Credit"){
            System.out.println("You can't withdraw money in your credit account");
            return;
        }
        subtractMoney(amount);
    }
    public void subtractMoney(int amount){
        account.subtractMoney(amount);
    }
    public void addMoney(int amount){
        account.addMoney(amount);
    }
    public void getBalance(){
        account.getBalance();
    }
    public void cardGenerator(){
        if (doIHaveCard){
            System.out.println("You already have a card!");
            return;
        }
        account.cardGenerator();
    }
    public void createAccount(int id){
        Account account1 = new Account(id,this.name);
    }

}
