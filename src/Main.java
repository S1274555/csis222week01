import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int myInteger = 0;
        int secondInteger = 0;
        int sum = 0;
        double myDouble = 0.0;

        sum = myInteger + secondInteger;

        if (sum > 0)
        {
            System.out.println("Wow ! Your sum is greater than zero !");
        }
            else
        {
            System.out.println("Sorry.... your sum is not greater than zero !");
        }

        Scanner  cin = new Scanner(System.in);
        System.out.print("Enter a value for an integer: ");

        myInteger = cin.nextInt();

        System.out.println("You typed: " + myInteger);

    }
}