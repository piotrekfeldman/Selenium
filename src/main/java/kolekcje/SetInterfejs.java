package kolekcje;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfejs {
    public static void main(String[] args)
    {
        Set<String>setStr=new HashSet<>();
        setStr.add("F");
        setStr.add("E");
        setStr.add("C");
        setStr.add("D");
        setStr.add("A");
        setStr.add("A");

        for(String t:setStr)
        {
            System.out.println(setStr);
        }


        Set<Integer>setStr2=new LinkedHashSet<>();
        setStr2.add(5);

        setStr2.add(3);

        setStr2.add(1);
        setStr2.add(4);

        setStr2.add(2);
        setStr2.add(2);


        for(int tr:setStr2)
        {
            System.out.println(tr);
        }

        Set<Integer> tree = new TreeSet<>();

        tree.add(1);
        tree.add(9);
        tree.add(3);
        tree.add(4);
        tree.add(8);

        System.out.println("****************");

        for (int tre:tree) {

            System.out.println(tre);

        }


    }
}
