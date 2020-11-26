package kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Array {

    public static void main(String[] args)
        {
        List<String> lista=new ArrayList<>();

        lista.add("Piotr");
        lista.add("Marta");
            lista.add("Tomasz");
            lista.add("Krzych");
            lista.add("Adi");
            lista.add("Wojtek  ");
            lista.add("Maciek");


            System.out.println("-----------------");
            for(int i = 0 ; i<lista.size(); i += 2) {

                System.out.println(lista.get(i));
            }
            System.out.println("-----------------");
        for(String s:lista){
            System.out.println(lista);
        }
        lista.add(1, "sdfhiuidsa");
            lista.add(2, "taaa");


            for(String s:lista){
            System.out.println(lista);
        }
    }
}
