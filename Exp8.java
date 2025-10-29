public class Q1Runnable {
public static void main(String[] args) {
String paragraph = "Java is a powerful programming language.";
Thread wordThread = new Thread(new WordThread(paragraph));
Thread vowelThread = new Thread(new VowelThread(paragraph));
wordThread.start();
vowelThread.start();
}
}
class WordThread implements Runnable {
String text;
WordThread(String text) {
this.text = text;
}
public void run() {
String[] words = text.split(" ");
for (String word : words) {
System.out.println("Word: " + word);
try { Thread.sleep(2000); } catch (InterruptedException e) {}
}

}
}
class VowelThread implements Runnable {
String text;
VowelThread(String text) {
this.text = text;
}
public void run() {
for (char c : text.toCharArray()) {
if ("AEIOUaeiou".indexOf(c) != -1) {
System.out.println("Vowel: " + c);
try { Thread.sleep(2000); } catch (InterruptedException e){}
}
}
}
}

  
