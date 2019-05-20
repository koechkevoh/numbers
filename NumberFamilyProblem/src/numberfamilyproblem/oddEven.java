/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberfamilyproblem;

/**
 *
 * @author anonymous
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
public class oddEven {
    static int oddCount = 0;
    static int evenCount = 0;
    static int primeCount = 0;

    public void Even(int[] a, int family) {
        int i, even = 0;

        System.out.print("\nEven numbers :");
        for (i = 0; i < family; i++) {
            if (a[i] % 2 == 0) {

                System.out.print(a[i] + " ");
                evenCount++;

            }
        }
        System.out.println("");
        System.out.println("Total number of even " + evenCount);

    }

    public void Odd(int[] b, int family) {
        int i;

        System.out.print("\nOdd numbers :");
        for (i = 0; i < family; i++) {
            if (b[i] % 2 != 0) {

                System.out.print(b[i] + " ");
                oddCount++;

            }
        }

        System.out.println("");
        System.out.println("Total number of odd " + oddCount);

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

    private static long sumOfPhotos(int num) {
        if (num <= 0) {
            return 0;
        }
        return 1 + sumOfPhotos(num - 1) * 2;
    }

    private static int nthOddNo(int n) {
        return 2 * n + 1;
    }

    private static int nthEvenNo(int n) {
        return 2 * n + 2;
    }

    private static long getPhotoCount(int evenCount, int oddCount) {
        long photoCount = 0;
        for (int n = 0; n < oddCount; n++) {
            int evensFamily = Math.min(evenCount, nthOddNo(n) / 2);
            final long photosOf = sumOfPhotos(evensFamily);
            System.out.printf("Photos of %s can take : %s \n", nthOddNo(n), photosOf);
            photoCount += photosOf;
        }
        for (int i = 0; i < evenCount; i++) {
            int oddsFamily = Math.min(oddCount, nthEvenNo(i) / 2);
            long photosOf = sumOfPhotos(oddsFamily);
            System.out.printf("Photos of %s can take : %s \n", nthEvenNo(i), photosOf);
            photoCount += photosOf;

        }
        return photoCount;
    }

    public static void main(String[] args) {
        oddEven fam = new oddEven();
        Scanner sc = new Scanner(System.in);
        int family, i;

        System.out.print("Enter Number of family : ");
        family = sc.nextInt();

        int[] a = new int[family];

        System.out.print("Enter " + family + " families :");
        for (i = 0; i < family; i++) {
            a[i] = sc.nextInt();

        }

        fam.Even(a, family);
        fam.Odd(a, family);
        fam.Prime(a, family);
        
        System.out.println("\n\n");
        System.out.println("\nPhotos :" + getPhotoCount(evenCount, oddCount));
        System.out.println("Prime numbers Selfie Photos " + primeCount);

    }

}

