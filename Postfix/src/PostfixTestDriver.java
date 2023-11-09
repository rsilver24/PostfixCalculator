import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
// Roan Silver      Created: November 6th, 2023        Last Edits: November 6th, 2023
// Collaborators:
public class PostfixTestDriver {
    public static void main(String[] args) {
        Postfix p = new Postfix();

        System.out.print("Input the name of the file you wish to calculate: ");

        try {
            Scanner s = new Scanner(System.in);
            File fileInput = new File(s.nextLine() + ".txt");
            Scanner sc = new Scanner(fileInput);
            String problem = sc.nextLine();
            System.out.println(problem);
            int conclusion = p.postfixCalculation(problem);
            File fileOutput = new File("Answer.txt");
            FileWriter answer = new FileWriter("Answer.txt");
            answer.write(Integer.toString(conclusion));
            answer.close();
            System.out.println("New File: " + fileOutput.getName() + " has been created!");
        } catch (IOException e){
            System.out.println("idk an error happened or smthn");
            e.printStackTrace();
        }
    }
}
