package designpatterns.filterpattern;

/**
 * Created by CHULEI on 2020/9/11.
 */

class Person {
    private String name;
    private String gender;
    private String maritalStauts;

    public Person(String name, String gender, String maritalStauts) {
        this.name = name;
        this.gender = gender;
        this.maritalStauts = maritalStauts;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStauts;
    }
}
