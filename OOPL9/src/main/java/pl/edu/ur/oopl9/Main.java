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
import java.util.HashSet;
import java.util.Scanner;
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
        //zad.4
        HashSet<String> słowa = new HashSet<>();
        Scanner odczyt = new Scanner(System.in);

        int f = 0;
        while (f == 0) {
            System.out.println("podaj słowo po polsku do przetłumaczenia spośród: ");
            System.out.println("'i', 'w' ,'nie','na','z','do','tak','on','dobranoc',drzwi','ale','dlaczego','jeden','przepraszam','co','dom','kiedy','ona','nigdy','wszystko'");
            System.out.println("Jeśli chcesz zakończyć wpisz 'koniec'");
            String d = odczyt.nextLine();
            słowa.add(d);
            if (słowa.contains("i")) {
                System.out.println("and");
            } else if (słowa.contains("w")) {
                System.out.println("in");
            } else if (słowa.contains("nie")) {
                System.out.println("no");
            } else if (słowa.contains("na")) {
                System.out.println("on");
            } else if (słowa.contains("z")) {
                System.out.println("from");
            } else if (słowa.contains("do")) {
                System.out.println("to");
            } else if (słowa.contains("tak")) {
                System.out.println("yes");
            } else if (słowa.contains("on")) {
                System.out.println("he");
            } else if (słowa.contains("dobranoc")) {
                System.out.println("good night");
            } else if (słowa.contains("drzwi")) {
                System.out.println("door");
            } else if (słowa.contains("ale")) {
                System.out.println("but");
            } else if (słowa.contains("dlaczego")) {
                System.out.println("why");
            } else if (słowa.contains("jeden")) {
                System.out.println("one");
            } else if (słowa.contains("przepraszam")) {
                System.out.println("I'm sorry");
            } else if (słowa.contains("co")) {
                System.out.println("what");
            } else if (słowa.contains("dom")) {
                System.out.println("house");
            } else if (słowa.contains("kiedy")) {
                System.out.println("when");
            } else if (słowa.contains("ona")) {
                System.out.println("she");
            } else if (słowa.contains("nigdy")) {
                System.out.println("never");
            } else if (słowa.contains("wszystko")) {
                System.out.println("everything");
            } else if (słowa.contains("koniec")) {
                f = 1;
            }
            słowa.remove(d);

        }

    }
}
