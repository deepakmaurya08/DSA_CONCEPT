

public class Counting_sort {

    public static void counting_sort_function(int[] arr){
        //step 1 - find the maximum number in array
        
        int largest = 0;
        for(int i = 0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }

        //Step 2 = create a counting array and increament the array according to valuve present in arr[]
        int [] count = new int [largest+1];
        for(int i = 0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //step 3 - update the original array by count array

        int j = 0;
        for(int i = 0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
    public static void main (String [] args){

        int arr[] = {5,4,1,3,2};
        System.out.println("the original array is : ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }

        counting_sort_function(arr);

        System.out.println();
        System.out.println("the sorted array is : ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }

    }
}


//output

// the original array is : 
// 5, 4, 1, 3, 2, 
// the sorted array is : 
// 1, 2, 3, 4, 5, 