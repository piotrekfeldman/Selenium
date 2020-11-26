package kolekcje;

public class Tablice {
    public static void main(String[] arg) {

        String jakis = "Coś:takiego:nie:może";


        /*String tab [] = null ;
     //   tab [] = jakis.split(":");

   //    for(int i=0; i<tab.length;i++)
       {
           System.out.println(tab[i]);
       }
*/


        String[] tablica = new String[7];
        tablica[0] = "Piotr";
        tablica[1] = "Marta";
        tablica[1] = "lotr";
        tablica[2] = "Magda";
        tablica[3] = "Robert";
        tablica[5] = "Katarzyna";
        tablica[6] = "Miłosz";
        tablica[4] = "Michał";


        for (String t : tablica) {
            System.out.println(t);
        }
    }
}

