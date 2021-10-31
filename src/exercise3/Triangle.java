package exercise3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double area,p;
        do{
            boolean nas=a>0 && b>0 && c>0 && a+b>c && b+c>a && c+a>b;
            if (nas) {

                p = (a + b + c) / 2;
                area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println("Area: " + area);

                if (a == b && b == c) {
                    System.out.println("Triangle: equilateral");
                    break;
                } else if (a == b || b==c || a==c) {
                    System.out.println("Triangle: isosceles");
                    break;
                } else {
                    System.out.println("Triangle: scalene");
                    break;
                }
            }else{
                System.out.println("Values are not correct!");
            }

        }while(a>0 && b>0 && c>0);


    }
}
