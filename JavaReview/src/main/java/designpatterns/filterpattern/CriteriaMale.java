package designpatterns.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CHULEI on 2020/9/11.
 */

class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("male")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
