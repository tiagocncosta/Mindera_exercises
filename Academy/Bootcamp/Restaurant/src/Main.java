public class Main {

    public static void main(String[] args) {
        Client Mary = new Client("Mary");
        Restaurant r = new Restaurant(5);
        r.freeTable(r);

        Mary.askForTable();
        r.findTable(r);

        r.tables[1].isFree();



    }


}
