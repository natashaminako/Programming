package Exams;
import java.util.Scanner;
public class ExamsDiabetes {
    public ExamsDiabetes() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exams exams = new Exams();

        System.out.print("Enter the exam identifier: ");
        exams.idExam = input.nextInt();

        System.out.print("Enter glucose level (mg/dL): ");
        exams.glucoseLevel = input.nextInt();

        System.out.println("Exam ID: " + exams.idExam);
        System.out.println("Glucose level: " + exams.glucoseLevel + "mg/dL");

        String diagnosis = exams.getDiagnosis();
        System.out.println("Diagnosis: " + diagnosis);

        input.close();
    }
}