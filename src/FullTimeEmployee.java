public class FullTimeEmployee extends Employee{
    private double bonus;

    public FullTimeEmployee(String name, double baseSalary, double bonus){
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public void calculatePay() {
        System.out.println("[Tam Zamanlı] " + getName() + " | Toplam Ödeme: " + (getBaseSalary() + bonus) + " TL");
    }
}
