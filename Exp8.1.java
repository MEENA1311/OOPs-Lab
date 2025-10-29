import java.util.Scanner;
public class Q2Thread {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] nums = new int[10];
System.out.println("Enter 10 numbers:");
for (int i = 0; i < 10; i++) {
nums[i] = sc.nextInt();
}
EvenThread even = new EvenThread(nums);
OddThread odd = new OddThread(nums);
even.start();
odd.start();
}
}
class EvenThread extends Thread {
int[] arr;
EvenThread(int[] arr) {
this.arr = arr;
}
public void run() {
for (int n : arr) {
if (n % 2 == 0) {
System.out.println("Even: " + n);
try { Thread.sleep(2000); } catch (InterruptedException e) {}
}
}
}
}
class OddThread extends Thread {
int[] arr;
OddThread(int[] arr) {
this.arr = arr;
}
public void run() {
for (int n : arr) {
if (n % 2 != 0) {
System.out.println("Odd: " + n);
try { Thread.sleep(2000); } catch (InterruptedException e) {}
}
}
}
}
