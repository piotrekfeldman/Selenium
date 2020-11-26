package kolekcje;

import java.util.LinkedList;

public class Linked {


    public static void main(String[] args) {

        LinkedList linkedList= new LinkedList();

        linkedList.add(0,"dwa");

        linkedList.add(0,"jeden");
        linkedList.add(1,"trzy");
        linkedList.add(2,"pięć");


        for (Object t: linkedList) {


            System.out.println(t);
        }
    }
}
