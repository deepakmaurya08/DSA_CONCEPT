

public class Insertion_sort {

    public static void Insertion_sort_function(int[] arr){
        for (int i = 1; i<arr.length; i++){
            int prev = i-1;
            int curr = arr[i];
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--; 
            }
            arr[prev+1] = curr;
        }
    }
    public static void main(String [] args){

        int arr[] = {5,4,1,3,2};

        System.out.println("The Original array is : ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }

        Insertion_sort_function(arr);

        System.out.println();
        System.out.println("The Sorted array is : ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }

    }
    
}


//output

// The Original array is : 
// 5, 4, 1, 3, 2, 
// The Sorted array is : 
// 1, 2, 3, 4, 5, 