
public class Selection_sort {

    public static void selection_sort_function(int[] arr){
      for(int i = 0; i< arr.length; i++){
        int smallest = i;
        for(int j = i+1; j<arr.length; j++){
            if(arr[j] < arr[smallest]){
                smallest = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[smallest];
        arr[smallest] = temp;
      }   
    }
    public static void main (String [] args){
        //arr = {5,4,1,3,2}

        int arr[] = {5,4,1,3,2};

        System.out.println("the Original array is :");
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }

        selection_sort_function(arr);
        
        System.out.println();
        System.out.println("the Sorted array is :");
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        
    }
    
}


//OUTPUT

// the Original array is :
// 5, 4, 1, 3, 2, 
// the Sorted array is :
// 1, 2, 3, 4, 5, 