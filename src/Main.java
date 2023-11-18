import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("How many pounds (ibs) do you weight : ");
        float weight = input.nextFloat();

        double weightOnMars = (weight * .38);

        System.out.println("Your weight is " + String.format("%.4f",weightOnMars)+"lbs Mars");

        System.out.println("Converting the variable into integar");
        int weightOnMarsInt = (int)weightOnMars;
        System.out.println(weightOnMarsInt);


        System.out.println("Converting the variable into char");
        char weightOnMarsChar = (char)weightOnMars;
        System.out.println(weightOnMars);

        System.out.println("converting the variable into Int  ");

        int newIntVariable = weightOnMarsChar *2;
        System.out.println(newIntVariable);







    }
}