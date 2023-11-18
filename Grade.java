import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("_#_Grade Calculator_#_");
        System.out.println();
        System.out.print("Enter your name: ");
        String Name = sc.nextLine();

        System.out.println();

        System.out.print("Enter your mathematics marks: ");
        int mathematics = sc.nextInt();

        System.out.print("Enter your physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter your biology makrs: ");
        int biology = sc.nextInt();

        System.out.print("Enter your geometry makrs: ");
        int Geometry = sc.nextInt();

        System.out.print("Enter your history makrs: ");
        int History = sc.nextInt();

        int Total = mathematics + physics + biology + Geometry + History;

        int NumOfSub = 5;
        System.out.println();
        System.out.println("Total of your marks: " + Total);
        sc.close();

        double averagePercentage = (Total / (NumOfSub * 100.0)) * 100; // Average percentage of the marks
        String grade = CalGrade(averagePercentage);

        System.out.println();
        System.out.println("Congratulation! " + Name + " " + grade);
    }

    public static String CalGrade(double percentage) {
        if (percentage >= 90) {
            return "You got A+ grade";
        } else if (percentage >= 80) {
            return "You got B+ grade";
        } else if (percentage >= 70) {
            return "You got C+ grade";
        } else if (percentage >= 60) {
            return "You got D+ grade";
        } else if (percentage >= 50) {
            return "You got E grade";
        } else if (percentage >= 40) {
            return "You got F grade";
        } else {
            return "You are failed, Come up with worrier spirit next time!";
        }
    }
}
