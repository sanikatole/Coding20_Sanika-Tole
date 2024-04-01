import java.util.*;    
public class BinaryMatrixRowWithMax1s {  
    public int rowWithMax1s(int[][] matrix) {    
        int m = matrix.length, n = matrix[0].length;   
        int maxRow = -1, maxCount = -1;  
        for (int i = 0; i < m; i++) {    
            int count = countOnes(matrix[i]);  
            if (count > maxCount) {  
                maxCount = count;  
                maxRow = i;  
            }  
        } 
        return maxRow;  
    } 
    private int countOnes(int[] arr) {  
        int count = 0;  
        for (int i = 0; i < arr.length; i++) {  
            if (arr[i] == 1) {  
                count++;  
            }  
        }  
        return count;  
    }    
    public static void main(String[] args) 
    {  
    BinaryMatrixRowWithMax1s finder = new BinaryMatrixRowWithMax1s();   
    int[][] matrix =     {{0, 1, 1, 1},  
                          {0, 0, 1, 1},  
                          {1, 1, 1, 1},  
                          {0, 0, 0, 0}};   
    int maxRow = finder.rowWithMax1s(matrix); 
    System.out.println("Row with maximum 1s: " + maxRow);  
    }  
}  