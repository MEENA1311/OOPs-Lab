package pkgs;
import java.io.*;
import java.util.Scanner;

public class FileOperationsApp {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int choice;

do {
System.out.println("\n===== FILE OPERATIONS MENU =====");
System.out.println("1. Create a new file");
System.out.println("2. Rename a file");
System.out.println("3. Delete a file");
System.out.println("4. Create a directory");
System.out.println("5. Find absolute path of a file");
System.out.println("6. Display all files in a directory");
System.out.println("7. Exit");
System.out.print("Enter your choice: ");
choice = sc.nextInt();
sc.nextLine(); // consume newline

switch (choice) {
case 1:
createFile(sc);
break;
case 2:
renameFile(sc);
break;
case 3:
deleteFile(sc);
break;
case 4:
createDirectory(sc);
break;
case 5:
findAbsolutePath(sc);
break;
case 6:
listFilesInDirectory(sc);
break;
case 7:
System.out.println("Exiting program...");
break;
default:
System.out.println("Invalid choice! Please try again.");
}
} while (choice != 7);

sc.close();
}

private static void createFile(Scanner sc) {
System.out.print("Enter file name to create: ");
String filename = sc.nextLine();
File file = new File(filename);

try {
if (file.createNewFile()) {
System.out.println("File created successfully: " + file.getName());
} else {
System.out.println("File already exists!");
}
} catch (IOException e) {
System.out.println("An error occurred while creating the file.");
}
}

private static void renameFile(Scanner sc) {
System.out.print("Enter existing file name: ");
String oldName = sc.nextLine();
System.out.print("Enter new file name: ");
String newName = sc.nextLine();

File oldFile = new File(oldName);
File newFile = new File(newName);

if (oldFile.exists()) {
if (oldFile.renameTo(newFile)) {
System.out.println("File renamed successfully!");
} else {
System.out.println("Error renaming file!");
}
} else {
System.out.println("File not found!");
}
}

private static void deleteFile(Scanner sc) {
System.out.print("Enter file name to delete: ");
String filename = sc.nextLine();
File file = new File(filename);

if (file.exists()) {
if (file.delete()) {
System.out.println("File deleted successfully!");
} else {
System.out.println("Unable to delete the file!");
}
} else {
System.out.println("File not found!");
}
}

private static void createDirectory(Scanner sc) {
System.out.print("Enter directory name to create: ");
String dirName = sc.nextLine();
File dir = new File(dirName);

if (dir.exists()) {
System.out.println("Directory already exists!");
} else {
if (dir.mkdirs()) {
System.out.println("Directory created successfully!");
} else {
System.out.println("Error creating directory!");
}
}
}

private static void findAbsolutePath(Scanner sc) {
System.out.print("Enter file name to find absolute path: ");
String filename = sc.nextLine();
File file = new File(filename);

System.out.println("Absolute Path: " + file.getAbsolutePath());
}

private static void listFilesInDirectory(Scanner sc) {
System.out.print("Enter directory name: ");
String dirName = sc.nextLine();
File dir = new File(dirName);

if (dir.exists() && dir.isDirectory()) {
String[] files = dir.list();
if (files != null && files.length > 0) {
System.out.println("\nFiles in directory '" + dirName + "':");
for (String file : files) {
System.out.println(file);
}
} else {
System.out.println("Directory is empty!");
}
} else {
System.out.println("Invalid directory name!");
}
}
}



