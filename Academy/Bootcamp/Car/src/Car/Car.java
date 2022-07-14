package Car;


public class Car {
    private String brand;
    private String color;
    private  Engine engine;
    private Tire[] tires;
    private Radio radio;



    public Car(String brand, String color){
        this.brand = brand;
        this.color = color;
        this.engine = new Engine();
        this.tires = new Tire[]{new Tire(),new Tire(),new Tire(),new Tire()};
        this.radio = new Radio();
    }

    public boolean accelerate(int fuel){
        engine.generateEnergy(fuel);
        int distance = engine.generateEnergy(fuel);

        if (distance > 0 ) {

            if (!wornTyres(distance)){
                return false;
            }
            System.out.println("Vrum, vrum for " + distance + "km.");
            return true;
        }

        System.out.println("No vrum, vrum for you!");
        return false;
    }

    private boolean wornTyres(int distance) {
        for (Tire tire: tires) {
            if(!tire.tireTear(distance/10)){
                radio.play();
                return false;
            }
        }
        return true;
    }


    public void changeTyres(){
        this.tires = new Tire[]{new Tire(),new Tire(),new Tire(),new Tire()};
    }
    public String getBrand(String brand){
        return this.brand;
    }

    public String getColor(String color){
        return this.color;
    }
    public void getRefuelled(){
        engine.refuel();
    }
}





