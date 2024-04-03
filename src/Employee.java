public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private int group;
    private double salary;
    private int id;
    private static int idCount = 1;

    public Employee(String surname, String name, String patronymic, int group, int salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.group = group;
        this.salary = salary;
        this.id = idCount++;
    }
    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getGroup() {
        return group;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setSalary(double Salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return + id + " ФИО: " + surname + name + patronymic + " Отдел " + group + " зар.плата " + salary;
    }

    public boolean printFullName() {
        return false;
    }
}
