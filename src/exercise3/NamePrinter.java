package exercise3;

import java.util.Scanner;

public class NamePrinter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name;
        name = input.nextLine();
        int i;

        for (i=0;i < name.length();i++ ){
            System.out.println("* "+ name.charAt(i)+" *");
        }


    }
}
