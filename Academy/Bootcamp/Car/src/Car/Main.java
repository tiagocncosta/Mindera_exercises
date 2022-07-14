package Car;

public class Main {
    public static void main(String[] args) {


        Car car = new Car("Mercedes", "pink");

        for (int i = 0; i < 100; i++) {

            if( !car.accelerate(i)){
                car.changeTyres();
                car.getRefuelled();
            }

        }



    }
}