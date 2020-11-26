package kolekcjeSortowanie;

import kolekcjeSortowanie.stock.Stock;
import kolekcjeSortowanie.stock.StockComparator;
import org.apache.commons.lang3.builder.CompareToBuilder;

import java.util.*;
import java.util.stream.Collectors;

public class ExchangeApp {

    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(1, 5, 32, 76, 3, 21 ,7 , 333, 43, 221);

        System.out.println("Nieposortowane : "+ prices);

        Collections.sort(prices);

        System.out.println("Posortowane : "+ prices);

        Collections.reverse(prices);

        System.out.println("Posortowane malejąco: "+ prices);

        System.out.println("------------------------------------");

        Stock stock1 = new Stock("amazon","cdp",15.78);
        Stock stock2 = new Stock("amazon","amz",15.78);
        Stock stock3 = new Stock("microsoft","mst",157.65);
        Stock stock4 = new Stock("google","ggl",7.08);
        Stock stock5 = new Stock("apple","apl",66.43);


        List<Stock> stockList= Arrays.asList(stock1, stock2, stock3, stock4, stock5);

        System.out.println(stockList);
        System.out.println("------------------------------------");

        Collections.sort(stockList);

        stockList.forEach(System.out::println);


        Collections.reverse(stockList);
        System.out.println("------------------------------------");

        stockList.forEach(System.out::println);

        System.out.println("-----------COMPARATOR-----------------");

        Collections.sort(stockList, new StockComparator());
       // Collections.reverse(stockList);


        stockList.forEach(System.out::println);

        //      WERSJA PEŁNA
        //            Comparator<Stock> stockComparator = new Comparator<Stock>() {
//                @Override
//                public int compare(Stock o1, Stock o2) {
//                    return new CompareToBuilder()
//                            .append(o1.getPrice(),  o2.getPrice())
//                            .append(o1.getName(),   o2.getName())
//                            .append(o1.getSymbol(), o2.getSymbol())
//                            .build();
//                }
//
        //      WERSJA LAMBDA

        Comparator<Stock> stockComparator = (o1, o2) -> new CompareToBuilder()
              .append(o1.getPrice(),  o2.getPrice())
              .append(o1.getName(),   o2.getName())
              .append(o1.getSymbol(), o2.getSymbol())
              .build();

        System.out.println("from inner comparator");
        Collections.sort(stockList, stockComparator);

        stockList.forEach(System.out::println);


        System.out.println("******************STREAMY");


        List<Stock> stockStream = stockList.stream()
                .filter(stock -> stock.getPrice() >40)
                .sorted(stockComparator)
                .collect(Collectors.toList());
        stockStream.forEach(System.out::println);


        System.out.println("******************STREAMY POFILTROWANE *****************");

        stockList.stream()
                .filter(stock -> stock.getPrice() >10)
                .filter(stock -> stock.getName().contains("am"))
                .map(stock -> "Nazwa :"+stock.getName()+"\n"+"Cena :"+stock.getPrice())
                .forEach(System.out::println);

        System.out.println("******************STREAMY POFILTROWANE *****************");




        System.out.println("*****************");
        stockList.sort(stockComparator);

        stockList.forEach(System.out::println);

        System.out.println("TREESET******************");

        TreeSet<Stock> stockTreeSet  = new TreeSet<>(stockComparator);

        stockTreeSet.add(stock1);
        stockTreeSet.add(stock2);
        stockTreeSet.add(stock3);
        stockTreeSet.add(stock4);
        stockTreeSet.add(stock5);
        stockTreeSet.forEach(System.out::println);

        System.out.println("-----------TREEMAP-----------------");

        TreeMap<Stock, String> stockStringTreeMap = new TreeMap<>(stockComparator);

        stockStringTreeMap.put(stock1, "stock1");
        stockStringTreeMap.put(stock2, "stock2");
        stockStringTreeMap.put(stock3, "stock4");
        stockStringTreeMap.put(stock4, "stock4");
        stockStringTreeMap.put(stock5, "stock5");

        stockStringTreeMap.keySet().forEach(System.out::println);
    }







    }

