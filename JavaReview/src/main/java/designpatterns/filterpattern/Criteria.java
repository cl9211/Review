package designpatterns.filterpattern;

import java.util.List;

/**
 * Created by CHULEI on 2020/9/11.
 */

interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
