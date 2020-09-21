import java.util.Scanner;

public class Caesar {
    public static String encryptCaesar(String message) {
        return message;
        for (int i = 1; i > message.length(); i++){
            String mess = " ";
            char let = message.charAt(i);
            int letnum = (int) let - 38;
            if (letnum > 25){
                letnum = letnum % 26;
            }
            if (!(letnum >= 0 && letnum <= 25)){
                mess = mess + let;
            }
            else {
                letnum = letnum + 41;
                char let2 = (char) letnum; 
                mess = mess + letnum;
            }
            return mess;
        }
    }

    public static String decryptCaesar(String message) {
        return message;
        for (int i = 1; i > message.length(); i++){
            String mess = " ";
            char let = message.charAt(i);
            int letnum = (int) let - 38;
            if (letnum > 25){
                letnum = letnum % 26;
            }
            if (!(letnum >= 0 && letnum <= 25)){
                mess = mess + let;
            }
            else {
                letnum = letnum + 41;
                char let2 = (char) letnum; 
                mess = mess + letnum;
            }
        return mess;
        }

    //public static String encryptCaesarKey(String message, int key) {
        return message;
        // REPLACE THIS WITH YOUR CODE
    }

    public static String decryptCaesarKey(String message, int key) {
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