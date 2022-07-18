package BearShop;

public class Drunk extends Bear {

    private String fallaSleep;

    public Drunk(){
        this.fallaSleep = "zZzZzZz";

    }

    @Override
    public void bearTalk() {

        int a = (int) (Math.random()*5);

        if (a == 0) {
            battery --;
            System.out.println(fallaSleep);

        } if ( a > 0 ){
            battery --;
            System.out.println(talk);}

    }
}
