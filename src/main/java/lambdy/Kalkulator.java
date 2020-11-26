package lambdy;

public class Kalkulator {

    public static void main (String[] args){

        // Lambda- funkcje anonimowe, nienazwane. NIe mają żadnej deklaracji nigdzie.
        // Służą do tego aby skorzystać z metod abstrakcyjnych nie przeslaniając ich

        //  () -> {};
        // (int a, int b) ->a + b;
        // (a, b) -> a + b;
        // () -> a + b;
        // () -> {return a+b;};
        // () -> (System.out.println("Cos")};
        // int s= (a ,b) -> a + b;


        KalInterfejs k= (a, b) -> a + b;

        System.out.println(k.oblicz(3,3));
    }
}
