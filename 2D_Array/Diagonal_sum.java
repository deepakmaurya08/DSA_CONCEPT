public class Diagonal_sum {

    public static int diagonal_sum(int [][] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i][i];

            if(i != arr.length-1-i){
                sum += arr[i][i];
            }
        }
        return sum;
    }
    public static void main(String[] args){
         int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("the 2_D matrix is :");
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

        int result = diagonal_sum(arr);
        System.out.println("the diagonal sum is : " + result);

    }
    
}


//output

// the 2_D matrix is :
// 1  2  3  
// 4  5  6  
// 7  8  9  
// the diagonal sum is : 25
