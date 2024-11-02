package Salary;
import java.util.Scanner;
public class Salary {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalSalary = 0;
        double totalChildren = 0;
        double highestSalary = 0;
        double lowestSalary = 0;
        int surveys = 5;
        for (int i = 1; i <= surveys; i++) {

        System.out.println("Survey " + i + " by the city hall on average salary and number of children");

        System.out.print("What is the average salary of the population: ");
        double salary = input.nextDouble();

        System.out.print("What is the number of children: ");
        double children = input.nextDouble();
        
	totalSalary += salary;
        totalChildren += children;

        if (i == 1) {
                    lowestSalary = salary;
        }

        if (salary > highestSalary) {
                    highestSalary = salary;
        }

        if (salary < lowestSalary) {
                    lowestSalary = salary;
        }
        }

        double averageSalary = totalSalary / surveys;
        double averageChildren = totalChildren / surveys;

        System.out.println("Number of surveys conducted: " + surveys);
        System.out.printf("Average salary of the population: %.2f%n", averageSalary);
        System.out.printf("Average number of children in the population: %.2f%n", averageChildren);
        System.out.printf("Highest salary found: %.2f%n", highestSalary);
        System.out.printf("Lowest salary found: %.2f%n", lowestSalary);

        input.close();
	}
}