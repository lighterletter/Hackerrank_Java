package c4q.lighterletter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by c4q-john on 3/15/16.
 *
 * Given a list of unsorted integers, A={a1,a2,…,aN}A={a1,a2,…,aN},
 * can you find the pair of elements that have the smallest absolute
 * difference between them? If there are multiple pairs, find them all.
 *
 * Output the pairs of elements with the smallest difference.
 *
 * sample input:
 * 10
 * 10-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854
 *
 * sample output:
 * -20 30
 *
 *
 */
public class G_Median {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
        Scanner sc = new Scanner(System.in);
        int numbers =  sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers; i++){
            list.add(Integer.parseInt(sc.next()));
        }

        Collections.sort(list);
        findMedians(list);
    }

    public static void findMedians(ArrayList<Integer> list){

        int lowestDiff = Integer.MAX_VALUE;
        String line = "";

        for(int k = 0; k < list.size()-1; k++){
            if(list.get(k+1) - list.get(k) <= lowestDiff){
                lowestDiff = list.get(k+1) - list.get(k);
            }
        }

        for(int j = 0; j < list.size()-1; j++){
            if (list.get(j+1) - list.get(j) == lowestDiff){
                line += list.get(j) + " " + list.get(j+1) + " ";
            }
        }
        System.out.println(line);
    }

}
