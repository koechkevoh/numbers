/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

public class family {
    static long oddEven (long n , long k){
    long res =1;
    if(k>n-k)
    k=n-k;
    
    for(int i=0;i<k;i++){
        res*=(n-i);
        res/=(i+1);
    }
    return res;
    }
    
    static long catalan(long n){
    long c =oddEven(2*n,n);
    return c/(n+1);
   
    }
    public static void main (String args []){
        int n = 3;
        System.out.println(catalan(n));
    
    }
}
