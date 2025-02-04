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

    public void reverse() {

    }

    public String toString() {
        return Arrays.toString(values);
    }
}
