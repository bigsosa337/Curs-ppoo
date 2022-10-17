package aaaaaaaaaaaaaaaaaaaaaaaaa;

import java.beans.PropertyDescriptor;

public class main {
    public static void main(String[] args) {


        Box<Integer> integerBox = new Box<>();
        integerBox.add(1);
        integerBox.add(2);
        integerBox.add(3);
        integerBox.show();
        System.out.println("Cutia are " +integerBox.getSize() + " elemente");

        Box<String> stringBox = new Box<>();
        stringBox.add("unu");
        stringBox.add("doi");
        stringBox.add("trei");
        stringBox.show();
        stringBox.remove("doi");
        System.out.println("cutia are " + stringBox.getSize() + " elemente");

        NumberBox<Integer> numBox = new NumberBox<>();
        numBox.add(10);
        numBox.add(20);
        numBox.add(30);
        numBox.show();
        System.out.println("suma este " + numBox.sum() );

        NumberBox<? super Integer> cutie1 = new NumberBox<>();
        cutie1.add(30);
        cutie1.add(62);
        cutie1.add(212);
        cutie1.show();
        System.out.println("sunt " + cutie1.getSize() + " elemente");

        OrderedPair<String, Integer> p1 = new OrderedPair<>("nota", 10);
        p1.show();

        OrderedPair<String,String > p2 = new OrderedPair<>("hello","world");
        p2.show();

        OrderedPair<String, Box<Integer>> p3 = new OrderedPair<>("cutie", integerBox);
        System.out.println(p3.getKey());
        p3.getValue().show();

        OrderedPair<String , Box<String >> p4 = new OrderedPair<>("DropBox", stringBox);
        System.out.println(p4.getKey());
        p4.getValue().show();
        p4.setKey("Dropbox2");
        System.out.println(p4.getKey());
        p4.getValue().add("ceva");
        p4.getValue().remove("unu");
        p4.getValue().show();

    }
}
