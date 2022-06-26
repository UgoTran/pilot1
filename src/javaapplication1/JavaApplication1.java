/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!");
        
        int[] numbers = new int[10];
        Random randomNumber = new Random();
        randomNumber.nextInt(10);
        int arrayLength = numbers.length - 1;
        for(int index = 0; index <  arrayLength; index ++){
            numbers[index] = randomNumber.nextInt();
        }
        
        System.out.println("mang da tao");
        for(int index = 0; index <  arrayLength; index ++){
            System.out.print(numbers[index] + "  ");
        }
        
        int counter = 0;
        for(int index =0; index < arrayLength; index ++){
            if(numbers[index] < 5){
                // viet vong for de dich phan tu sang trai
                for(int inner = index + 1; inner < arrayLength - index; inner ++){
                    numbers[index] = numbers[inner];
                    counter++;
                    break;
                }
            }
        }
        
        System.out.println("\n mang sau khi xua cac phan tu < 5: so pt xoa: " + counter);
        for(int index = 0; index <  arrayLength - counter; index ++){
            System.out.print(numbers[index] + "  ");
        }
      
    }
    
}
