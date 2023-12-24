import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

    private String name;
    private String email;
    private double hourRate;
    private int capacity;
    private int freeDays;

    public Employee(String name, String email, double hourRate, int capacity, int freeDays) {
        this.name = name;
        this.email = email;
        this.hourRate = hourRate;
        this.capacity = capacity;
        this.freeDays = freeDays;
    }

    public double calculateDailyIncome() {
        return hourRate * capacity;
    }

    public double calculateMonthlyIncome() {
        return calculateDailyIncome() * (21 - freeDays);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți numărul de angajați (N): ");
        int numberOfEmployees = scanner.nextInt();


        ArrayList<Employee> employees = new ArrayList<>();


        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("\nIntroduceți detaliile pentru angajatul #" + (i + 1));

            System.out.print("Nume: ");
            String name = scanner.next();

            System.out.print("Email: ");
            String email = scanner.next();

            System.out.print("Tarif pe oră: ");
            double hourRate = scanner.nextDouble();

            System.out.print("Capacitate (ore pe zi): ");
            int capacity = scanner.nextInt();

            System.out.print("Zile libere: ");
            int freeDays = scanner.nextInt();


            Employee employee = new Employee(name, email, hourRate, capacity, freeDays);
            employees.add(employee);
        }


        System.out.println("\nSalariul lunar pentru fiecare angajat:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.calculateMonthlyIncome());
        }

        scanner.close();
    }

    public String getName() {
        return name;
    }
}
