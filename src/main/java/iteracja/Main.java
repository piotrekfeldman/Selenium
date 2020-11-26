package iteracja;

import java.util.*;

public class Main {
public static void main (String[] args){

    List<String> listaStr = new ArrayList<>();
    listaStr.add("jeden");
    listaStr.add("dwa");
    listaStr.add("trzy");
    listaStr.add("cztery");


    List<Integer> listaInt = new ArrayList<>();
    listaInt.add(100);
    listaInt.add(200);
    listaInt.add(300);
    listaInt.add(400);


    Set<String> setList = new HashSet<>();
    setList.add(" str 1 ");
    setList.add(" str 2 ");
    setList.add(" str 3 ");
    setList.add(" str 4 ");

    Map<Integer, String> mapa = new HashMap<>();
    mapa.put(1, "jeden");
    mapa.put(2, "dwa");
    mapa.put(3, "trzy");
    mapa.put(4, "cztery");

    Iterator<Integer> itr = mapa.keySet().iterator();
    System.out.println("Hashmap iterator");
    while (itr.hasNext()){
        Integer key = itr.next();
        System.out.println(key + " : " +mapa.get(key));
    }

    for(Map.Entry<Integer, String> m: mapa.entrySet()){
        int key = m.getKey();
        String valuue = m.getValue();

        System.out.println(key+ " - " + valuue);
    }


    for (String s : listaStr){
        System.out.println(s);
    }

    Iterator i = listaInt.listIterator();

    while (((ListIterator) i).hasNext()){

        System.out.println(((ListIterator) i).nextIndex()+ " : "+ i.next());
    }

    System.out.println("=================");

    while (((ListIterator) i).hasPrevious()){
        System.out.println(((ListIterator) i).previousIndex()+ " : "+ ((ListIterator) i).previous());


        //((ListIterator) i).previous()
    }

    Iterator s = setList.iterator();
    while(s.hasNext()){
        System.out.println(s.next());
    }
}

}
