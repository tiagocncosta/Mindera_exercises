package BearShop;

public class Shop {
    private int bearsCreated;
    private Bear bear;

    public Shop(){
        this.bearsCreated = 0;
    }

    public void createBears(int numberOfBears) {
            if (numberOfBears % 2 == 0 && numberOfBears % 5 == 0){
                System.out.println("The number of Bears is even, there will be add one Simple bear and one Cranky bear to the production!");
                Simple bear = new Simple();
                Cranky bear1 = new Cranky();
                bearsCreated += 2;
            }
            else if (numberOfBears % 5 == 0) {
                System.out.println("The number of Bear is a multiple of 5, there will be add one Cranky bear to the production!");
                Cranky bear = new Cranky();
                bearsCreated++;
            } else {
                System.out.println("The number of Bear is not even, neither a multiple of 5, we will add a Drunk bear to the production");
                Drunk bear = new Drunk();
                bearsCreated++;
            }
        for (int i = 0; i < numberOfBears; i++){
            randomBear();
            bearsCreated++;
        }

        }



    public void randomBear(){
        int a = (int) (Math.random()*2);
        if (a == 0){
        Simple bear = new Simple();
        } if (a == 1) {
            Cranky bear = new Cranky();
        } if (a ==2) {
            Drunk bear = new Drunk();
        }

    }
    public int getBearsCreated(){
        return bearsCreated;
    }

    public int numberOfBears(){
        int numberOfBears = (int) (Math.random()*100);
        return numberOfBears;
    }

    public static void mostBears(Shop shop1, Shop shop2) {
        System.out.println("Shop1 made " + shop1.bearsCreated + " Shop2 made " + shop2.bearsCreated);
        if (shop1.bearsCreated > shop2.bearsCreated) {
            System.out.println("Shop1 won the bear creation competition!");
        } else System.out.println("Shop2 won the bear creation competition!");
    }



}
