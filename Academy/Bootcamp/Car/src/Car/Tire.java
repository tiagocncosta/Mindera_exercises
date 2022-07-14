package Car;

public class Tire {
    private  int tireLife;

    public Tire (){
        tireLife = 1000;
    }

    public  int getTireLife() {
        return (tireLife);
    }


    public  boolean tireTear(int percentageOfTireLoss){
        tireLife -= percentageOfTireLoss;
        if(tireLife < 1){
            return false;
        }
        return true;
    }

    public void setNewTire(){
        tireLife = 100;
    }

}
