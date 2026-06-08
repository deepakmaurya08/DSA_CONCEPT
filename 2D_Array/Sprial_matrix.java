

public class Sprial_matrix {

    public static void sprial_matrix_print(int[][] arr){
        int sc = 0;
        int sr = 0;
        int er = arr.length-1;
        int ec = arr[0].length-1;

        while(sr <= er && sc <= ec){
            for(int i = sc; i<=ec; i++){
                System.out.print(arr[sc][i] + ", ");
            }
            for(int i = sr+1; i<=er; i++){
                System.out.print(arr[i][ec] + ", ");
            }
            for(int i = ec-1; i>=sc; i--){
                System.out.print(arr[er][i] + ", ");
            }
            for(int i = er-1; i>=sr+1; i--){
                System.out.print(arr[i][sc] + ", ");
            }
            sc++;
            sr++;
            er--;
            ec--;
        }

    }
    public static void main(String[] args){

        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        System.out.println("the 2_D matrix is :");
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("the sprial print is : ");
        sprial_matrix_print(arr);

    }
    
}
