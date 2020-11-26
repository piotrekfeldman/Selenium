package formatowanie;

public class Main {

    public static void main (String[] args)
    {
        int x= 4563258;
        float y= 3298.5646f;
        System.out.println(String.format("Moja liczba to %d",x));
        System.out.println(String.format("Moja liczba to %.2f" ,y));
        System.out.println(y);
    }
}
