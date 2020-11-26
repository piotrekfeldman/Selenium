import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Brudnopis {

    public String Czas() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd_HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        return dtf.format(now);
    }

    public static void main(String[] args) {
        Brudnopis brudnopis = new Brudnopis();
        brudnopis.Czas();
    }
}
