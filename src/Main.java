public class Main {
    public static void main(String[] args) {
        App app = new App();
        app.printEmployees();
        System.out.println("Самой низкой зарплатой среди сотрудников обладает: " + app.minSalary());
        System.out.println("Самой высокой зарплатой среди сотрудников обладает: " + app.maxSalary());
        System.out.println(app.sumOfSalaries() + " Сумма зарплат");
        System.out.println(app.averageSalary() + " Средняя зарплата");
    }
}