import java.util.*;
abstract class Device {
int deviceId;
String brand;
double price;
Device(int deviceId, String brand, double price) {
this.deviceId = deviceId;
this.brand = brand;
this.price = price;
}
abstract void displayDetails();
}
interface Discountable {
void applyDiscount(double percentage);
double finalPrice();
}
class SmartPhone extends Device implements Discountable {
private double discountedPrice;
SmartPhone(int deviceId, String brand, double price) {
super(deviceId, brand, price);
this.discountedPrice = price; // initially same as price
}
@Override
public void applyDiscount(double percentage) {
discountedPrice = price - (price * (percentage / 100));
System.out.println("Discount of " + percentage + "% applied!");
}
@Override
public double finalPrice() {
return discountedPrice;
}
@Override
public void displayDetails() {
System.out.println("----- Device Details -----");
System.out.println("Device ID: " + deviceId);
System.out.println("Brand: " + brand);
System.out.println("Original Price: " + price);
System.out.println("Final Price after Discount: " + discountedPrice);
System.out.println("---------------------------");
}
}
public class SmartDeviceApplication {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
ArrayList<SmartPhone> phones = new ArrayList<>();
int choice;
do {
System.out.println("\n--- Smart Device Store ---");
System.out.println("1. Add Smartphone");
System.out.println("2. Apply Discount");
System.out.println("3. View Device Details");
System.out.println("4. Exit");
System.out.print("Enter your choice: ");
choice = sc.nextInt();
switch (choice) {
case 1:
System.out.print("Enter Device ID: ");
int id = sc.nextInt();
System.out.print("Enter Brand: ");
String brand = sc.next();
System.out.print("Enter Price: ");
double price = sc.nextDouble();
phones.add(new SmartPhone(id, brand, price));
System.out.println("Smartphone added successfully!");
break;
case 2:
if (phones.isEmpty()) {
2
23CS2033 – Object Oriented Programming Lab URK24CS1260
System.out.println("No smartphones available!");
} else {
System.out.print("Enter discount percentage: ");
double discount = sc.nextDouble();
for (SmartPhone phone : phones) {
phone.applyDiscount(discount);
}
System.out.println("Discount applied to all devices.");
}
break;
case 3:
if (phones.isEmpty()) {
System.out.println("No smartphones available!");
} else {
for (SmartPhone phone : phones) {
phone.displayDetails();
}
}
break;
case 4:
System.out.println("Exiting... Thank you!");
break;
default:
System.out.println("Invalid choice, try again!")
}
} while (choice != 4);
sc.close();
}
}
