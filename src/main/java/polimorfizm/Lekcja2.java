package polimorfizm;

public class Lekcja2 {

    public static void main(String[]args) {

        ObslugaStudenta os=new ObslugaStudenta();
        StudentDzienny sd=new StudentDzienny();
        StudentOnline ss=new StudentOnline();
      //  Student sd=new StudentDzienny();
       // Student ss=new StudentOnline();
        os.obsluz(sd);
        os.obsluz(ss);

    }
    }

class ObslugaStudenta{

public void obsluz(Student s)
{
    s.Obecnosc();

}

}
