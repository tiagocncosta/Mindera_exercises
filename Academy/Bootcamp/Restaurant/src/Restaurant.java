public class Restaurant {
    public Table[] tables;
    public Boolean fullCapacity;

    public Restaurant(int a) {
        this.tables = new Table[a];
        this.fullCapacity = false;

    }

    public void freeTable(Restaurant r) {
        for (int i = 0; i < r.tables.length; i++)
            r.tables[i] = new Table();

    }

    public void setFullCapacity(boolean fullCapacity) {
        fullCapacity = true;

    }

    public Boolean getFullCapacity() {
        return fullCapacity;
    }

    public void findTable(Restaurant restaurant) {
        if (restaurant.fullCapacity) {
            System.out.println("Sorry, we are full!");
        }
        for (int i = 0; i < restaurant.tables.length; i++) {
           if (restaurant.tables[i].isFree()){
                    System.out.println("There is a free table for you");
                    restaurant.tables[i].occupy();
           break;}


                }
            }
        }



