import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Graphy graphy = new Graphy();

        Queuey queuey = new Queuey();
        queuey.enqueue("Aragorn");
        queuey.enqueue("Arwen");
        System.out.println("Först i kön: " + queuey.peek());
        System.out.println(queuey.toString());
        queuey.enqueue("Bilbo");
        System.out.println(queuey.toString());
        System.out.println("dequeue: " + queuey.dequeue());
        System.out.println(queuey.toString());

        System.out.println();
        //new CCCircularArr();

        String[] testdata = {"Frodo", "Sam", "Gandalf", "Aragorn", "Legolas", "Gimli", "Boromir", "Merry", "Pippin", "Bilbo", "Elrond", "Galadriel", "Saruman", "Theoden", "Eowyn", "Eomer", "Faramir", "Denethor", "Arwen"};
        String[] sortedData = {"Aragorn", "Arwen", "Bilbo", "Boromir", "Denethor", "Elrond", "Eomer", "Eowyn", "Faramir", "Frodo", "Galadriel", "Gandalf", "Gimli", "Legolas", "Merry", "Pippin", "Sam", "Saruman", "Theoden"};

        /**
         * Stack
         */
        Stacky stacky = new Stacky(5);
        stacky.push("Frodo");
        stacky.push("Sam");
        stacky.push("Gandalf");
        stacky.push("Gimli");
        stacky.push("Legolas");
        stacky.push("Boromir");
        System.out.println(stacky.toString());



        System.out.println("");
        /**
         * Linked list
         */
        Person frodo = new Person(testdata[0]);
        Person sam = new Person(testdata[1]);
        Person gandalf = new Person(testdata[2]);
        Person aragorn = new Person(testdata[3]);

        Linky linky = new Linky();
        linky.add(frodo);
        linky.add(sam);
        linky.add(gandalf);
        System.out.println(linky.toString());
        linky.add(aragorn);
        System.out.println(linky.toString());
        System.out.println("Liky has " + linky.size() + " nodes.");

    }
}



