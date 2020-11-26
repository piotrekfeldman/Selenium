package kolekcjeSortowanie.stock;

import org.apache.commons.lang3.builder.CompareToBuilder;

public class Stock implements Comparable<Stock> {

    private String name;
    private String symbol;
    private Double price;

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public Double getPrice() {
        return price;
    }


    public Stock(String name, String symbol, Double price) {
        this.name = name;
        this.symbol = symbol;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Stock o) {
  // PONIŻEJ PROSTA LOGIKA KTÓRA UMOŻLIWIA PORÓWNANIE LICZB
        // mozna zapisać w takiej formie
//        if(getPrice() < o.getPrice()) return -1;
//        if(getPrice() > o.getPrice()) return  1;
//        else return 0;

        // Metoda porównująca wartości double :

        // return Double.compare(this.getPrice(), o.getPrice());

        // Metoda porównująca double jak również inne wartości liczbowe

       // return (int) (this.getPrice() - o.getPrice());


// LOGIKA , KTÓRA NAJPIERW SORTUJE PO CENIE, W PRZYPADKU KIEDY CENA JEST TAKA SAMA
        // SORTUJE PO NAZWIE ,  JEŻELI NAZWA JEST TAKA SAMA TO
        // SORTUJE PO SYMBOLU

        //1 WERSJA :
//        int compareResult = (int) (this.getPrice() - o.getPrice());
//        if(compareResult == 0) {
//            compareResult= this.getName().compareToIgnoreCase(o.getName());
//            if(compareResult == 0){
//                compareResult =this.getSymbol().compareToIgnoreCase(o.getSymbol());
//            }
//        }
//        return compareResult;


        //2 WERSJA Z WYKORZYSTANIEM KLASY COMPARE TO BUILDER :

        return new CompareToBuilder()
                .append(this.getPrice(), o.getPrice())
                .append(this.getName(), o.getName())
                .append(this.getSymbol(), o.getSymbol())
                .build();


    }
}
