import java.util.Scanner;

public class Caesar {
    public static String encryptCaesar(String message) {
        String n = new String();
        for(int i = 0; i < message.length(); i++)
        {   
            int c = message.charAt(i);
            if ((c >=97 && c <= 122)||(c >=65 && c <= 90)){
            c += 3;
            if((c > 90 && c < 97) || c> 122){
                c -= 26;
            }}
            n += (char) c;
        }
        return n;
        // REPLACE THIS WITH YOUR CODE
    }

    public static String decryptCaesar(String message) {
        String n = new String();
        for(int i = 0; i < message.length(); i++)
        {
            int c = message.charAt(i);
            if ((c >=97 && c <= 122)||(c >=65 && c <= 90)){
            c -= 3;
            if((c > 90 && c < 97) || c < 65){
                c += 26;
            }}
            n += (char) c;
        }
        return n;
        // REPLACE THIS WITH YOUR CODE
    }

    public static String encryptCaesarKey(String message, int key) {
        String n = new String();
        key %= 26;
        for(int i = 0; i < message.length(); i++)
        {
            int c = message.charAt(i);
            if ((c >=97 && c <= 122)||(c >=65 && c <= 90)){
            c += key;
            if((c > 90 && c < 97) || c> 122){
                c -= 26;
            }}
            n += (char) c;
        }
        return n;
        // REPLACE THIS WITH YOUR CODE
    }

    public static String decryptCaesarKey(String message, int key) {
        String n = new String();
        key%=26;
        for(int i = 0; i < message.length(); i++)
        {
            int c = message.charAt(i);
            if ((c >=97 && c <= 122)||(c >=65 && c <= 90)){
            c -= key;
            if((c > 90 && c < 97) || c < 65){
                c += 26;
            }}
            n += (char) c;
        }
        return n;
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
            int key = scan.nextInt();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptCaesarKey(message, key));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            int key = scan.nextInt();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptCaesarKey(message, key));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
