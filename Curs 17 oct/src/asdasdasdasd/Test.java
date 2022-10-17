package asdasdasdasd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("1234", "popescu", 23, 9.5f);
        Student s3 = new Student(s2);


        System.out.println("Nr.studenti: " + Student.numarStud());
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);



        Angajat a1 = new Angajat("5678", "Ionescu", "Vasile", Angajat.Categorie.FULLTIME);
        Angajat a2 = new Angajat("9820", "Vasilescu", "maricica", Angajat.Categorie.PARTTIME );

        ServerEmail serverEmail = new ServerEmail();
        ServerEmail.senders.add(s1);
        ServerEmail.senders.add(s2);
        ServerEmail.senders.add(s3);
        ServerEmail.senders.add(a1);
        ServerEmail.senders.add(a2);
        serverEmail.sendAll();

        List<? extends Integer> intList = new ArrayList<>();
//        intList.add(new Integer())-------------bubuita
        Integer[] vector = {10, 20, 30};
        List<Integer> lista = Arrays.asList();
        intList = lista;
        for(Integer elem:intList)
            System.out.println(elem);

        List<? extends Number> numlist = intList;
        for(Number elem: numlist)
            System.out.println(elem);

        List<? super Student> lista2 =new ArrayList<>();
        lista2.add(s1);
        lista2.add(s2);
        lista2.add(s3);
       // lista2.add(a1); -------------bubuita

        for(Object s:lista2)
            System.out.println(s);

        List<? extends Persoana> lista3 = new ArrayList<>();
        //lista3.add(a1);----------------BUBUIT
        lista3 = ServerEmail.senders;
        for(Object a: lista3)
            System.out.println(a);



    }
}
