package c4q.lighterletter;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by c4q-john on 3/15/16.
 *
 * Given a sentence ss, tell Roy if it is a pangram or not.
 *
 * Output a line containing pangram if ss is a pangram, otherwise output not pangram.
 */
public class F_Pangrams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */

        Scanner sc = new Scanner(System.in);
        String sen = "";

        while(sc.hasNext()){
            sen += sc.next();
        }

        sen = sen.toLowerCase();

        isPangram(sen);

    }

    public static void isPangram(String sen){
        Set map = new HashSet<String>();

        for(char a : sen.toCharArray()){
            map.add(a);
        }

        if(map.size() != 26){
            System.out.print("not pangram");
        }
        else{
            System.out.print("pangram");
        }
    }

}
