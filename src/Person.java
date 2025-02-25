import java.util.Random;

public class Person implements Comparable<Person> {
    String name;
    int rank;
    int gold;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int rank) {
        this.name = name;
        this.rank = rank;
        this.gold = (new Random()).nextInt(200);
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public int compareTo(Person person) {
        return person.getGold() - gold;
        //return name.compareTo(person.getName());

    }
    private int getGold() {
        return gold;
    }

    @Override
    public String toString() {
        return name + " (" + gold + ")";
    }

}

