package sorting;
import java.time.Instant;

public class BubbleSort {
    public static void main(String[] args) {
        int[] input_array = Input.get_Unsorted_array();
        Input.print(input_array, "Unsorted Array", null, null);
        int n = input_array.length;

        Instant start = Instant.now();
//        Bubble sort algorithm
        for(int i = 0; i< n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if(input_array[j] > input_array[j+1]){
                    int temp = input_array[j];
                    input_array[j] = input_array[j+1];
                    input_array[j+1] = temp;
                }
            }
        }

        Instant end = Instant.now();
        Input.print(input_array, "Sorted Array", start, end);
    }
}
