package anagramy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Anagram {

    public static void main(String[] args) throws Exception {

            Anagram a = new Anagram();

            List<String> lista = new ArrayList<String>();
            List<String> listaAnagramów = new ArrayList<String>();

            lista = a.wczytajPlik();

            if (lista.size() == 0) {
                System.out.println("Nie wczytano słów");
            }
            else if(lista.size() != 0){
                System.out.println(String.format("Wczytano %d unikalnych słów.", lista.size()));
                listaAnagramów=a.znajdzAnagramy(lista);
                System.out.println(String.format("Znaleziono %d anagramów", listaAnagramów.size()));
            for (String s : listaAnagramów){
                System.out.println(s);
            }
            }
    }

    public List<String> wczytajPlik() throws Exception {
        List<String> listaslow = new ArrayList<String>();
        Set<String> slowaSet = new HashSet<String>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\piotr\\MvnExercises\\src\\main\\java\\anagramy\\anagram2.txt"));
        try {
            String linia;
            while ((linia = bufferedReader.readLine()) != null) {
                if (!linia.equals("")) {
                    slowaSet.add(linia);
                }
            }
            bufferedReader.close();
            listaslow.addAll(slowaSet);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Błąd odczytu pliku!");
        }
    return listaslow;
    }

    public List<String> znajdzAnagramy(List<String> listaSlow) {
        Date dStart = new Date();

              String s = "Wyszukiwanie anagramów ";

        long totalComp = 0;
        List<String> list = new ArrayList<String>();

        System.out.print(s);

        for (int x = 0; x < listaSlow.size(); x++) {
            for (int y = x + 1; y < listaSlow.size(); y++) {


                String str1 = listaSlow.get(x);
                String str2 = listaSlow.get(y);

                totalComp++;

                if (porownajSlowa(str1, str2)) {
                    if (x % 20 == 0) {
                        System.out.print("@");
                    }
                    list.add(str1 + " - " + str2);
                }
            }
        }

        System.out.println(String.format("\n\nLiczba wykonanych porównań %,d", totalComp));
        Date dEnd = new Date();
        long czas = (dEnd.getTime() - dStart.getTime()) / 1000;

        System.out.println(String.format("Porównanie trwało %,d sekund", czas));

    return list;

    }

    public boolean porownajSlowa(String str1, String str2) {
        String pstr1 = str1.toLowerCase();
        String pstr2 = str2.toLowerCase();

        char[] c1 = pstr1.toCharArray();
        char[] c2 = pstr2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        String sorted1 = new String(c1);
        String sorted2 = new String(c2);
        return sorted1.equals(sorted2);

    }
}
