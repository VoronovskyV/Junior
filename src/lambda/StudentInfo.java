package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentInfo {

    void testStudents(ArrayList<Student> al, Predicate<Student> sc) {
        for (Student s : al) {
            if (sc.test(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Иван", 'М', 22, 3, 8.3);
        Student st2 = new Student("Николай", 'М', 28, 2, 6.4);
        Student st3 = new Student("Елена", 'Ж', 19, 1, 8.9);
        Student st4 = new Student("Петер", 'М', 35, 4, 7);
        Student st5 = new Student("Мария", 'Ж', 23, 3, 7.4);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();

        /*info.testStudents(students, (Student p) ->
        { return p.avgGrade < 8;});*/

        Predicate<Student> p = student -> student.avgGrade > 7.5;
        Predicate<Student> p2 = student -> student.sex == 'М';
        info.testStudents(students,p.negate());



        /*System.out.println("********************");
        info.testStudents(students, s -> {System.out.println("Hello");
        return s.avgGrade > 8;});

        System.out.println("------------------");
        info.testStudents(students, (Student s) -> s.age > 20 && s.avgGrade < 9.3 && s.sex == 'Ж');
*/

    }
}





