package BearShop;

public class Bear {
    String talk;
    int battery;

    public Bear(){
        this.talk = "I love you!";
        this.battery = 51;
    }

    public void bearTalk(){
    }
    public int getBattery(){
        return battery;
    }

    public Boolean hasBattery(){
        if (battery > 0){
            return true;
        }   return false;
    }
}
