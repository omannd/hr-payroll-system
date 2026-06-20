public class PartTimeEmployee extends Employee{
    private int hoursWorked;

    public PartTimeEmployee (String name, double hourlyRate, int hoursWorked) {
        super(name, hourlyRate);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculatePay() {
        System.out.println("[Yarı Zamanlı] " + getName() + " | Toplam Ödeme: " + (getBaseSalary() * hoursWorked) + " TL");
    }
}
