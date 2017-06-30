/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package varianta.three.randomnumbers.main;

import java.util.Scanner;
import varianta.three.randomnumbers.action.Action;

/**
 *
 * @author SLAVA
 */
public class RandomNumbers {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int countNumbers =0;
        System.out.println("Введите количество случайных чисел и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        try {
            countNumbers= Integer.valueOf(str);
        }  catch (NumberFormatException e) {  
            System.err.println("Неверный формат числа!");  
        }   

        Action act=new Action();
        int[] numbers=act.RandomNumbers(countNumbers);
        act.Output(numbers);
        act.OutputLn(numbers);
      }
    }

