package sorting;

import java.time.Duration;
import java.time.Instant;


public class Input {
    public static int[] get_Unsorted_array(){
        return new int[]{5, 6, 1, 0, 3};
    }

    public static void print(int[] array, String str, Instant start, Instant end){
        if(start != null && end !=null){
            Duration timeElapsed = Duration.between(start, end);
            System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
        }
        System.out.print(str + ": ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
