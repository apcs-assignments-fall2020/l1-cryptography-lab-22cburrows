import java.util.Scanner;

public class Vigenere {
    public static char encryptVigenereKey(char lett, char k){
        if (lett >= 97 && lett <= 122){
            int letnum = lett - (97 - k);
            if (letnum > 25 && letnum <= (25 + k)){
                letnum = letnum % 26;
            }
            int letnum2 = letnum + 97;
            lett = (char) letnum2;
            } 
        else if (lett >= 65 && lett <= 90){
            int letnum = lett - (65 - k);
            if (letnum > 25 && letnum <= (25 + k)){
                letnum = letnum % 26;
            }
            int letnum3 = letnum + 65;
            lett = (char) letnum3;
            }
        else {

            }
        return lett;
    }
    public static String encryptVigenere(String message, String key) {
        String mess = "";
        int lenmess = message.length();
        char key2 = (char) (key.charAt(lenmess % i)
        for (int i = 0; i < lenmess; i++){
            char let = message.charAt(i); 
            char key2 = key.charAt(lenmess % i);
            if (key2 >= 97 && key2 <= 122){
                key2 = key2 - 97;
            else{
                key2 = key2 - 65;
            }
           mess += encryptVigenereKey(let, key2);
        }
        return mess;
    }

    public static String decryptVigenereKey(String message, int key) {
        String mess = "";
        int lenmess = message.length();
        int key2 = key % 26;
        for (int i = 0; i < lenmess; i++){
            char let = message.charAt(i);
            if (let >= 97 && let <= 122){
                int letnum = let - 97;
                if (letnum > -1 && letnum < key2){
                    letnum = letnum + 26;
                }
                letnum = letnum + (97 - key);
                let = (char) letnum;
                mess += let;
                } 
            else if (let >= 65 && let <= 90){
                int letnum = let - 65;
                if (letnum > -1 && letnum < key2){
                    letnum = letnum + 26;
                }
                letnum = letnum + (65 - key2);
                let = (char) letnum;
                mess += let;
                }
            else{
                mess = mess + let;
            }
        }
        return mess;
    }

    public static String decryptVigenere(String message, String key) {
        return message;
        // REPLACE THIS WITH YOUR CODE
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptVigenere(message, key));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptVigenere(message, key));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
