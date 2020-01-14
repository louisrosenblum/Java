/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Louis
 */
public class Program2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("C:\\Users\\Louis\\Desktop\\csci232\\program2\\classes.csv");
        Scanner scan1 = new Scanner(file1);
        
        Comparable[] x = new Comparable[50000];
        int i = 0;
        
        while(scan1.hasNextLine()){
            Scanner scan2 = new Scanner(scan1.nextLine());
            x[i] = scan2.next();
            System.out.println(x[i]);
            i++;
        }
        
        for(int j = 0; j < i; j++){
            System.out.println(x[j]);
        }
    }
    
}
