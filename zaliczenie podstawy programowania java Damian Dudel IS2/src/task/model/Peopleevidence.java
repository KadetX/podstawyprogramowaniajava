package task.model;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Peopleevidence<userInput> {
    private ArrayList<People> evidence;

    public Peopleevidence(ArrayList<People> evidence) {
        this.evidence = evidence;
    }

    public Peopleevidence() {
        Scanner input = new Scanner(System.in);
        int userInput = -1;
        System.out.println("""
                Available actions\s
                2 - exit\s
                4 - show data from file\s
                6 - sort data by last name (ascending)\s
                8 - sort data by birth year (descending)\s
                1 - add data to file\s
                """);
        System.out.println("Please provide one of the numbers above: \s");
    }
    while(userInput !=0)
    private final Object userInput;
    {
        Random input = null;
        assert false;
        userInput = input.nextInt();
        switch (userInput) {
            case 2:
                System.out.println("ByeBye");
            case 4:
                System.out.println("Evidence from file:");
                evidence.forEach(System.out::println);
                chooseNext();
            case 6:
                ArrayList<People> sortedBylName = new ArrayList<>(evidence);
                Collections.sort(sortedBylName);
                System.out.println("Evidence sorted by lName, ascending:");
                sortedBylName.forEach(System.out::println);
                chooseNext();
            case 8:
                ArrayList<People> sortedByYear = new ArrayList<>(evidence);
                sortedByYear.sort(new PeopleReversebirthday());
                System.out.println("Evidence sorted by birthday, descending: ");
                sortedByYear.forEach(System.out::println);
                chooseNext();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + userInput);
        }

        private void chooseNext () {
    }
        ;

    }

    private void chooseNext() {
    }

    public void manageData() {
    }

    ;

}