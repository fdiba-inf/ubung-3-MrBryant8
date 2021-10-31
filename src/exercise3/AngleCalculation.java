package exercise3;

import java.util.Scanner;

public class AngleCalculation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double angle= input.nextDouble();
        String type=input.next();
        char int1=type.charAt(0);
        double angle1;
        double angle2;
        do{
            if(int1 == 'r'){
                angle1 =180* angle/Math.PI;
                System.out.println("Angle: "+ angle1 + "d");
                break;
            }else if (int1 == 'd'){
                angle2=angle*Math.PI/180;
                System.out.println("Angle: "+ angle2+ "r");
                break;
            }

        }while(int1 == 'd' || int1 == 'r');

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
