public class App {
    private static Employee [] employees =new Employee[15];

    public App () {
        employees [0] = new Employee("Турцев ", "Егор ", "Олегович " , 1 , 58692);
        employees [1] = new Employee("Селивёрстов " , "Роман " , "Михайлович " , 2 , 65871);
        employees [2] = new Employee("Клинов " , "Валерий " , "Петрович " , 3 , 57896);
        employees [3] = new Employee("Целых " , "Полина " , "Игоревна " , 3 , 58789);
        employees [4] = new Employee("Альт " , "Сергей " , "Викторович " , 4 , 77256);
        employees [5] = new Employee("Холмов ", "Павел " , "Григорьевич " , 5 , 66247);
        employees [6] = new Employee("Калинин ", "Олег " , "Павлович " , 6 , 71256);
        employees [7] = new Employee("Сергеев ", "Пётр " , "Петрович " , 6 , 66241);
        employees [8] = new Employee("Лебедь ", "Анна " , "Марьевна " , 6 , 77256);
        employees [9] = new Employee("Климов ", "Валерий " , "Игоревич " , 6 , 72296);
        employees [10] = new Employee("Старостин ", "Константин " , "Сергеевич " , 6 , 78445);
        employees [11] = new Employee("Холмогоров ", "Роман " , "Павлович " , 6 , 69636);
    }
    public void printEmployees () {
        System.out.println("Сотрудники: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public void printFullNames () {
        System.out.println("ФИО Сотрудников: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public int sumOfSalaries () {
        int total = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
            }
        }
        return total;
    }
    public Employee minSalary () {
        Employee minSalary = null;
        for (Employee employee: employees) {
            if (employee != null) {
                if (minSalary == null) {
                    minSalary = employee;
                    continue;
                }
                if (employee.getSalary() < minSalary.getSalary()) {
                    minSalary = employee;
                }
            }
        } return minSalary;
    }
    public Employee maxSalary () {
        Employee maxSalary = null;
        for (Employee employee: employees) {
            if (employee != null) {
                if (maxSalary == null) {
                    maxSalary = employee;
                    continue;
                }
                if (employee.getSalary() > maxSalary.getSalary()) {
                    maxSalary = employee;
                }
            }
        } return maxSalary;
    }
    public int averageSalary () {
        int calculate = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                calculate ++;
            }
        }
        return sumOfSalaries() / calculate;
    }


}
