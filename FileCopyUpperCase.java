import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyUpperCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file name: ");
        String sourceFile = sc.nextLine();

        System.out.print("Enter destination file name: ");
        String destinationFile = sc.nextLine();

        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {

            reader = new BufferedReader(new FileReader(sourceFile));
            writer = new BufferedWriter(new FileWriter(destinationFile));

            String line;

            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase());
                writer.newLine();
            }

            System.out.println("File copied successfully.");
            System.out.println("All text has been converted to uppercase.");

        } catch (FileNotFoundException e) {

            System.out.println("Error: Source file not found.");

        } catch (IOException e) {

            System.out.println("Error while reading or writing the file.");

        } finally {

            try {
                if (reader != null) {
                    reader.close();
                }

                if (writer != null) {
                    writer.close();
                }

            } catch (IOException e) {
                System.out.println("Error while closing the file.");
            }

            sc.close();
        }
    }
}