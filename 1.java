import java.io.*;
import java.util.*;
//Position this line where user code will be pasted.
// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) {
	    // Taking input using scanner class
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    int n = sc.nextInt();
		    int a[][] = new int[n][n];
		    
		    for(int i = 0;i<n;i++){
		        for(int j = 0;j<n;j++){
		            a[i][j] = sc.nextInt();
		        }
		    }
		    
		    Geeks obj = new Geeks();
		    System.out.println(obj.columnWithMaxZero(a, n));
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*Class Geeks with its member function columnWithMaxZero()
* a[][] = matrix input
* n : number of rows and columns each
*/
class Geeks{
    
    static int columnWithMaxZero(int a[][],int n){
        
        int c[][] = new int[n][2];
        
        //int k = 0;
        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                c[i][0] = c[i][0] + a[j][i];
                c[i][1] = i;
            }
            
            //k++;
            
        }
        
        
        
        
        for(int i=0;i<n;i++){
            for(int j = i+1 ;j<n ; j++){
                if(c[i][0] > c[j][0]){
                    
                    int swap1 = c[i][1];
                    c[i][1] = c[j][1];
                    c[j][1] = swap1;
                    
                    int swap = c[i][0];
                    c[i][0] = c[j][0];
                    c[j][0] = swap;
                }
            }
        }
        
        
        int f = c[0][1];
        
        return f;
    }
}