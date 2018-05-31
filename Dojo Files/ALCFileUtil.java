/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2dojo;

// You will need this later on.
import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rethabile Phuroe
 * @author Hamza Ayachi
 * @author Immanuel
 * @author Ebenezer Graham
 */
public class ALCFileUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {        
        // Uncomment the line below to try out countBytes
       // System.out.println(countBytes("TestFile.txt"));
       // System.out.println(ALCEncoder.encode('a'));
       // System.out.println(ALCEncoder.decode('N'));
       // Character a = 'a';
       // System.out.println(a.charValue());
//        System.out.println(readCharacterN("TestSecret.bin", 5));
        System.out.println(findSecretCharacter("TestSecret.bin"));
        // Uncomment the lines below once you've finished the encodeFile method
        // encodeFile("TestFile.txt");
        
        // Once you finish the decodeFile method, call this.
        // You should find a "Decoded_Encoded_TestFile.txt", which should look
        // the same as the original file
        //decodeFile("Encoded_TestFile.txt");
    }
    
    /* Task 1 goes here: */
    // FEEDBACK
    // Very good job here. My only feedback is on using the 'throws' keyword
    // Keep in mind that whenever you use 'throws', you are making the errors and exceptions listed
    // someone else's problem (and that someone could be you!)
    // We are not dealing with the errors yet, we are just explicitly saying that they could happen
    // Let's make sure we use try/catches for now, and think really hard about wheter or not it's ok
    // to throw the errors instead of dealing with them
    public static String countBytes(String fileName) throws FileNotFoundException, IOException{
       
       FileInputStream input = new FileInputStream(fileName);
       int fileSize = 0;
       
       while ((input.read()) != -1){
        // FEEDBACK: indent this, it looks nicer :)
       fileSize++;
       }
       
       String output = fileName+ " is " +fileSize+" bytes";
       return output;
    }
    
    /* Once done with Task 1, go to the ALCEncoder class */
    
    /* Task 3 goes here: */
    
    public static char readCharacterN(String fileName, int character) throws IOException {
        char charOutput = ' ';
        try {
            FileReader file = new FileReader(fileName);
            int counter = 0;
            int c;
            
            while(((c = file.read()) != -1) && (counter <= character)){
             
             if(counter == character){
                charOutput = (char) c;
             }
             counter++;
            }
            file.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ALCFileUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return charOutput;
    }
    
    public static char findSecretCharacter(String fileName) throws FileNotFoundException, IOException{
        DataInputStream data = new DataInputStream( new FileInputStream(fileName));
        int n = 0;
        try {
           n = data.readInt(); 
        }catch (Exception e) {
           System.out.println(e.toString()); 
        }
        
        int counter = 0;
        int c;
        char charOutput = ' ';
        while(((c = data.readChar()) != -1) && (counter <= n)){
             
             if(counter == n){
                charOutput = (char) c;
             }
             counter++;
            }
        data.close();
      //  return readCharacterN(fileName,n+(int)Math.log10(n)+1);
          return charOutput;

    }
    public static void findSecretMessage(){
        
    }
}
