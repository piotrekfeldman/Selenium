package instrukcjewarunkowe;

public class Instrukcj {
    public static void main(String[] args)
    {
        int i =10;

        switch (i){
            case 1:
                Show(i);
                break;
            case 5:
                Show(i);
                break;
            case 10:
                Show(i);
                break;
            default:
                System.out.println("nie ma takiej liczby");
        }



    }
    public static void Show(int i){
        System.out.println("Numer to "+i);

    }
}
