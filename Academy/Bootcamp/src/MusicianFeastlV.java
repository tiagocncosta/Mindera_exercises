public class MusicianFeastlV {

    public static void main(String[] args){
        String[] musicians = {"Steven Tyler", "Erykah Badu", "Mick Jagger", "Paul McCartney", "Brandon Flowers", "Alex Turner"};

        String musician = pickMusician(musicians);

        System.out.println(musician);// should return the musician's name, or "No one will stay to help."
    }

    public static String pickMusician(String[] musicians){
        int randomNumber = (int) (Math.random() * 6) + 10;

        for (String musician : musicians)
            if (musician.length() > randomNumber){
                return (musician + " you stay to help cleaning, the others can go");
            }
        return ("No one will stay to help");
    }
}



