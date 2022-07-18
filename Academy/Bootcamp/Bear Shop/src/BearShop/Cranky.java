package BearShop;

public class Cranky extends Bear {

    private String lastMessage;
    private boolean lastMessageUsed;

    public Cranky() {
    this.lastMessage = "I'm so lonelyyy";
    this.lastMessageUsed = false;
    }

    @Override
    public void bearTalk() {

        if (!hasBattery()){
            System.out.println("You need to chargeeee!");
        }
        if (getBattery() > 0 && lastMessageUsed == true) {
                battery--;
            }
        if (getBattery() < 50 && lastMessageUsed == false) {
            battery--;
            useLastMessage();
            System.out.println(lastMessage);
        }
        if (getBattery() >= 50)  {
            battery--;
            System.out.println(talk);
        }
        }

    public void useLastMessage() {
        this.lastMessageUsed = true;
    }

    public String getLastMessage() {
        return lastMessage;
    }
}

