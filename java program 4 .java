import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");
        String input = sc.nextLine();

        String[] values = input.split(",");

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(values[i].trim());
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
