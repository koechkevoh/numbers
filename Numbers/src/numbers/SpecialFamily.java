/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.util.Arrays;
import java.util.Scanner;
import static numbers.oddEven.primeCount;

/**
 *
 * @author anonymous
 */
public class SpecialFamily {
    public static void main(String[] args){
   
   Scanner s = new Scanner(System.in);
        System.out.println("Enter even number");
    
    int even;
    even =s.nextInt();
        System.out.println("Enter odd number");
    int odd;
    odd=s.nextInt();
    
       // System.out.println("Total no of photos : "+getPhotoCountFactorial(evenCount,oddCount));
       // System.out.println("Total no of photos : "+getPhotoCountOptiFactorial(evenCount,oddCount));
        System.out.println("Total no of photos : "+getPhotoCount(even,odd));
        
        //System.out.println("Total no of photos : "+getPhotoCount4(evenCount,oddCount));
    
    }public static int getPrime(int family[], int fam) {

        int i = 0;
        int num = 0;

        String primeNumbers = "";
        
        for (i = 1; i <= fam; i++) {
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
     return num;
    }
    private static long sumOfPhotos(int num){
    if(num<=0)
    {
        return 0;
    }
    return 1+sumOfPhotos(num-1)*2;
    }
    
    private static int nthOddNo(int n){
        return 2*n+1;
    }
    
    private static int nthEvenNo(int n){
        return 2*n+2;
    }
    
    private static long getPhotoCount(int evenCount,int oddCount){
        long photoCount=0;
        for(int n =0;n<oddCount;n++){
            int evensInvolved=Math.min(evenCount, nthOddNo(n)/2);
            final long photosOfI = sumOfPhotos(evensInvolved);
            System.out.printf("photo of %s : %s \n",nthOddNo(n),photosOfI);
            photoCount+=photosOfI;
        }
        for(int i=0;i<evenCount;i++){
            int oddsInvolved=Math.min(oddCount, nthEvenNo(i)/2);
            long photosOfI =sumOfPhotos(oddsInvolved);
            System.out.printf("photo of %s : %s \n",nthEvenNo(i),photosOfI);
            photoCount+=photosOfI;
        
        }
        return photoCount;
    }
    
    private static long getPhotoCountOptiFactorial(int evenCount,int oddCount)
    {
        long photoCount=0;
            for(int n=0;n<oddCount;n++){
            int evensInvolved=Math.min(evenCount, oddCount);
            final long photosOfI = sumOfPhotosOptimisedFactorial(evensInvolved);
                System.out.println("photo of%s : %s \n"+nthOddNo(n)+photosOfI);
                photoCount+=photosOfI;
            }
            for(int i=0;i<evenCount;i++){
            int oddsInvolved=Math.min(oddCount,nthEvenNo(i)/2);
            long photosOfI = sumOfPhotosOptimisedFactorial(oddsInvolved);
                System.out.println("Photos of\n"+nthEvenNo(i)+photosOfI);
                photoCount+=photosOfI;
            }
        return photoCount;
    }
    
    private static long getPhotoCountFactorial(int evenCount,int oddCount){
        long photoCount=0;
        for(int n =0;n<oddCount;n++){
        int evensInvolved =Math.min(evenCount, nthOddNo(n)/2);
        final long photosOfI= sumOfPhotoWithFactorial(evensInvolved);
            System.out.println("Photos of\n"+nthOddNo(n)+photosOfI);
            photoCount+=photosOfI;
        
        }
        for(int i=0;i<evenCount;i++){
        int oddsInvolved=Math.min(oddCount, nthEvenNo(i)/2);
        long photosOfI=sumOfPhotoWithFactorial(oddsInvolved);
            System.out.println("Photos of\n"+nthEvenNo(i)+photosOfI);
            photoCount+=photosOfI;
        }
    return photoCount;
    }
    
    private static long sumOfPhotosOptimisedFactorial(int nosInvolved){
        int res=0;
        for(int i=1;i<nosInvolved;i++){
        long count=combo(nosInvolved,i);
        res+=count;
        }
        return res;
    }
    
    private static long sumOfPhotoWithFactorial(int nosInvolved){
        int res =0;
        for(int i=1;i<nosInvolved;i++){
        long count =combo(nosInvolved,i);
        res+=count;
        }
        return res;
    }
    
    private static long combo(int n,int k){
        return perm(n,k)/factorial(k);
    }
    private static long optiCombo(int n,int k){
        return factorialWithLimit(n,k)/factorial(1);
    }
    private static long perm(int n,int k){
        return factorial(n)/factorial(n-k);
    }
    private static long factorial(int nos){
        if(nos<=1){
        return 1;
        }
        return nos*factorial(nos-1);
    }
    
    private static long factorialWithLimit(int nos,int limit){
        if(nos<=limit){
        return 1;
        }
        return nos*factorialWithLimit(nos-1,limit);
    }
    
   private static long photosIn(int p,int itemsPresent){
       int res=0;
       for(int i=1;i<=itemsPresent;i++){
       long count=combo(itemsPresent,i);
       for(int c=0;c<count;c++){
           System.out.println("\t"+Arrays.toString(items(p,i,c)));
       }
       res+=count;
       }
   return res;
   }
   
   private static int[]items(int p,int max,int round){
       int s;
       if(p%2==0){
       s=1;
       }
       else{
       s=2;
       }
       int [] family = new int[max+1];
       int i=0;
       family[i++]=p;
       family[i++]=s+=(round)*2;
       for(;i<=max;i++){
       family[i]=s+=2;
       }
       return family;
   }
   private static long getPhotoCount4(int evenCount,int oddCount){
       System.out.println("\n\ngetPhotoCount4");
       int largestEven =nthEvenNo(evenCount);
       int x=Math.max(0,(largestEven/2)-oddCount);
       int m=Math.min(largestEven/2,oddCount);
       long evensPhotos=geometricSeriesSum(2,m)-m+(long)(x*(Math.pow(2, m)-1));
       System.out.println("evens"+evensPhotos);
      
       //oddNumbers
       int largestOdd=nthOddNo(oddCount);
       int y=Math.max(0,(largestOdd/2)-evenCount);
       int z=Math.min(largestOdd/2, evenCount);
       long oddsPhotos=geometricSeriesSum(2,z)-z+(long)(y*(Math.pow(2, z)-1));
       System.out.println("Odds"+oddsPhotos);
       return evensPhotos+oddsPhotos;
   
   }
   private static long geometricSeriesSum(int r,int n){
       double s = (1D-Math.pow(r, n))/(1D-r);
       return(long)s;
   }
    
}
