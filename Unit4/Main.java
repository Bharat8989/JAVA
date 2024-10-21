import java.io.*;

public class Main {
    public static void main(String args[]){
        String inputFiles = "input.txt";
        String outFiles = "output.txt";

        // Try-with-resources for BufferedReader and BufferedWriter
        try (BufferedReader reade = new BufferedReader(new FileReader(inputFiles)); // Commit: Line 8 - Added 'new FileReader(inputFiles)' 
             BufferedWriter writer = new BufferedWriter(new FileWriter(outFiles))) { // Commit: Line 9 - Added 'new FileWriter(outFiles)'

            String line;
            while ((line = reade.readLine()) != null) {
                writer.write(line); // Commit: Line 12 - Changed 'writer.writer' to 'writer.write'
                writer.newLine();
            }
            System.out.println("File copied");
        }
        catch(IOException e) {
            e.printStackTrace();   
            // try and catch
        }
    } 
    // git 
}






// import java.io.*;
// class Main{
//     public static void main(String[] args) {
//         String inputFiles="input.tex";
//         String outputFiles="output.tex";
//         try (BufferedReader reader=new BufferedReader(new FileReader(inputFiles);
//         BufferedWriter writer=new BufferedWriter(new FileWriter(outputFiles)); {
//             String line;
//             while (line reader.readLine() != null) {
//                 writer.write(line);
//                 writer.newLine();
                
//             }
//             System.out.println("files copies");
            
//         }))
//         catch(IOException e){
//             e.printStackTrace();
//         }
//     }
// }