package kolekcje;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapka {

    public static void main(String[] args){

        Map<Integer, String> mapa= new HashMap<Integer, String>();

        mapa.put(2,"Marta");
        mapa.put(1, "Piotr");

        for(Map.Entry<Integer, String> m2: mapa.entrySet()){
            int key=m2.getKey();
            String value=m2.getValue();

            System.out.println(key+" " +value);
        }
        System.out.println("keyset "+mapa.keySet()) ;
        System.out.println("mapaset "+mapa.values());

        System.out.println(mapa.containsKey(2));

        Map<Integer, String> treeMap= new LinkedHashMap<>();

        treeMap.put(2, "Marta");
        treeMap.put(1, "Piotr");

        System.out.println("**************************");
        for(Map.Entry<Integer, String> m1: treeMap.entrySet()){

            int key=m1.getKey();
            String value=m1.getValue();

            System.out.println(key+" " +value);
        }
    }


}
