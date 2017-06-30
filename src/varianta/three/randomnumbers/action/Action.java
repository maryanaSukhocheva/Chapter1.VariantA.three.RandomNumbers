/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package varianta.three.randomnumbers.action;
import java.util.Random;
/**
 *
 * @author SLAVA
 */
public class Action {
    //private int[] numbers;
    final Random random = new Random();
        
    public int[] RandomNumbers(int count) {
            int numbers[ ] = new int[count];
            for (int i = 0;i<count; i++) {
                numbers[i] = random.nextInt(1000);
                    }
               return numbers;
        }
    
    public void Output(int[] arg) {
        for (int i : arg){
            System.out.print(String.valueOf(i)+" ");
            }
        System.out.println();
    }
    public void OutputLn(int[] arg) {
         for (int i : arg){
            System.out.println(String.valueOf(i)+" ");
    }
    }

}

