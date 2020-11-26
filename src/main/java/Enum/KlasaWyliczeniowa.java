package Enum;

import org.codehaus.groovy.transform.SourceURIASTTransformation;

public class KlasaWyliczeniowa {

    public static void main(String[] args) {


        for(Samochody s: Samochody.values()){
            System.out.println(s);
        }

        System.out.println("F "+Samochody.valueOf("FORD_FIESTA"));

        int rok=Samochody.FORD_FIESTA.getRok();

        System.out.println(rok);
    }
}
