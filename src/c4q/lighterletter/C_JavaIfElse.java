package c4q.lighterletter;

import java.util.Scanner;

/**
 * Created by c4q-john on 11/21/15.
 *
 *
 * "Given an integer N as input, check the following:
 *
 * If N is odd, print "Weird".
 * If N is even and, in between the range of 2 and 5(inclusive), print "Not Weird"
 * If N is even and, in between the range of 6 and 20(inclusive), print "Weird".
 * If N is even and N>20, print "Not Weird".
 *
 */
public class C_JavaIfElse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        String ans="";

        if ( n % 2 == 1 || ( n >= 6 && n <= 20 ) )
        {
            ans = "Weird";
        }
        else if ( n % 2 == 0 || ( n >= 2 && n <=5 ) || n >20)
        {
            System.out.print("Not Weird");
        }
        System.out.println(ans);

    }

}
