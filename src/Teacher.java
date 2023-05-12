public class Teacher {
    private int id;
    private String name;

    private int salary;

    private int salaryearned;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        salaryearned = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void recieveSalary(int salary) {
        salaryearned += salary;
        School.updateTotalMoneySpent(salaryearned);
    }


    @Override
    public String toString() {
        return "Name of the Teacher: " + name + " Total salary earned so far $" + salaryearned;
     }
    }



