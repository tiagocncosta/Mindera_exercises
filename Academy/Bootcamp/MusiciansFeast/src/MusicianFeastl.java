public class MusicianFeastl {

    public static void main(String[] args){
        testDish("Bob Dylan", "beef wellington"); // should print true
        testDish("Mick Jagger", "mushroom soup"); // should print false
    }

    public static void testDish(String musicianName, String dish){
        Boolean x = musicianName.toLowerCase().charAt(0)==dish.charAt(0)
                && musicianName.toLowerCase().charAt(musicianName.length()-1) == dish.charAt(dish.length()-1);
        System.out.println(x);
    }
}