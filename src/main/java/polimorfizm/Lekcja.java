package polimorfizm;

public class Lekcja {

    public static void main(String[]args) {

        Student s = new Student();



       Student[] studenci = new Student[3];
        studenci[0] = new StudentDzienny();
        studenci[1] = new StudentZaoczny();
        studenci[2] = new StudentOnline();
        System.out.println("T");
        for(Student st: studenci){
            st.Obecnosc();
        }
        System.out.println("------------------");
        for (int i = 0; i < studenci.length; i++){

            studenci[i].Obecnosc();


        }
       /* Student s3=new StudentOnline();
        wezStudenta(s3);*/
    }

    public static void wezStudenta(Student s)
    {

        s.Obecnosc();
    }
}
