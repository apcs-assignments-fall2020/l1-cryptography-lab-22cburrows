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
        for (int i = 0; i < lenmess; i++){
            char let = message.charAt(i); 
            char key2 = key.charAt(i % lenmass);
            int key3 = Character.getNumericValue(key2);
            if (key3 >= 97 && key3 <= 122){
                key3 = key3 - 97;
            }
            else{
                key3 = key3 - 65;
            }
            char key4 = (char) key3;
            mess = mess + decryptVigenereKey(let, key4);
        }
        return mess;
    }

    public static char decryptVigenereKey(char lett, char k) {
        if (lett >= 97 && lett <= 122){
            int letnum = lett - 97;
            if (letnum > -1 && letnum < k){
                letnum = letnum + 26;
            }
            letnum = letnum + (97 - k);
            lett = (char) letnum;
        } 
        else if (lett >= 65 && lett <= 90){
            int letnum = lett - 65;
            if (letnum > -1 && letnum < k){
                letnum = letnum + 26;
            }
            letnum = letnum + (65 - k);
            lett = (char) letnum;
        }
        else{
        }
        return lett;
    }

    public static String decryptVigenere(String message, String key) {
        String mess = "";
        int lenmess = message.length();
        for (int i = 0; i < lenmess; i++){
            char let = message.charAt(i); 
            char key2 = key.charAt(i % lenmass);
            int key3 = Character.getNumericValue(key2);
            if (key3 >= 97 && key3 <= 122){
                key3 = key3 - 97;
            }
            else{
                key3 = key3 - 65;
            }
            char key4 = (char) key3;
            mess = mess + decryptVigenereKey(let, key4);
        }
        return mess;
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
