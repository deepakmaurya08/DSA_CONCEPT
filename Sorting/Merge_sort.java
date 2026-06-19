public class Merge_sort {
    public static void mergesort(int [] arr, int start, int end){
        if(start >= end){
            return;
        }
        int mid = (end+start)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid+1,end);
        merge(arr,start,mid,end);

    }

    public static int[] merge(int [] arr, int start, int mid, int end){
        int [] temp = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while(i<= mid && j<=end){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<= end){
            temp[k++] = arr[j++];
        }

        for(int x = 0, y = start; x<temp.length; x++,y++){
            arr[y] = temp[x];
        }
        return arr;
    }


    public static void main(String[]args){

        int arr[] = {2,4,3,7,5,6};
        System.out.println("Before sorting :");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }

        mergesort(arr,0,arr.length-1);

        System.out.println();
        System.out.println("After sorting :");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }

    }
}

//OUTPUT

// Before sorting :
// 2, 4, 3, 7, 5, 6, 
// After sorting :
// 2, 3, 4, 5, 6, 7, 
