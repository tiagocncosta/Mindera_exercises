package Car;



public class Engine {


    private int power;
    private int fuelLevel;

    private int range;


    public Engine() {
        this.range = 10;
        this.fuelLevel = 100;

    }

    public boolean canItRun(int fuel) {
        if (fuelLevel - fuel < 0) {
            return true;
        }
        return false;
    }

    public int generateEnergy(int fuel) {
        if (canItRun(fuel)) {
            return 0;
        }
        fuelLevel -= fuel;
        return fuel * range;
    }

    public void refuel() {
        fuelLevel = 100;
    }
}




