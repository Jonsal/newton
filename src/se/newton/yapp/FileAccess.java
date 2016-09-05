
package se.newton.yapp;


import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FileAccess { 
    
        private static final Logger LOG = LogManager.getLogger(FileAccess.class);
    
        public static void main(String[] args) {
              
        
 
        LOG.error("testing ERROR level");
        writeFile();
//        readFile();
        //readTestFileAndPopulateList();
    }
    
    
    
    private static void writeFile(){
    
     // Filnamnet
        String fileName = "test.txt";

        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Hello there,");
            bufferedWriter.write(" here is some text.");
            bufferedWriter.newLine(); // ny rad
            bufferedWriter.write("We are writing");
            bufferedWriter.write(" the text to the file.");

            // Stäng
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // eller
            // ex.printStackTrace();
        }
    }
    
    private static void readFile(){
        // Filnamnet
        String fileName = "test.txt";

        try {
            // Use this for reading the data.
            byte[] buffer = new byte[1000];

            FileInputStream inputStream = 
                new FileInputStream(fileName);
            int total = 0;
            int nRead = 0;
            while((nRead = inputStream.read(buffer)) != -1) {
                System.out.println(new String(buffer));
                total += nRead;
            }   
            // stäng filen
            inputStream.close();        

            System.out.println("Read " + total + " bytes");
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // eller
            // ex.printStackTrace();
        }
    }

    private static void readTestFileAndPopulateList() {
          // Filnamnet
        String fileName = "hundar.txt";
        List<String> listOfDogs = new ArrayList<String>() {};
        String content = "";

        try {
            // Use this for reading the data.
            byte[] buffer = new byte[1000];

            FileInputStream inputStream = 
                new FileInputStream(fileName);
            int nRead = 0;
            while((nRead = inputStream.read(buffer)) != -1) {
                //lägger till raderna som strängar i listan
                content = new String(buffer);
                
            }   
            // stäng filen
            inputStream.close();    
                             
            listOfDogs = Arrays.asList(content.split("\\n"));

            printList(listOfDogs);

            //sortera alfabetiskt
            Collections.sort(listOfDogs);
 
            printList(listOfDogs);
            
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");     

        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // eller
            // ex.printStackTrace();
        }
    }

//    private static void printList(List<String> myList) {
//        // loppar igenom och skriver ut listan
//        System.out.println("==> Skriver ut listan!.");
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
//    }
    
    private static void printList(List<String> myList) {
        for(String element : myList){
            System.out.println(element);
        }
    }
}
