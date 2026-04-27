import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, sum = 0;
        double average;

        System.out.print("Enter number of students: ");
        n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter marks of students:");

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sum = sum + marks[i];
        }

        average = (double) sum / n;

        System.out.println("\nStudent Marks are:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " Marks = " + marks[i]);
        }

        System.out.println("\nTotal Marks = " + sum);
        System.out.println("Average Marks = " + average);

        sc.close();
    }
}