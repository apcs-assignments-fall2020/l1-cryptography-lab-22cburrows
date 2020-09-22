//worked with Rasika on this

import java.util.Scanner;

public class Caesar {
    public static String encryptCaesar(String message) {
        String mess = "";
        int lenmess = message.length();
        for (int i = 0; i < lenmess; i++){
            char let = message.charAt(i);
            if (let >= 97 && let <= 122){
                int letnum = let - 94;
                if (letnum > 25 && letnum < 29){
                    letnum = letnum % 26;
                }
                int letnum2 = letnum + 97;
                let = (char) letnum2;
                mess += let;
                } 
            else if (let >= 65 && let <= 90){
                int letnum = let - 62;
                if (letnum > 25 && letnum < 29){
                    letnum = letnum % 26;
                }
                int letnum3 = letnum + 65;
                let = (char) letnum3;
                mess += let;
                }
            else{
                mess = mess + let;
            }
        }
        return mess;
        }

    public static String decryptCaesar(String message) {
        String mess = "";
        int lenmess = message.length();
        for (int i = 0; i < lenmess; i++){
            char let = message.charAt(i);
            if (let >= 97 && let <= 122){
                int letnum = let - 97;
                if (letnum > -1 && letnum < 3){
                    letnum = letnum + 26;
                }
                letnum = letnum + 94;
                let = (char) letnum;
                mess += let;
                } 
            else if (let >= 65 && let <= 90){
                int letnum = let - 65;
                if (letnum > -1 && letnum < 3){
                    letnum = letnum + 26;
                }
                letnum = letnum + 62;
                let = (char) letnum;
                mess += let;
                }
            else{
                mess = mess + let;
            }
        }
        return mess;
    }

    public static String encryptCaesarKey(String message, int key) {
        String mess = "";
        int lenmess = message.length();
        for (int i = 0; i < lenmess; i++){
            char let = message.charAt(i);
            if (let >= 97 && let <= 122){
                int letnum = let - (97 - key);
                if (letnum > 25 && letnum <= (25 + key)){
                    letnum = letnum % 26;
                }
                int letnum2 = letnum + 97;
                let = (char) letnum2;
                mess += let;
                } 
            else if (let >= 65 && let <= 90){
                int letnum = let - (65 - key);
                if (letnum > 25 && letnum <= (25 + key)){
                    letnum = letnum % 26;
                }
                int letnum3 = letnum + 65;
                let = (char) letnum3;
                mess += let;
                }
            else {
                mess = mess + let;
            }
        }
        return mess;
    }

    public static String decryptCaesarKey(String message, int key) {
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


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptCaesar(message));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptCaesar(message));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}