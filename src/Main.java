import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Mehmet Yağlı", 45321.32, 9876);
        employeeList.add(fullTimeEmployee);

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Ahmet Keklik", 212.24, 80);
        employeeList.add(partTimeEmployee);

        for (Employee employee : employeeList) {
            employee.calculatePay();
        }
    }
}