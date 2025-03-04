package Coding_Blocks;

import java.util.ArrayList;

public class ArrayL_Syntax {
    public static void main(String[] args) {
        //wrapper classes
//        Integer i= Integer.valueOf(4);
//        Boolean b= Boolean.valueOf(true);

        //Creating ArrayList
        ArrayList<Integer> l1= new ArrayList<>();
        //ArrayList<Boolean> l2= new ArrayList<>();

        //add a new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        //get an element at index i
//        System.out.println(l1.get(1)); //6

        //print using for loop
//        for (int i=0; i<l1.size(); i++){
//            System.out.println(l1.get(i)); //5, 6, 7, 8
//        }

        //printing the ArrayList directly
        System.out.println(l1); //[5, 6, 7, 8]

        //adding element at some index i
        l1.add(1, 100);
        System.out.println(l1);//[5, 100, 6, 7, 8]

        //modifying element at index i
        l1.set(1, 10);
        System.out.println(l1); //[5, 10, 6, 7, 8]

        //removing an element at index i
        l1.remove(1);
        System.out.println(l1);//[5, 6, 7, 8]

        //removing an element e
         l1.remove(Integer.valueOf(7));
        System.out.println(l1);//[5, 6, 8]

        //checking if an element exists
        boolean ans= l1.contains(Integer.valueOf(60));// false
        System.out.println(ans);

        //if you don't specify class, you can put anything inside l
        ArrayList l = new ArrayList();


    }

}
