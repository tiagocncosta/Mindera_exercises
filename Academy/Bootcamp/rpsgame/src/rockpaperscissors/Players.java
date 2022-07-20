package rockpaperscissors;

public class Players {
    private String name;
    private String playerMove;

    public Players(String name) {
        this.name = name;
        this.playerMove = "";
    }

    public String getName() {

        return this.name;
    }

    public void setPlayerMove(String playerMove) {

        this.playerMove = playerMove;
    };

    public String getPlayerMove(){

        return playerMove;
    }

    public void getChoices() {
        Choices [] choices = Choices.values();

        for (Choices choice : choices){
            System.out.println(choice);
        }
    }

}
