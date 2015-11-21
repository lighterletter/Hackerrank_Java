package c4q.lighterletter;

import java.util.Scanner;

/**
 Created by c4q-john on 11/20/15.

 "Type exactly 3 lines of input.
 Each line consists of a string
 and an integer. "


 */
public class E_JavaOutputFormatting {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Take exactly 3 lines of input. Each line consists of a string and an integer.\n");
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            while(sc.hasNext()){
                String s1=sc.next();
                int x=sc.nextInt();
                for(int k = 0; k < 15- s1.length(); i++){
                    s1 = s1 + " ";
                }
                if(x < 1 ){
                    System.out.println( s1 + "000" );
                } else if (x > 1 && x < 10){
                    System.out.println( s1 + "00" + x );
                }else if( x > 10 && x < 100 ){
                    System.out.println( s1 + '0' + x );
                } else {
                    System.out.println( s1 + x );
                }
            }
        }
        System.out.println("================================");
    }

}
