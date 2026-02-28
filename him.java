import java.util.*;
public class him {
    public static boolean calculateArray(int matrix[][],int key){
        int n=matrix.length, m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                Scanner sc = new Scanner(System.in);
                matrix[i][j]=sc.nextInt();
                sc.close();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                    System.out.print("found at cell: (" + i +","+j + ")");
                    return true;
                }
                
            }
           
        }
        System.out.print("not found");
       
        return false;
      
       
    }
    public static void main(String args[]){
       
        int matrix[][]=new int[4][4];
        int key=5;
        calculateArray(matrix,key);

    }
    
}
