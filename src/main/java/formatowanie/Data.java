package formatowanie;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

    public static void main (String[] args)
    {
        Date data=new Date();
        System.out.println("przed formatem "+data);

        SimpleDateFormat formatowanie=new SimpleDateFormat("dd.MM.yyyy HH:mm:ss Z");
        String strData=formatowanie.format(data);



        System.out.println(strData);
    }
}
