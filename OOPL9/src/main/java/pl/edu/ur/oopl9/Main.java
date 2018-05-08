/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
/**
 *
 * @author maarchyl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //zad.1
        int[] tab = new int[100];
        Random r = new Random();
        for(int i=0;i<100;i++)
       {
            tab[i]=r.nextInt(); 
            
       }
        Arrays.sort(tab);
        for(int i=0;i<100;i++)
        {
            System.out.println(tab[i]);
        }
        
        
        
        
        //zad.2
        System.out.println("zad.2");
           int a;
        Random losujLiczby = new Random();
        TreeSet x = new TreeSet <> ();
        for (int i = 0; i < 100; i++) {
            a = losujLiczby.nextInt(200);
            x.add(a);
        }
        Iterator iter = x.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next() + " ");
        }
      
        //zad.3
        int i;
        
        Samochód auta[] = new Samochód[100];
        for(i=0;i<100;i++){
            auta[i]=new Samochód("a","a",2+i,3+i);
        }
        ArrayList<Samochód> arlist = new ArrayList<Samochód>();
                for(i=0;i<100;i++){
            arlist.add(auta[i]);
        }
       for(i = 0; i < 100; i++){
            {
                arlist.get(i).showInfo();
            }
        
    }
 
    }
}
