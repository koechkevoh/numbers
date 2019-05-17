/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.util.Scanner;
import static numbers.Factorial.factorial;

public class oddEven {
   static int oddCount = 0;
   static int evenCount = 0;
   static int primeCount=0;
    public void  Even(int[] a, int family) {
        int i,even=0;
        
        System.out.print("\n even numbers :");
        for (i = 0; i < family; i++) {
            if (a[i] % 2 == 0) {

                System.out.print(a[i] + " ");
                evenCount++;

            }

        }

        System.out.println("");
        System.out.println("total number of even " + evenCount);
        
     
    }

    public void Odd(int[] b, int family) {
        int i;
        
        System.out.print("\n odd numbers :");
        for (i = 0; i < family; i++) {
            if (b[i] % 2 != 0) {

                System.out.print(b[i] + " ");
                oddCount++;

            }
        }

        System.out.println("");
        System.out.println("total number of odd " + oddCount);

    }

    public static void Prime(int[] a, int family) {

        int i = 0;
        int num = 0;

        String primeNumbers = "";
        
        for (i = 1; i <= family; i++) {
            int prime = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    prime = prime + 1;
                   
                }

            }
            if (prime == 2) {

                primeNumbers = primeNumbers + i + " ";
                 primeCount++;
            }

        }
        System.out.println("\n");
        
        System.out.print("Prime numbers in a family : ");
        System.out.println(primeNumbers);

    }
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

    public static void main(String[] args) {
        oddEven fam = new oddEven();
       
        
        Scanner sc = new Scanner(System.in);
        int family, i;
        

        System.out.print("Enter Number of family : ");
        family = sc.nextInt();

        int[] a = new int[family];

        System.out.print("Enter " +family+ " families :");
        for (i = 0; i < family; i++) {
            a[i] = sc.nextInt();

        }
  
        fam.Even(a, family);
        fam.Odd(a, family);
        fam.Prime(a, family);
        int num;
        for (int j= 0;j<=a.length-1;j++){
            int  element =family;
            int nextElement=family+1;
            
            System.out.println(""+element+nextElement);
        
        }
        System.out.println("\n");
        System.out.println("All Possible photos");
        System.out.print(a[4] + " ");
        System.out.print(a[3] + "  ");

        System.out.print(a[4] + " ");
        System.out.print(a[1] + "  ");

        System.out.print(a[4] + " ");
        System.out.print(a[3] + " ");
        System.out.println(a[1] + "  ");

        System.out.print(a[3] + " ");
        System.out.print(a[2] + "  ");

        System.out.print(a[3] + " ");
        System.out.print(a[0] + "  ");

        System.out.print(a[3] + " ");
        System.out.print(a[2] + " ");
        System.out.println(a[0] + " ");

        System.out.print(a[2] + " ");
        System.out.println(a[1] + " ");

        System.out.print(a[1] + " ");
        System.out.println(a[0] + " ");

        int fact=1;  
        int fact2=1;
        
          
      fact =factorial(evenCount);
      fact2 =factorial(oddCount);
      int total =fact+fact2;
        System.out.println("Prime numbers Selfie Photos "+primeCount);
        System.out.println("Photos "+total);
         
         

    }

}
