/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Permutations<T> {
    public static void main(String args[]) {
        Permutations<Integer> obj = new Permutations<Integer>();
        Collection<Integer> family = new ArrayList<Integer>();
        
        Scanner s =new Scanner(System.in);
         System.out.println("Enter even number");
          
          int E =s.nextInt();
          
          family.add(E);
        
        System.out.println("Enter odd number");
        
        int O =s.nextInt();
        family.add(O);

        Collection<List<Integer>> output = obj.permute(family);
        int k = 0;
        Set<List<Integer>> pnr = null;
        
        for (int i = 0; i <= family.size(); i++) {
            pnr = new HashSet<List<Integer>>();
            
            for(List<Integer> integers : output){
            pnr.add(integers.subList(i, integers.size()));
            }
            
            k = family.size()-1;
            System.out.println("P("+family.size()+","+k+") :"+"Count ("+pnr.size()+") :- "+pnr);
        
        }
    }
    
    
    public Collection<List<T>> permute(Collection<T> input) {
        Collection<List<T>> output = new ArrayList<List<T>>();
        if (input.isEmpty()) {
            output.add(new ArrayList<T>());
            return output;
        }
        
        List<T> list = new ArrayList<T>(input);
        T head = list.get(0);
        List<T> rest = list.subList(1, list.size());
        for (List<T> permutations : permute(rest)) {
            List<List<T>> subLists = new ArrayList<List<T>>();
            for (int i = 0; i <= permutations.size(); i++) {
                List<T> subList = new ArrayList<T>();
                subList.addAll(permutations);
                subList.add(i, head);
                subLists.add(subList);
            }
            output.addAll(subLists);
        }
        return output;
    }
}
