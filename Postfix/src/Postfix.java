import java.util.Scanner;

public class Postfix {
    public int lookAtThisCoolCode(){
        Scanner s = new Scanner();
        System.out.print("Enter expression in postfix notation w/ spaces: ");
        String userInput = s.nextLine();
        int length = userInput.length();

        // Find number of multiplication and division precedures

        int numMultDiv = 0;
        for (int i = 0; i < length; i++){
            if (userInput.charAt(i) == '*'){
                numMultDiv++;
            }
        }

        // Multiply and Divide Items Together

        for (int i = numMultDiv; i != 0; i--){
            boolean finish = false;
            int placeHolder;
            for (int k = 0; !finish; k++){
                if (userInput.charAt(i) == '*'){
                }
            }
        }
    }
}
