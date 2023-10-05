
package automatatheory;


public class Lesson1 {
    public static void runAutomata(String s) {
        int q = 0; // final state
        for(char c : s.toCharArray()){
            switch(q){
                case 0:
                    q = (c == 'i') ? 1 : 0;
                    break;
                case 1:
                    q = (c == 'n') ? 2 : ((c == 'i') ? 1 : 0);
                    break;   
                case 2:
                    q = (c == 'g') ? 3 : ((c == 'i')) ? 1 : 0;
                    break;  
                case 3:
                    q = (c == 'i') ? 1 : 0;
                    break;    
            }
        }
        if(q == 3)
            System.out.println("Accept");
        else
            System.out.println("Reject");
    }
    
}
