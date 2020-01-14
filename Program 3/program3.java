/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Louis
 */
public class Program3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        // Create file pointers
        File file1 = new File("C:\\Users\\Louis\\Desktop\\csci232\\program3\\classes_mod_pgm3.csv");
        Scanner scan1 = new Scanner(file1);
        
        // Initialize input array
        String[][] input = new String[23][75];
        int i = 0;
        int k = 0;
        
        // Scan from CSV into input array
        while(scan1.hasNextLine()){
            Scanner scan2 = new Scanner(scan1.nextLine());
            scan2.useDelimiter(",");
            k = 0;
            while(scan2.hasNext()){
                if(i == 0){
                    scan2.next();
                }
                input[i][k] = scan2.next();
                k++;
            }
            i++;
        }
        
         String[][] input_adj = new String[23][2];
        
        for(int p = 0; p < i; p++){
            input_adj[p][0] = input[p][0];
            input_adj[p][0] = input_adj[p][0].replace("-001", "");
            if(p == 0){
                input_adj[p][1] = input[p][3];
            }
            else{
            input_adj[p][1] = input[p][6];
            }
            
            input_adj[p][1] = input_adj[p][1].replace("\"","");
            
        }
      
       
        // Convert input array into array of course
        Course [] list = new Course[i];
        
        for(int j = 0; j < i; j++){
            list[j] = new Course(input_adj[j][0],input_adj[j][1]);
        }
        
        Graph graph1 = new Graph(list);
        
        
    }
    
}
