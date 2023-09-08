import java.awt.*;
import java.util.Scanner;

public class QuadraticEquation {
    public double a;
    public double b;
    public double c;

    void input() {
        Scanner ascanner = new Scanner(System.in);
        a = ascanner.nextDouble();
        Scanner bscanner = new Scanner(System.in);
        b = bscanner.nextDouble();
        Scanner cscanner = new Scanner(System.in);
        c = cscanner.nextDouble();
        Dialog.isEnteredValues(a, b, c);
    }
    void calculate() {
        double delta = b * b - 4 * a * c;
        System.out.println("Delta: " + delta);

        if (delta < 0)
            Dialog.isNoSolution();

        else {
            if (delta == 0) {
                double x0 = -b / (2 * a);
                Dialog.isOneSolution(x0);
            }

            if (delta > 0) {
                double x1 = (-b - Math.sqrt(delta)) / 2 * a;
                double x2 = (-b + Math.sqrt(delta)) / 2 * a;
                Dialog.isTwoSolution(x1, x2);
            }
        }
    }
}
class Dialog {
    static void isEnteredValues(double a, double b, double c)
    {
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
    }


    static void isNoSolution()
    {
        System.out.println("No solution.");
    }

    static void isOneSolution(double x0)
    {
        System.out.println("x0: " + x0);
    }
    static void isTwoSolution(double x1, double x2)
    {
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
    }
}
class Calculation {

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.input();
        quadraticEquation.calculate();
    }
}