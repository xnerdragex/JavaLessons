import java.util.Scanner;
import java.lang.String;

class Examples {

    //Example 1 - Print Statement
    public static void main(String[] args) {
        String name = "Manny";
        System.out.println("Hello my name is " + name + "!");
    }

    /* Example 2 - Branching (if/else)
    public static void main(String[] args) {
        int x = 1;
        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }
        if (x == 3) {
            System.out.print("Do");
        }
    }
    */

    /* Example 3 - Loops
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the loop");
        while (x < 5) {
            System.out.println("In the loop");
            x = x + 1;
        }
        System.out.println("Out of the loop");
    }
    */


    /* Example 4 - Loop within a Branch
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before any testing");
        if (x < 5) {
            while (x != 5) {
                System.out.println("X is not 5");
                x = x + 1;
            }
        } else {
            System.out.println("Congrats X should be 5");
        }
        System.out.println("This concludes the branch loop test");
    }
    */

    /* Example 5 - Looping with count
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Test Starting");
        while (x <6) {
            System.out.println("X is equal to " + x);
            x = x + 1;
        }
        System.out.println("Test Ending");
    }
    */

    /* Example 6 - Branching inside of loop with boolean test
    public static void main(String[] args) {
        int x = 1;
        while (x < 6) {

            if (x == 1) {
                System.out.print("Hello, ");
                x = x + 1;
            }
            if (x == 2) {
                System.out.print("my ");
                x = x + 1;
            }
            if (x == 3) {
                System.out.print("name ");
                x = x + 1;
            }
            if (x == 4) {
                System.out.print("is ");
                x = x + 1;
            }
            if (x == 5) {
                System.out.print("Manny ");
                x = x + 1;
            }
        }
        System.out.print("!");
    }
    */

    /* Example 7 - Using Scanner for input from user (still learning)
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 25) {
            System.out.println("You're still young!");
        } else {
            System.out.println("You old haha!");
        }
    }
    */

    /*
    public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println("Enter your first name:");
        System.out.println("=======================");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();

        System.out.println("=======================");
        System.out.println("Enter your last name:");
        System.out.println("=======================");
        Scanner scanner1 = new Scanner(System.in);
        String b = scanner1.next();

        System.out.println("=======================");
        System.out.println("Enter your age:");
        System.out.println("=======================");
        Scanner scanner2 = new Scanner(System.in);
        int c = scanner2.nextInt();

        System.out.println("Welcome " + a + " " + b + ", you are " + c + " years old!" );
    }
    */


}