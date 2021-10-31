package exercise3;

public class NumberSearch {
    public static void main(String[] args) {
        int x;
        int counter = 0;

        for (x = 119; x < 1000; x++) {
            /*if (counter < 9){
                if(x%5==0 && x%6==0){
                    System.out.print(x + " ");
                    counter ++;
                }

            }else{
                if( x%5 ==0 && x%6 ==0){
                    System.out.println(x);
                    counter =0;*/

            if (x % 5 == 0 && x % 6 == 0) {
                counter++;
                if (counter % 10 != 0) {
                    System.out.print(x + " ");
                }else{
                    System.out.println(x);
                    counter = 0;
                }
            }


        }

    }
}


