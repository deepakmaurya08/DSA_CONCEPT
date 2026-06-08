
public class Search_sorted_matrix {

    public static boolean search_sorted_matrix(int[][] arr, int key){
        int scol = arr[0].length-1;
        int srow = 0;

        while(srow < arr.length && scol >= 0){
            if (arr[srow][scol] == key){
               return true;
            }

            else if(arr[srow][scol] < key){
                srow++;
            }else{
                scol--;
            }
        }
        return false;
    }
    public static void main (String [] args){
        int arr[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    boolean result = search_sorted_matrix(arr, 33);
    System.out.println("the key is present : " + result);
    }
}

//output

// 10  20  30  40  
// 15  25  35  45  
// 27  29  37  48  
// 32  33  39  50  
// the key is present : true