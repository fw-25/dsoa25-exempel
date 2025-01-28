import java.io.*;

public class FileUtils {

    public static Object loadObject(String fileName) {

        Object returnObj = null;

        try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(fileName))) {

            returnObj = objIn.readObject();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return returnObj;

    }

    public static void saveObject(Object objectToSave, String fileName) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {

            objOut.writeObject(objectToSave);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeTextFile(String fileContent, String fileName) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(fileContent);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String readTextFile(String fileName) {

        StringBuilder fileContent = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File " + fileName + " not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileContent.toString();

    }

}
