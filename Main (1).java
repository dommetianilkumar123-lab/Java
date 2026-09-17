import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] marks = new int[n];

        // Input student details
        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter student name: ");
            names[i] = sc.next();

            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
        }

        // Calculate total, highest and lowest
        int total = 0;
        int highest = marks[0];
        int lowest = marks[0];

        for (int i = 0; i < n; i++) {

            total = total + marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        double average = (double) total / n;

        // Display summary report
        System.out.println("\n=================================");
        System.out.println("       STUDENT GRADE REPORT");
        System.out.println("=================================");

        System.out.println("Name\t\tMarks");

        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + "\t\t" + marks[i]);
        }

        System.out.println("---------------------------------");
        System.out.println("Average Score : " + average);
        System.out.println("Highest Score : " + highest);
        System.out.println("Lowest Score  : " + lowest);

        System.out.println("=================================");

        sc.close();
    }
}
