import java.util.Formatter;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        feesPaid = 0;
        this.id = id;
        this.name = name;
        this.grade = grade;
        feesTotal = 30000;
    }

    public void setGrade(int grade) {
        this.grade = grade;

    }

    public void updatePaidFees(int fees) {
        feesPaid = feesPaid + fees;
        feesTotal = feesTotal - fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal(int salary) {
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal-feesPaid;
    }
    @Override
    public String toString() {
        return "Name of the Student: " + name + " Total money paid to the school so far $" + feesPaid;
    }

}
