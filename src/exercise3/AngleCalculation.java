package exercise3;

import java.util.Scanner;

public class AngleCalculation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double angle= input.nextDouble();
        char type=input.next().charAt(0);

        double angle1;
        double angle2;
        do{
            if(type == 'r'){
                angle1 =angle / Math.PI * 180;
                System.out.println("Angle: "+ angle1 + "d");
                break;
            }else if (type == 'd'){
                angle2=angle * Math.PI / 180;
                System.out.println("Angle: "+ angle2+ "r");
                break;
            }

        }while(type == 'd' || type == 'r');

        //double angle,angle2, angle1 ;
        //char type;

        /*do{
            angle=input.nextDouble();
            type=input.next().charAt(0);

            if(type == 'd'){
                angle2=angle*Math.PI/180;
                System.out.println("Angle: "+ angle2+ "r");
            }else if(type == 'r' ){
                angle1 =angle* 180/Math.PI;
                System.out.println("Angle: "+ angle1 + "d");
            }

        }while(type =='r'|| type =='d');*/

    }
}
