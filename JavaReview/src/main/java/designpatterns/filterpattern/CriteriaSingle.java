package designpatterns.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CHULEI on 2020/9/11.
 */

class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("single")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
