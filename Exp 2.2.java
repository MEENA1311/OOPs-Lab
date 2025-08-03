import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        System.out.print("Unique numbers are = ");
        for (int i = 0; i < x; i++) {
            int num = arr[i];
            int freq = 0;
            for (int j = 0; j < x; j++) {
                if (arr[j] == num) {
                    freq++;
                }
            }
            if (freq == 1) {
                System.out.print(num + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println("Count = " + count);
    }
}
