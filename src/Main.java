import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] testdata = {"Frodo", "Sam", "Gandalf", "Aragorn", "Legolas", "Gimli", "Boromir", "Merry", "Pippin", "Bilbo", "Elrond", "Galadriel", "Saruman", "Theoden", "Eowyn", "Eomer", "Faramir", "Denethor", "Arwen"};
        String[] sortedData = {"Aragorn", "Arwen", "Bilbo", "Boromir", "Denethor", "Elrond", "Eomer", "Eowyn", "Faramir", "Frodo", "Galadriel", "Gandalf", "Gimli", "Gollum", "Legolas", "Merry", "Pippin", "Sam", "Saruman", "Theoden"};

        StringArray names = new StringArray(sortedData);

        System.out.println(names.toString());
        names.add("Gollum");
        System.out.println(names.toString());
        names.reverse();
        System.out.println(names.toString());


        System.exit(0);
        // Testa loopa olika tidskomplexitet
        new BigO();

    }
}



