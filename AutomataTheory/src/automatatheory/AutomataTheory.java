
package automatatheory;

import java.util.Scanner;

public class AutomataTheory {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.next();
        Lesson1.runAutomata(input);
    }
    
}
