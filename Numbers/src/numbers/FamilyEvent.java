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

public class FamilyEvent<oddEven> {
    public static void main(String args[]) {
        FamilyEvent<Integer> obj = new FamilyEvent<Integer>();
        Collection<Integer> family = new ArrayList<Integer>();
        
        Scanner s =new Scanner(System.in);
         System.out.println("Enter even number");
          
          int E =s.nextInt();
          
          family.add(E);
        
        System.out.println("Enter odd number");
        
        int O =s.nextInt();
        family.add(O);
        
        System.out.println("Enter odd number");
        
        int r =s.nextInt();
        family.add(r);

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
    
    
    public Collection<List<oddEven>> permute(Collection<oddEven> input) {
        Collection<List<oddEven>> output = new ArrayList<List<oddEven>>();
        if (input.isEmpty()) {
            output.add(new ArrayList<oddEven>());
            return output;
        }
        
        List<oddEven> list = new ArrayList<oddEven>(input);
        oddEven head = list.get(0);
        List<oddEven> rest = list.subList(1, list.size());
        for (List<oddEven> permutations : permute(rest)) {
            List<List<oddEven>> subLists = new ArrayList<List<oddEven>>();
            for (int i = 0; i <= permutations.size(); i++) {
                List<oddEven> subList = new ArrayList<oddEven>();
                subList.addAll(permutations);
                subList.add(i, head);
                subLists.add(subList);
            }
            output.addAll(subLists);
        }
        return output;
    }
}
