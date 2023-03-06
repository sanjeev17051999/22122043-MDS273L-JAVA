import java.util.Scanner;

public class lab5 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true; // initilize Boolean variable for break the do while loop
        // start do....while loop for menu driven pro.
        do {
            System.out.println("\n********************************************");
            System.out.println("1. encryption\n2. decryption\n3. Exit"); // display choices
            System.out.print("Enter Your Choice: "); // user choice
            int ch = Integer.parseInt(scan.nextLine());
            String enc;
            String dec;
            switch (ch) {
                case 1: // for encypt
                    System.out.print("Enter The text to Encryption: ");
                    enc = scan.nextLine();
                    dec = encryption(enc.toUpperCase()); // convert to encrypt method call
                    System.out.println("\n Decrypt massage is: " + dec); // display encrypt massage
                    break;
                case 2: // for decrypt
                    System.out.print("Enter The text to decryption: ");
                    dec = scan.nextLine();
                    enc = decryption(dec.toUpperCase());// convert to decrypt method call
                    System.out.println("\n Encrypt massage is: " + enc);// display decrypt massage
                    break;
                case 3: // for Exit
                    flag = false;
                    break;

                default:
                    break;
            }

        } while (flag); // loop break condition

    }

    static String encryption(String str) {
        String newst = ""; // define a variable
        char c = ' ';
        // start for loop for encrypt perticuler char
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i); // assign a char by the index
            int x = a;

            if (x >= 65 && x <= 90) { // validate range of char ascii value
                int y = x + 23;
                if (y > 90) {
                    y = y - 26;
                }
                c = (char) y;
            } else {
                c = str.charAt(i);
            }
            newst = newst + c;// concadinate string
        }

        return newst; // return encrypt massage
    }

    static String decryption(String str) {
        String newst = "";
        char c = ' ';
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);// assign a char by the index
            int x = a;

            if (x >= 65 && x <= 90) { // validate range of char ascii value
                int y = x - 23;
                if (y < 65) {
                    y = y + 26;
                }
                c = (char) y;
            } else {
                c = str.charAt(i);
            }
            newst = newst + c; // concadinate string
        }

        return newst;// return decrypt massage
    }

}