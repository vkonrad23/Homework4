import java.util.Scanner;

public class Main6T2 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a string: ");
            String str = scanner.nextLine();

            // Print the string uppercased.
            System.out.println("The string in uppercase is: " + str.toUpperCase());

            // Ask the user if they want to continue.
            System.out.println("Do you want to continue? (Y/N)");
            char c = scanner.next().charAt(0);

            // Repeat the dialog if the user types y or Y.
            while (c == 'y' || c == 'Y') {
                System.out.println("Enter a string: ");
                str = scanner.nextLine();

                System.out.println("The string in uppercase is: " + str.toUpperCase());

                System.out.println("Do you want to continue? (Y/N)");
                c = scanner.next().charAt(0);
            }

            // Exit the loop if the user types any other character.
            System.out.println("Goodbye!");

            scanner.close();
        }
    }



