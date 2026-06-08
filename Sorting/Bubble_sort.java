public class Bubble_sort {
    public static void main (String [] args){
       
        // arr = {3,4,2,1,5,6,8}//
        

        int arr[] = {3,4,2,1,5,6,8};
        System.out.println("the Original array is : ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

        System.out.println();
        System.out.println("the sorted array is : ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }    
}


//OUTPUT

// the Original array is : 
// 3, 4, 2, 1, 5, 6, 8, 
// the sorted array is : 
// 1, 2, 3, 4, 5, 6, 8,