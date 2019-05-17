/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.util.Scanner;


    class Factorial{  
     static int factorial(int n){    
      if (n == 0)    
        return 1;    
      else    
        return(n * factorial(n-1));    
     }    
     
     static int factorial2(int n){    
      if (n == 0)    
        return 1;    
      else    
        return(n * factorial2(n-1));    
     } 
     public static void main(String args[]){  
         System.out.println("Enter the number of even");
         Scanner s =new Scanner(System.in);
         
         int even;
         even=s.nextInt();
         
         System.out.println("Enter the number of odd");
         int odd;
         odd = s.nextInt();
         int i,fact=1;  
        int fact2=1;
          
      fact = factorial(even);  
      fact2 =factorial(odd);
      int total =fact+fact2;
         System.out.println("Photos "+total);    
     }  
    }  
