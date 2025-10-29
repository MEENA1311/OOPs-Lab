import java.util.Scanner;
class InvalidEmpidException extends Exception {
InvalidEmpidException(String msg) {
super(msg);
}
}
class InvalidNameException extends Exception {
InvalidNameException(String msg) {
super(msg);
}
}
class InvalidAgeException extends Exception {
InvalidAgeException(String msg) {
super(msg);
}
}
class Employee {
int empid;
String name;
int age;
Employee(int empid, String name, int age) {
this.empid = empid;
this.name = name;
this.age = age;
}
void display() {
System.out.println("Employee Details:");
System.out.println("Emp ID: " + empid);
System.out.println("Name: " + name);
System.out.println("Age: " + age);
}
}
public class Main {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
try {
System.out.print("Enter the employee id: ");
int empid = s.nextInt();
System.out.print("Enter the name: ");
String name = s.next();
System.out.print("Enter the age: ");
int age = s.nextInt();
// Validation before creating Employee object
if (empid < 1000) {
throw new InvalidEmpidException(" Employee ID must be at least 4 digits!");
}
if (name == null || name.trim().isEmpty() || name.matches(".*\\d.*")) {
throw new InvalidNameException("Name cannot contain numbers or be empty!");
}
if (age > 50) {
throw new InvalidAgeException("Age cannot be greater than 50!");
}
Employee e = new Employee(empid, name, age);
e.display();
} catch (InvalidEmpidException | InvalidNameException | InvalidAgeException e1) {
System.out.println(e1.getMessage());
} finally {
s.close()
  }
}
}
