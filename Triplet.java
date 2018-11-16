/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackarrank.solutions;

import java.util.ArrayList;
import java.util.List;


public class Triplet {
    public static void main(String args[]){
    
        System.out.println(comp());
    }

    
    static List<Integer> comp(){
         List<Integer> a = new ArrayList<Integer>();
         List<Integer> b = new ArrayList<Integer>();
         a.add(1);
         a.add(2);
         a.add(3);
         b.add(3);
         b.add(2);
         b.add(1);
         int aa=0; int bb=0;
         List<Integer> res = new ArrayList<Integer>();
     
        for(int i=0; i<a.size() && i<b.size(); i++){
        
            if(a.get(i)>b.get(i)){
            
                ++aa;
            }
            else if(a.get(i)<b.get(i)){
            
                ++bb;
            }
            //else{return null;}
        }
        res.add(aa);
        res.add(bb);
        return res;
    }
    
}
