import java.util.Scanner;
public class Q3Threads {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();
Thread table = new Thread(new TableThread(num));
Thread divisor = new Thread(new DivisorThread(num));
table.start();
divisor.start();
}
}
class TableThread implements Runnable {
int n;
TableThread(int n) { this.n = n; }
public void run() {
for (int i = 1; i <= 10; i++) {
System.out.println("Table: " + n + " x " + i + " = " + (n * i));
try { Thread.sleep(2000); } catch (InterruptedException e) {}
}
}
}
class DivisorThread implements Runnable {
int n;
DivisorThread(int n) { this.n = n; }
public void run() {
System.out.println("Factors of " + n + ":");
for (int i = 1; i <= n; i++) {
if (n % i == 0) {
System.out.println(i);
try { Thread.sleep(2000); } catch (InterruptedException e) {}
}
}
}
}
