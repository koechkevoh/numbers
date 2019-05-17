package numbers;

import java.util.Scanner;

public class permutation {

    public static void main(String args[]) {
        
            permutation s =new permutation();
            s.permute();
      
    }

    public static void permute() {
        
        String full ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers");
        full = s.nextLine();
        
        if (full == null|| full.length() == 0) {
            System.out.println("provide a string of length >0");
            return;
        }
        permute("", full);
    }

    private static void permute(String prefix, String remaining) {
        if (remaining.length() == 0) {
            System.out.println(prefix);
        }
        
        for (int i = 0; i < remaining.length(); i++) {
       permute(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1, remaining.length()));
            
        }
        
    }
}
