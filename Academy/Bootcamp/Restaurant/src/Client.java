public class Client {

    private Table table;
    private String name;


    private Restaurant restaurant;

    public Client(String name) {
        this.name = name;
    }

    public void setRestaurant(Restaurant restaurant){
        this.restaurant = restaurant;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public boolean checkTable(){
        if(this.table != null){
            return true;
        }
        return false;
    }


    public boolean checkRestaurantPresence(){
        if (this.restaurant != null){
            return true;
        }
        return false;
    }
    public void askForTable() {
        if (checkRestaurantPresence()) {
            System.out.println("Can i get a table ?");
            if (!checkTable()) {
                restaurant.findTable(restaurant);
                setTable(restaurant.findTable(restaurant));

            } else {
                System.out.println("You already have a table!");

            }
            

        }   else   System.out.println("You need to get a restaurant");
    }

    public void order(String order){
        if (!checkTable()){
            System.out.println("You need to get a table first");
        } else System.out.println("Here is your " + order);
    }
}
