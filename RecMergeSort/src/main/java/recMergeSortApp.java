
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
public class recMergeSortApp {
    public static void main (String args[]){
       System.out.println("Please enter the size of your array you want to play with:");
        
       Scanner input = new Scanner(System.in);
        
       int maxSize = input.nextInt();
       DArray arr;
       arr = new DArray(maxSize);
       Random rd = new Random();
       
       // filled the array with 100 random values
      System.out.println("These are the randomly created items in your array");
       for(int i =0; i< maxSize; i++){    
             arr.insert(rd.nextInt(100));
       }
       arr.display();
       
       arr.mergeSort();
       
       arr.display();
    }
}
