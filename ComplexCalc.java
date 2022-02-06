import java.util.*;

public class ComplexCalc {

    public static void main(String args[]) {
        String s1=getInput("Enter a numeric value: ");

        String s2 = getInput("Enter a numeric value: ");


        String op = getInput("Select any one of operations (+, -, /, *, %): ");

        double result=0;

        try{
            switch(op)
            {
                case "+":
                    result=addValues(s1,s2);
                    break;
                case "-":
                    result=subValues(s1,s2);
                    break;
                case "/":
                    result=divValues(s1,s2);
                    break;
                case "*":
                    result=mulValues(s1,s2);
                    break;
                case "%":
                    result=modValues(s1,s2);
                    break;
                default:
                    System.out.println("Incorrect Operation");
                    break;                
            }

            System.out.println("The answer is: "+result);
        }
        catch(Exception e)
        {
            System.out.println("Number Formatting Exception: "+e.getMessage());
        }
    }
    private static double addValues(String s1,String s2)
    {
        double d1=Double.parseDouble(s1);
        double d2=Double.parseDouble(s2);
        return d1+d2;
    }

    private static double subValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 - d2;
    }

    private static double divValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1/d2;
    }

    private static double mulValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 * d2;
    }

    private static double modValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 % d2;
    }

    private static String getInput(String prompt)
    {
        System.out.println(prompt);
        Scanner sc=new Scanner(System.in);
        return sc.nextLine();
    }

}
