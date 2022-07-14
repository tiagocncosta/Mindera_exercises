public class MusicianFeastll {

    public static void main(String[] args){
        generatePassword("Peter Gabriel"); // should print "G@br!el"
        generatePassword("Brian Adams"); // should print "@d@ms"
    }

    public static void generatePassword(String musicianName){
        int index = musicianName.lastIndexOf(" ");
        String lastName = musicianName
                .substring(index+1)
                .replaceAll("[aA]","@")
                .replaceAll("[iI]","!");
        String firstName = musicianName.substring(0,index+1);
        System.out.println(firstName + lastName);
    }

}
