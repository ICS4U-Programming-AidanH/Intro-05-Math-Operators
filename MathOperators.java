/**


* Operator for simple math equations.

* @author  Aidan

* @version 1.0

* @since   2024-15-02

*/

public class MathOperators {
    
    public static void main(String[] args) {
        
        int additionOne = 7;
        int additionTwo = 4;
        System.out.println("Here's addition!");
        System.out.println("7 + 4 =" + (additionOne + additionTwo));
        //This will print the answer to 7 + 4 to the screen
        System.out.println("----------");
        //Creates a divider between types of math

        System.out.println("Here's subtraction!");
        double subtractionOne = 23d;
        double subtractionTwo = 8d;
        float subtractionOneFloat = (float) subtractionOne;
        float subtractionTwoFloat = (float) subtractionTwo;
        //This converts the doubles into floats
        System.out.println("23 - 8 =" + (subtractionOneFloat + -subtractionTwoFloat));
        //This will print the answer to 23 - 8 to the screen
        System.out.println("----------");

        System.out.println("Here's multiplication!");
        float multiplicationOne = 11;
        int multiplicationTwo = 7;
        float multiplicationTwoFloat = (float) multiplicationTwo;
        //This will convert the int variable into a float
        System.out.println("11 x 7 =" + (multiplicationOne * multiplicationTwoFloat));
        System.out.println("----------");
        //Creates a divider between types of math

        System.out.println("Here's division!");
        double divisionOne = 11.5d;
        double divisionTwo = 3d;
        //Creates the values for the equation
        System.out.println("11.5 / 3 =" + (divisionOne / divisionTwo));
        //Outputs the answer to the equation
        System.out.println("-----");
        System.out.println("Here's an equation without decimals:");
        float divisionThree = 12;
        float divisionFour = 2;
        //This creates the values for the equation
        System.out.println("12 / 2 =" + (divisionThree / divisionFour));
        System.out.println("----------");
        //Creates a border to separate equation types

        System.out.println("Here's exponents!");
        double exponentOne = Math.pow(2, 6);
        //Creates the value of the exponent
        System.out.println("2^6 is equal to:" + (exponentOne));
        //Displays the answer to the equation
        System.out.println("----------");
        //Creates a border to separate equation types

        System.out.println("This is square roots!");
        double squareRootOne = 182;
        //This creates the value for the equation
        System.out.println("The Square Root of 182 =" + (Math.sqrt(squareRootOne)));
        //Outputs the equation
        
    }
}
