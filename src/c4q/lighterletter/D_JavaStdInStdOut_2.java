package c4q.lighterletter;

import java.util.Scanner;

/**
 * Created by c4q-john on 11/21/15.
 *
 * "In this problem you just need
 * to read the inputs from stdin
 * and print them in stdout."
 *
 */
public class D_JavaStdInStdOut_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Type: int");
        int x = sc.nextInt();
        System.out.println("Type: double");
        double y = sc.nextDouble();
        System.out.println("Type: string");
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println( "String: " + s );
        System.out.println( "Double: " + y );
        System.out.println( "Int: " + x );
    }

}
