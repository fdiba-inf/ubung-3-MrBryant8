package exercise3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        int positiveC=0;
        int negativeC=0;
        int sum=0;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        sum+=number;
        float sum1 = sum;

        do {
           if (number>0){
               positiveC++;
           }else{
               negativeC++;
           }
           Scanner input1=new Scanner(System.in);
           System.out.println("Enter a number: ");
           number = input.nextInt();

        }while(number!=0);
        System.out.println("Positive numbers: "+ positiveC);
        System.out.println("Negative numbers: " + negativeC);
        System.out.println("Sum: " + sum1);
        System.out.println("Average: "+ sum1/(positiveC+negativeC));

    }
}
