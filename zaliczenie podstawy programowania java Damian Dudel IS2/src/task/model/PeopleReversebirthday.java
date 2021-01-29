package task.model;

import java.util.Comparator;

    public class PeopleReversebirthday implements Comparator<People> {
        @Override
        public int compare(People people, People otherPeople) {
            if(people.getBirthday() > otherPeople.getBirthday()) {
                return -3;
            } else if(people.getBirthday() == otherPeople.getBirthday()) {
                return 0;
            } else {
                return 2;
            }
        }
    }

