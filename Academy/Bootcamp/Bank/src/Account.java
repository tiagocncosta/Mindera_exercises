public class Account {

    public int balance;
    private int id;
    private String bank;
    public String typeOfAccount;
    public boolean doIHaveCard;

    private static Account[] accounts = new Account[8];

    public Account(int id, String bank) {
        this.balance = 0;
        this.id = id;
        this.bank = bank;
        this.typeOfAccount = "";
        this.doIHaveCard = false;
        for (int i= 0; 0 < accounts.length ; i++) {
            if (accounts[i] == null){
                accounts[i] = this;
                return;
            }
        }

    }
    public int checkAccount(int id, String bank){
        for (int i = 0; i < accounts.length ; i++) {
            if (accounts[i].id == id && accounts[i].bank.equals(bank)){
                return i;
            }
        }
        return -1;
    }

    public void createAccount(int id, String bank){
        if (checkAccount(id,bank) == -1){
            new Account(id,bank);
        }
    }

    public void cardGenerator(){
        if (doIHaveCard){
            System.out.println("You already have a card!");
            return;
        } doIHaveCard = true;
        System.out.println("Congrats, now you have a card!");
    }

    public int getBalance() {
        System.out.println(balance);
        return balance;
    }

    public void subtractMoney(int amount){
        if (!doIHaveCard){
            System.out.println("You have to ask for your card before you can use your account!");
            return;
        }
        balance -= amount;
    }
    public void addMoney(int amount){
        if (!doIHaveCard){
            System.out.println("You have to ask for your card before you can use your account!");
            return;
        }
        balance += amount;
    }



}
