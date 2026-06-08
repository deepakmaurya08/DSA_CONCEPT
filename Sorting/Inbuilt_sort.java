import java.util.Arrays;
import java.util.Collections;

public class Inbuilt_sort {
    public static void main(String [] args){

        int [] arr = {5,4,1,3,2};

        // Arrays.sort(array, start, end)

        System.out.println("the Original array is : ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        Arrays.sort(arr,0,arr.length);
        System.out.println("the sorted array is : ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }

        //for REVERSE 
        //Arrays.sort(arr, Collections.reverseOrder());
        // BUT ARRAY SHOULD BE OBJECT TYPE

        System.out.println();
        Integer[] arr1 = {5,4,1,3,2};
        System.out.println("the reverse order is : ");
        Arrays.sort(arr1, Collections.reverseOrder());
        for(int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i] + ", ");
        }

    }
}

//output

// the Original array is : 
// 5, 4, 1, 3, 2, 
// the sorted array is : 
// 1, 2, 3, 4, 5, 
// the reverse order is : 
// 5, 4, 3, 2, 1, 
