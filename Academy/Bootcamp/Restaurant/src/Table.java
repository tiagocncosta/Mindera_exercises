public class Table {


    private Boolean isFree;

    public Table(){
        this.isFree = true;

    }

    public boolean isFree() {
      return isFree;
    }


    public void occupy() {
        isFree = false;
    }

    public void setFree() {
        isFree = true;
    }
}
