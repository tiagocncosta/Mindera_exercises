package intro_to_java.level4;


    public class StringToPhoneNumberConverter {

        private static final String[] phoneKeys = {" ", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", "*"};

        public static void main(String[] args) {
            String conversion = convert("WMABEHTZ ");
            System.out.println(conversion); // 962234891
        }

        /*
         * The phoneKeys array is meant to represent the keys on your phone. EX: phoneKeys[1] represents the key 2.
         * Look at your phone, if it's unclear what I mean.
         *
         * Your objective here is to create a method that takes a 9 character String
         * and translates it into a phone number, using the array phoneKeys.
         * */
        private static String convert(String str) {
            String number = "";
            for (int i = 0; i < str.length(); i++){
                for (int h = 0; h < phoneKeys.length; h++){
                    for (int j = 0; j < phoneKeys[h].length(); j++){
                        if (str.charAt(i) == phoneKeys[h].charAt(j)){
                           number += String.valueOf(h+1);
                        }
                    }
                }

            }
            return number;
        }
    }


