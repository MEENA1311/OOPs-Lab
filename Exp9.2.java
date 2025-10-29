import java.io.*;

public class TransactionSummary {
public static void main(String[] args) {
String inputFile = "transactions.txt";
String outputFile = "summary.txt";

int successCount = 0;
int failedCount = 0;

try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
String line;

while ((line = br.readLine()) != null) {
// Example line: TXN1001|DEPOSIT|5000|SUCCESS
String[] parts = line.split("\\|");
if (parts.length == 4) {
String status = parts[3].trim();
if (status.equalsIgnoreCase("SUCCESS")) {
successCount++;
} else if (status.equalsIgnoreCase("FAILED")) {
failedCount++;
}
}
}

// Writing summary to summary.txt
try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
bw.write("===== Daily Transaction Summary =====");
bw.newLine();
bw.write("Total Transactions: " + (successCount + failedCount));
bw.newLine();
bw.write("Successful Transactions: " + successCount);
bw.newLine();
bw.write("Failed Transactions: " + failedCount);
bw.newLine();
bw.write("=====================================");
bw.newLine();
}

System.out.println("Summary report created successfully in '" + outputFile + "'");

} catch (FileNotFoundException e) {
System.out.println("Error: Input file not found!");
} catch (IOException e) {
System.out.println("Error reading or writing file!");
}
}
}

