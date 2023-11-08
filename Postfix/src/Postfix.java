// Roan Silver + Juan Pablo      Created: November 2nd, 2023        Last Edits: November 6th, 2023
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
    public int postfixCalculation(String input){
        return compile(input);
    }

    // Method that does the actual calculation w/ both Stack management and Function Procedures
    public int compile(String problem){
        boolean done = false;
        String update = problem;
        while (!done){
            if (update.substring(0,problem.indexOf(' ')).equals("*") == false && update.substring(0,problem.indexOf(' ')).equals("/") == false
            && update.substring(0,problem.indexOf(' ')).equals("+") == false && update.substring(0,problem.indexOf(' ')).equals("-") == false
            && update.substring(0, problem.indexOf(' ')).equals("%") == false){
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
            } else if (newStack.peek().equals("%")){
                newStack.push(mod());
            }

            //Code to check if everything is imputed, AND updates substring accordingly
            if (update.indexOf(' ') != -1)
                update = update.substring(update.indexOf(' ') + 1);
            else
                done = true;
        }
        return (int)newStack.peek();
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

    // Method to mod top values of a stack
    public int mod(){
        newStack.pop();
        int value1 = (int)newStack.pop();
        int value2 = (int)newStack.pop();
        return value2 % value1;
    }
}
