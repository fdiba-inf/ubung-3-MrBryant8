package exercise3;

import java.security.KeyStore;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int number = input.nextInt();
        int divider = 2;
        boolean prime = true;

        while(divider<number){
            if (number % divider == 0){
                prime = false;
                break;
            }divider++;
        }System.out.println("Prime Number: " +prime);

    }
}




