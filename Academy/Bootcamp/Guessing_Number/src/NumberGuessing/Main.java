package NumberGuessing;

public class Main {


    public static void main(String[] args) {

    Players player1 = new Players("P1");
    Players player2 = new Players("P2");

     guessNumber(player1,player2,1,2);



    }

    public static void guessNumber(Players player1, Players player2, int min, int max){
       int secretNumber = computerNumber(min, max);

       while (true){
          int P1 = player1.setNumber(min, max);
          int P2 = player2.setNumber(min, max);

          if (secretNumber == P1 && secretNumber == P2) {
              ;
              System.out.println("Draw");
              break;
          }
          if (secretNumber == P1){
              System.out.println(player1.getName() + " guessed the secret number.");
              break;
          }
          if (secretNumber == P2) {
              System.out.println(player2.getName() + " guessed the secret number.");
              break;
          }

           }
       }

    public static int computerNumber(int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }

    }


