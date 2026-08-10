//1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;
        int totalMarks = 0;

        System.out.println("Enter marks of " + n + " students:");

        for (int i = 0; i < n; i++) {
            int marks = sc.nextInt();
            totalMarks += marks;

            if (marks >= 90 && marks <= 100) {
                System.out.print("A ");
                countA++;
            } 
            else if (marks >= 80) {
                System.out.print("B ");
                countB++;
            } 
            else if (marks >= 70) {
                System.out.print("C ");
                countC++;
            } 
            else if (marks >= 60) {
                System.out.print("D ");
                countD++;
            } 
            else {
                System.out.print("F ");
                countF++;
            }
        }

        double average = (double) totalMarks / n;

        System.out.println("\n");
        System.out.println("A = " + countA);
        System.out.println("B = " + countB);
        System.out.println("C = " + countC);
        System.out.println("D = " + countD);
        System.out.println("F = " + countF);
        System.out.println("Average = " + average);

        sc.close();
    }
}

//2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } 
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist");
        } 
        else {
            System.out.println("Second Largest = " + secondLargest);
        }

        sc.close();
    }
}


//3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("[" + i + ", " + j + "]");
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No such pair exists");
        }

        sc.close();
    }
}

//4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < n; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);

        sc.close();
    }
}
