package designpatterns.observerpattern.observer2;

/**
 * Created by CHULEI on 2020/9/9.
 */

class Test {
    public static void main(String[] args) {
        SubjectFor3d subjectFor3d = new SubjectFor3d();
        SubjectForSSQ subjectForSSQ = new SubjectForSSQ();

        Observer1 observer1 = new Observer1();
        observer1.registerSubject(subjectFor3d);
        observer1.registerSubject(subjectForSSQ);

        subjectFor3d.setMsg("hello 3d'nums: 110");
        subjectForSSQ.setMsg("ssq'nums: 12, 13, 31, 4, 5, 14");
    }
}
