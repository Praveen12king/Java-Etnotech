import java.util.Scanner;

public class studentrade {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks of the student:");
        int marks = scanner.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
            System.out.println("Rating: 5 Stars");
        }
        else if (marks >= 80) {
            System.out.println("Grade: B");
            System.out.println("Rating: 4 Stars");
        }
        else if (marks >= 70) {
            System.out.println("Grade: C");
            System.out.println("Rating: 3 Stars");
        }
        else if (marks >= 50) {
            System.out.println("Grade: D");
            System.out.println("Rating: Average Student");
        }
        else {
            System.out.println("Grade: F");
            System.out.println("Rating: Needs Improvement");
        }
        scanner.close();
    }
}