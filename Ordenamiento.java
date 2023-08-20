import java.util.Scanner;

public class Ordenamiento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese numero:");
            nums[i] = input.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}