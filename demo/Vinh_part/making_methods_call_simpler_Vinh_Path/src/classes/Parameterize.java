package classes;

public class Parameterize {

    public void tenPercentRaise() {
        double salary = 100;
        salary = salary * 1.1;
        System.out.println("Salary 10%: " + Math.round(salary) + "$");
    }

    public void fivePercentRaise() {
        double salary = 100;
        salary = salary * 1.05;
        System.out.println("Salary 5%: " + Math.round(salary) + "$");
    }

    // Combine 2 methods with 1 main Parameter is factor
    public void raise(double factor) {
        double salary = 100;
        salary *= (1 + factor);
        System.out.println("Salary " + Math.round(factor * 100) + "%: " + Math.round(salary) + "$");
        System.out.println("Salary factor: " + factor + " = " + Math.round(factor * 100) + "%");
    }
}
