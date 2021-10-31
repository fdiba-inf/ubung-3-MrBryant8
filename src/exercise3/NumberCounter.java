package exercise3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        int positiveC=0;
        int negativeC=0;
        double sum=0;
        double average;

        Scanner input=new Scanner(System.in);

        int number = input.nextInt();
        sum+=number;

        do {
           if (number>0){
               positiveC++;
           }else{
               negativeC++;
           }

           number = input.nextInt();
           sum+=number;

        }while(number!=0);

        average= sum /(positiveC+negativeC);
        System.out.println("Positive numbers: "+ positiveC);
        System.out.println("Negative numbers: " + negativeC);
        System.out.println("Sum: " + sum);
        System.out.println("Average: "+ average );

    }
}
