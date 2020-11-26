package interfaceImplemenation;

public class PolishTrafficClass implements TrafficInterface {

    public static void main(String[] args) {

        TrafficInterface tt = new PolishTrafficClass(); // tak wygląda składnia w przypadku interfejsów
        tt.red();
        tt.yellow();

    }

    @Override
    public void yellow() {
        System.out.println("Yellow");

    }

    @Override
    public void red() {
        System.out.println("Red");

    }
}
