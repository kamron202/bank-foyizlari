import javax.security.sasl.SaslClient;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("NBU Bank");
        for (; ; ) {




            System.out.println("Next -> 1");
            System.out.println("Quit -> 2");
            System.out.print("= ");

            int n = scanner.nextInt();
            if (n == 1) {
                System.out.print("Name write: ");
                scanner = new Scanner(in);
                String name = scanner.nextLine();
                System.out.print("Cart name write: ");
                int cart = scanner.nextInt();
                System.out.print("Write money: ");
                int money = scanner.nextInt();
                System.out.print("Year write: ");
                int year = scanner.nextInt();

                int p = 25;
                int res = 0;
                int f = money / 100 * p;


                for (int i = 1; i < year; i++) {
                    f *= i;
                    res = f + money;

                }

                System.out.println("Mr " + name + " " + res + " $");

            } else if (n == 0) {
                break;
            } else {
                System.out.println("Write incorrect number !!!");
            }

        }




    }
}