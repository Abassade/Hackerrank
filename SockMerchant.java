
package hackarrank.solutions;

import java.util.Arrays;

public class SockMerchant {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int arr [] = {1,2,1,2,1,3,2};
        
        System.out.println(sockMerchant(7, arr));
    }
    static int sockMerchant(int n, int arr []){
        
        int counter=0;
        Arrays.sort(arr); 
  //note: if the array is not sorted, the comparison is not going to be accurate
        
        for(int i=0; i<n-1; i++){
        
        if( arr[i]==arr[i+1]){
        
            counter++; 
            i++; // just to double the increment of i: at this point i=2, i.e. skip 1
        }
        }
    
    return counter;
            }
    
}
