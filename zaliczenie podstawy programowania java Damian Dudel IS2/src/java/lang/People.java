package java.lang;

public class People implements Comparable<People> {
    private final String fName;
    private final String lName;
    private final int birthday;
    private final long pesel;

    public People(String fName, String lName, int birthday, long pesel) {
        this.fName = fName;
        this.lName = lName;
        this.birthday = birthday;
        this.pesel = pesel;
    }
    @Override
    public String toString() {
        return fName + "," + lName + "," + birthday + "," + pesel;
    }

    @Override
    public int compareTo(People people) {
        int primary = lName.compareTo(people.lName);
        return primary != 0 ? primary
                : lName.compareTo(people.lName);
    }
    public int getBirthday() { return birthday; }


}





