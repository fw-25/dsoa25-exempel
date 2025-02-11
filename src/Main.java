import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] testdata = {"Frodo", "Sam", "Gandalf", "Aragorn", "Legolas", "Gimli", "Boromir", "Merry", "Pippin", "Bilbo", "Elrond", "Galadriel", "Saruman", "Theoden", "Eowyn", "Eomer", "Faramir", "Denethor", "Arwen"};
        String[] sortedData = {"Aragorn", "Arwen", "Bilbo", "Boromir", "Denethor", "Elrond", "Eomer", "Eowyn", "Faramir", "Frodo", "Galadriel", "Gandalf", "Gimli", "Legolas", "Merry", "Pippin", "Sam", "Saruman", "Theoden"};

        Graphy graphy = new Graphy();
        graphy.addNode("sk", "Skjorta");
        graphy.addNode("sl", "Slips");
        graphy.addNode("je", "Jeans");
        graphy.addNode("cr", "Crocs");

        graphy.addEdge("sk", "sl");
        graphy.addEdge("sk", "je");
        graphy.addEdge("sl", "je");
        graphy.addEdge("sl", "sk");
        graphy.addEdge("je", "sk");
        graphy.addEdge("je", "sl");
        graphy.addEdge("je", "cr");
        graphy.addEdge("cr", "je");

        System.out.println(graphy);

    }
}



