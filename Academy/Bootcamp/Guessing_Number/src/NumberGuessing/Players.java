package NumberGuessing;

public class Players {

    private String name;


    public Players(String name) {
        this.name = name;

}

    public int setNumber(int min, int max) {
         return (int) (Math.random() * (max - min + 1) + min);
    }

   public String getName() {
        return name;
    }

}
