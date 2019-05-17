/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;



import java.util.Scanner;


public class Numbers {
    Scanner s = new Scanner(System.in);
    
    public  int factEven(){
        int E=0;
        System.out.println("Enter Even numbers");

           E =s.nextInt();
        
        int fact = 1;
        int i =1;
        while (i<=E){
        
            fact*=i;
            i++;
        
              System.out.println("Even is "+i);
        }
        return fact;
        }

   
   /*  public int factOdd() {
         int O =0;

         System.out.println("Enter Odd numbers");
          O =s.nextInt();
      
      int fact = 1;
      int i = 1;
      while(i <O) {
         fact *= i;
         i++;
         
          System.out.println("Odd is "+i);
      }
      return fact;
   }*/

    public static void main(String[] args) {
        Numbers num = new Numbers(); 
        num.factEven();
        //num.factOdd();
  
        
       }
   
}
    
