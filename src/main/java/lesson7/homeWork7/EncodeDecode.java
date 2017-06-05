package lesson7.homeWork7;




import java.util.Scanner;

/**
 * Created by Yevhen on 09.05.2017.
 */
public class EncodeDecode {

 public static void main(String[] args) {

     System.out.println("Welcome to Ceasar pls enter the word ");
     System.out.println("This is your encoded phrase " + ">>> " + wordEncode() + " <<<");
     System.out.println("Please enter a encoded phrase to recheck");
     System.out.println("Recheck is complete: " + ">>> " + wordDecode() + " <<<");
 }

    public static StringBuilder wordEncode() {


            String alphabet = new String("abcdefghijklmnopqrstuvwxyz");
            Scanner scanner = new Scanner(System.in);
            String wordToEncode = scanner.nextLine();

            StringBuilder encodedWord = new StringBuilder(wordToEncode);
            for (int i = 0; i < wordToEncode.length(); i++) {
                char c = wordToEncode.charAt(i);
                encodedWord.setCharAt(i, alphabet.charAt(alphabet.indexOf(c) + 3 % 26));

            }

            return encodedWord;

        }



    public static StringBuilder wordDecode() {

        String alphabet1 = new String("abcdefghijklmnopqrstuvwxyz");

        Scanner scanner = new Scanner(System.in);
        String wordToDecode = scanner.nextLine();

        StringBuilder decodedWord = new StringBuilder(wordToDecode);
        for (int i = 0; i < decodedWord.length(); i++) {
            char c = decodedWord.charAt(i);
            decodedWord.setCharAt(i, alphabet1.charAt(alphabet1.indexOf(c) - 3 % 26));

        }

        return decodedWord;

    }
}