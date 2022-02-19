import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner loop = new Scanner(System.in);

        String continueStr;

        do {
            Scanner scn = new Scanner(System.in);

            System.out.println("(1) Temperature Converter, (2) Money Converter, (3) or Distance Converter?");

            int converter = scn.nextInt();


            switch (converter) {
                case 1:
                    celsiusConverter();
                    break;
                case 2:
                    cadConverter();
                    break;
                case 3:
                    kmConverter();
                    break;
                default:
                    System.out.println("Choose 1, 2, or 3 dumbass");
                    break;
            }

            System.out.println("Do you want to continue?");
            continueStr = loop.nextLine();

        } while (continueStr.equalsIgnoreCase("yes"));
    }

    static void celsiusConverter() {

        System.out.println("You have chosen temp converter!");
        System.out.println("What is the temperature in fahrenheit?");
        Scanner temp = new Scanner(System.in);
        double a = temp.nextDouble();
        double b = (a - 32) * 5 / 9;
        System.out.printf("The temperature is %s in celsius\n", b);

    }

    static void cadConverter() {

        System.out.println("You have chosen money converter!");
        System.out.println("How much money in USD do you have?");
        Scanner money = new Scanner(System.in);
        double a = money.nextDouble();
        double b = a * 1.27;
        System.out.printf("You have %s canadian dollars\n", b);

    }

    static void kmConverter() {

        System.out.println("You have chosen distance converter!");
        System.out.println("How many miles until your destination?");
        Scanner distance = new Scanner(System.in);
        double a = distance.nextDouble();
        double b = a * 1.609344;
        System.out.printf("You have %s kilometers to go\n", b);
    }
}
