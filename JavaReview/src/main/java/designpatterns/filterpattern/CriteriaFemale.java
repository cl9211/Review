package designpatterns.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CHULEI on 2020/9/11.
 */

class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("female")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
