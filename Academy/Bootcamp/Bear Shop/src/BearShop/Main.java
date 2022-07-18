package BearShop;

public class Main {

    public static void main(String[] args) {


        Shop shop = new Shop();
        Shop shop2 = new Shop();

        shop.createBears(shop.numberOfBears());
        shop2.createBears(shop.numberOfBears());

        Shop.mostBears(shop, shop2);


        Drunk bear = new Drunk();
        Simple bear1 = new Simple();
        Cranky bear2 = new Cranky();


        bear.bearTalk();
        bear1.bearTalk();
        bear2.bearTalk();




    }



}
