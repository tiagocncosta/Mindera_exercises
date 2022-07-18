public class Client {

    private String name;
    private int id;

    private Bank bank;

    private Account account;

    public Client(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void withdrawMoney (int amount){
        bank.withdrawMoney(amount);
    }
    public void pay(int amount){
        bank.subtractMoney(amount);
    }
    public void addMoney(int amount){
        bank.addMoney(amount);
    }
    public void getBalance(){
        bank.getBalance();
    }
    public void cardGenerator(){
        bank.cardGenerator();
    }
    public void createAccount(int id){
        bank.createAccount(id);
    }

    public void checkAccount (){
        bank.checkAccount(this.id);
    }

}
