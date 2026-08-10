import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter Employee ID: ");
        int employeeId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String employeeName = sc.nextLine();


        int[] attendance = new int[7];

        System.out.println("Enter attendance for 7 working days (1 = Present, 0 = Absent):");

        for (int i = 0; i < 7; i++) {
            attendance[i] = sc.nextInt();

            if (attendance[i] != 0 && attendance[i] != 1) {
                System.out.println("Invalid Attendance Input");
                sc.close();
                return;
            }
        }

        int presentDays = 0;
        int absentDays = 0;

        for (int i = 0; i < 7; i++) {
            if (attendance[i] == 1) {
                presentDays++;
            } else {
                absentDays++;
            }
        }

        double attendancePercentage = (presentDays / 7.0) * 100;

        System.out.println("\nAttendance Report");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.printf("Attendance = %.2f%%\n", attendancePercentage);
        System.out.println("Absent Days = " + absentDays);

        if (attendancePercentage >= 90) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}