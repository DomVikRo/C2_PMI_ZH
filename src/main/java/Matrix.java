import java.util.ArrayList;

public class Matrix {
    public static int numberOfNonZeroValues(int[][] matrix){
        int k=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){

                if(matrix[i][j]!=0){
                    k++;
                }
            }
        }
        return k;
    }
    public static ArrayList<Integer> indexOfColumnsWithSameValues(int[][] matrix){
        ArrayList<Integer> k = new ArrayList<>();
        int e=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                if(matrix[i][j]==matrix[i+1][j]){
                    e++;
                }
            }
            if(e==4){
                k.add(i);
            }

        }
        return k;
    }
}
