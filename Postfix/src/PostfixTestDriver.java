public class PostfixTestDriver {
    public static void main(String[] args) {
        Postfix p = new Postfix();

        System.out.println("Given the Equation: 8 * 4 - 2 - 4 / 2 * 6 * 2 - 4 - 4 - 4");
        System.out.println("Postfix becomes: 8 4 * 2 - 4 2 / 6 * 2 * - 4 - 4 - 4 -");
        System.out.println("When put into the calculator, the answer should be -6");
        System.out.println("Input '8 4 * 2 - 4 2 / 6 * 2 * - 4 - 4 - 4 -' to try it out!");
        System.out.println(" ");
        p.postfixCalculation();
    }
}
