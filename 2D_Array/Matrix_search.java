
public class Matrix_search {

    public static boolean matrix_search(int [][] arr, int key){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(arr[i][j] == key){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String [] args){

        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        System.out.println("the 2_D matrix is :");
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

        boolean result = matrix_search(arr, 10);
        System.out.println("the key 10 is present : " + result);

    }
    
}


//output

// the 2_D matrix is :
// 1  2  3  4  
// 5  6  7  8  
// 9  10  11  12  
// 13  14  15  16  
// the key 10 is present : true