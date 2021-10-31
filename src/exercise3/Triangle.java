package exercise3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double area, p;
        do {
            boolean nas = a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && c + a > b;
            if (nas) {

                p = (a + b + c) / 2;
                area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println("Area: " + area);

                if (a == b && b == c) {
                    System.out.println("Triangle: equilateral");
                    break;
                } else if (a == b || b == c || a == c) {
                    System.out.println("Triangle: isosceles");
                    break;
                } else {
                    System.out.println("Triangle: scalene");
                    break;
                }
            } else {
                System.out.println("Values are not correct!");
                break;
            }

        } while (a > 0 && b > 0 && c > 0);
    }
}*/
        Scanner input = new Scanner(System.in);

        double a, b, c;
        do {
            a = input.nextDouble();
            b = input.nextDouble();
            c = input.nextDouble();

            boolean correct = a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
            if (correct) {
                double s = (a + b + c) / 2;
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println("Area: " + area);

                if (a == b && b == c) {
                    System.out.println("Triangle: equilateral");
                } else if (a == b || a == c || b == c) {
                    System.out.println("Triangle: isosceles");
                } else {
                    System.out.println("Triangle: scalene");
                }


            } else {
                System.out.println("Values are not correct!");
            }
        } while (a > 0 && b > 0 && c > 0);
    }
}





