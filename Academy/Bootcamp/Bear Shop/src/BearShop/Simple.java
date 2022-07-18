package BearShop;

public class Simple extends Bear{
    public Simple(){

    }

    @Override
    public void bearTalk(){
        if(hasBattery()){
            battery --;
            System.out.println(talk);
        } else
        System.out.println("Need to charge!");;
    }


}
