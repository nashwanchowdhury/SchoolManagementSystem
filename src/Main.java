import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 400);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);


        Student jerry = new Student(1, "jerry", 4);
        Student john = new Student(2, "john", 12);

        List<Student> studentList = new ArrayList<>();
        studentList.add(jerry);
        studentList.add(john);

        jerry.updatePaidFees(5000);
        john.updatePaidFees(4000);

        School ghs = new School(teacherList, studentList);
        System.out.println(ghs.getTotalMoneyEarned());

        lizzy.recieveSalary(lizzy.getSalary());



    }
}
