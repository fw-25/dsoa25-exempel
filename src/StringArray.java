import java.util.Arrays;

public class StringArray {

    String[] values;

    public StringArray(String[] values) {
        System.out.println("new stringArray");
        this.values = values;
    }

    public void add(String value) {
        System.out.println("add " + value);
        String[] newValues = new String[values.length+1];
        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i];
        }
        newValues[values.length] = value;
        values = newValues;
    }

    public void insert(int index, String value) {
        add(null); // förläng vår array med ett tomt värde
        // Flytta varje värde ett steg framåt, börjandes från slutet
        for (int i = values.length-1; i > index; i--) {
            values[i] = values[i-1];
        }
        // Lägg in vårt nya värde på rätt plats
        values[index] = value;

    }

    public void reverse() {
        // Ändra ordning genom att swappa i början och slutet
        for (int i = 0; i < Math.floor(values.length/2); i++) {
            String temp = values[i];
            values[i] = values[values.length-i-1];
            values[values.length-i-1] = temp;
        }
    }

    public String toString() {
        return Arrays.toString(values);
    }
}
