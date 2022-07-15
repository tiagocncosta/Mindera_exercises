public class Main {

    public static void main(String[] args) {
        Client Mary = new Client("Mary");
        Restaurant r = new Restaurant(5);
        r.freeTable(r);

        Mary.setRestaurant(r);

        Mary.askForTable();

        Mary.order("lobster");






    }


}
