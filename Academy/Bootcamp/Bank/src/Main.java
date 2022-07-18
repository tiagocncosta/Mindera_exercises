public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("j",2);
        Bank bank1 = new Bank("bank1");
        Account account1 = new DebitAccount(2,"bank1");
        client1.createAccount(2);
        bank1.setAccount(account1);
        client1.setBank(bank1);
        client1.checkAccount();
        client1.cardGenerator();
        client1.addMoney(100);
        client1.pay(10);
        client1.getBalance();


    }
}
