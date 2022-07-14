public class MusicianFeastlll {
        public static void main(String args[]){
            findStolenNumber(new int[]{1,2,3,5,6,7,8,9,10}); // should print 4
            findStolenNumber(new int[]{1,2,3,4,5,6,7,8,10}); // should print 9
            findStolenNumber(new int[]{1,2,3,4,5,6,7,8,9,10}); // should print "no number was stolen"
        }

        public static void findStolenNumber(int[] numbers){
            if(numbers==null){
                System.out.println("You must pass a valid array");
                return;
            }

            int missingNumber = -1;
            for( int i = 0; i < numbers.length -1; i++) {
                if(numbers[i+1] != numbers[i]+1){
                    missingNumber = numbers[i]+1;
                    System.out.println("Here is your stolen number: " + missingNumber);
                    break;


                }
            }
            if (missingNumber == -1){
                System.out.println("No Number Was Stolen");
            }
        }

    }


