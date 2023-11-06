// Roan Silver + Juan Pablo      Created: November 2nd, 2023        Last Edits:
// Collaborators:
import java.util.Scanner;
public class Postfix {

    // Instance Data

    private Stack newStack;


    // Constructor

    public Postfix(){
        newStack = new Stack();
    }

    // Methods

    // Method that completes the required action: Take User Input, Calculate it, Display it
    public void postfixCalculation(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter expression in postfix notation w/ spaces: ");
        String userInput = s.nextLine();

        System.out.print("Here is the Answer: " + compile(userInput));
    }

    // Method that does the actual calculation w/ both Stack management and Function Procedures
    public Object compile(String problem){
        boolean done = false;
        String update = problem;
        while (!done){
            if (update.substring(0,problem.indexOf(' ')).equals("*") == false && update.substring(0,problem.indexOf(' ')).equals("/") == false
            && update.substring(0,problem.indexOf(' ')).equals("+") == false && update.substring(0,problem.indexOf(' ')).equals("-") == false){
                newStack.push(Integer.parseInt(update.substring(0, problem.indexOf(' '))));
            } else{
                newStack.push(update.substring(0, problem.indexOf(' ')));
            }

            //Code to complete operations
            if (newStack.peek().equals("*")){
                newStack.push(multiply());
            } else if (newStack.peek().equals("/")){
                newStack.push(divide());
            } else if (newStack.peek().equals("+")){
                newStack.push(add());
            } else if (newStack.peek().equals("-")){
                newStack.push(subtract());
            }

            //Code to check if everything is imputed, AND updates substring accordingly
            if (update.indexOf(' ') != -1)
                update = update.substring(update.indexOf(' ') + 1);
            else
                done = true;
        }
        return newStack.peek();
    }

    // Method to Multiply top values of a stack
    public int multiply(){
        newStack.pop();
        int value1 = (int)newStack.pop();
        int value2 = (int)newStack.pop();
        return value2 * value1;
    }

    // Method to Divide top values of a stack
    public int divide(){
        newStack.pop();
        int value1 = (int)newStack.pop();
        int value2 = (int)newStack.pop();
        return value2 / value1;
    }

    // Method to add top values of a stack
    public int add(){
        newStack.pop();
        int value1 = (int)newStack.pop();
        int value2 = (int)newStack.pop();
        return value2 + value1;
    }

    // Method to subtract top values of a stack
    public int subtract(){
        newStack.pop();
        int value1 = (int)newStack.pop();
        int value2 = (int)newStack.pop();
        return value2 - value1;
    }
}
