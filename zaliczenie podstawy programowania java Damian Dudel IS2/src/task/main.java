package task;

import task.model.Peopleevidence;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class main {
    private static Object People;

    public static void main(String[] args) {
        String line = "";
        String splitBy = ",";
        ArrayList<People> persons = new ArrayList<>();


        try (BufferedReader reader = new BufferedReader(new FileReader("evidence.csv"))) {
            while ((line = reader.readLine()) != null) {
                String[] People = line.split(splitBy);

                persons.add(new People(People[0], People[1], Integer.parseInt(People[2]), Long.parseLong(People[3])));
            }

        } catch (FileNotFoundException fnfe) {
            System.err.println("An attempt to open the file denoted by a specified pathname has failed");
        } catch (NumberFormatException nfe) {
            System.err.println("Error occurred while parsing birth date or pesel");
        } catch (IOException ioe) {
            System.err.println("I/O error occurred while performing readLine()");
        }

        Peopleevidence fileData = new Peopleevidence(persons);
        fileData.manageData();
    }
}
