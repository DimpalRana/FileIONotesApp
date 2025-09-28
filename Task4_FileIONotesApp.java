
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task4_FileIONotesApp  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "notes.txt";

        // Write a note
        System.out.print("Enter your note: ");
        String note = sc.nextLine();
        try {
            FileWriter fw = new FileWriter(filename, true); // append mode
            fw.write(note + "\n");
            fw.close();
            System.out.println("✅ Note saved!");
        } catch (IOException e) {
            System.out.println("Error while saving note.");
        }

        // Read notes
        System.out.println("\n--- Your Notes ---");
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("- " + line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("No notes found!");
        }

        sc.close();
    }
}
