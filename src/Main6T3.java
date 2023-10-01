import java.util.Scanner;

public class Main6T3 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Continue <Y/N>");
                char againChar = scanner.nextLine().toUpperCase().charAt(0);
                if (againChar != 'Y') {
                    break;
                }

                System.out.println("Hello!");
                System.out.print("Tell me your name ");
                String name = scanner.nextLine();

                System.out.print("Hi, " + name + "! How old are you? ");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.print("What is your favorite book genre? ");
                String genre = scanner.nextLine();

                if (age >= 13 && age <= 16) {
                    if (genre.equals("detective")) {
                        System.out.println("Read Sherlock Holmes");
                    }
                } else if (age >= 17 && age <= 25) {
                    if (genre.equals("non-fiction")) {
                        System.out.println("Read Party Lines");
                    }
                } else {
                    System.out.println("Sorry, we don't have recommendations for your age group.");
                }

                System.out.println("Enjoy your reading!!!");
            }

    }
}
