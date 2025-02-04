import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] testdata = {"Frodo", "Sam", "Gandalf", "Aragorn", "Legolas", "Gimli", "Boromir", "Merry", "Pippin", "Bilbo", "Elrond", "Galadriel", "Saruman", "Theoden", "Eowyn", "Eomer", "Faramir", "Denethor", "Arwen"};
        String[] sortedData = {"Aragorn", "Arwen", "Bilbo", "Boromir", "Denethor", "Elrond", "Eomer", "Eowyn", "Faramir", "Frodo", "Galadriel", "Gandalf", "Gimli", "Legolas", "Merry", "Pippin", "Sam", "Saruman", "Theoden"};

        Person p1 = new Person(testdata[0]);
        Person p2 = new Person(testdata[1], p1);
        Person p3 = new Person(testdata[2], p2);
        Person p4 = new Person(testdata[3], p3);

        //System.out.println(p4.getName());
        Person current = p4;
        while(current != null) {
            System.out.println(current.getName());
            current = current.next;
        }


        StringArray names = new StringArray(sortedData);
        System.out.println(names.toString());

        names.add("Gollum");
        names.insert(2, "Treebeard");
        names.reverse();
        System.out.println(names.toString());

        // reverse utan att ändra på ursprungliga:
        //System.out.println(Arrays.toString(Utils.arrayReverse(sortedData)));



        System.exit(0);
        // Testa loopa olika tidskomplexitet
        new BigO();

    }
}



