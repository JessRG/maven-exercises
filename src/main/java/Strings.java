import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter something: ");
        String input = scan.nextLine();

        System.out.printf("You Entered: \"%s\"\n", input);

        //Tells whether or not what the user entered is a number
        System.out.printf("\"%s\" %s a number\n", input, StringUtils.isAlpha(input) ? "is" : "is not");

        //Flips the case of the string
        System.out.printf("Flipped Case: %s\n", StringUtils.swapCase(input));

        //Reverses the string
        System.out.printf("Reversed: %s\n", StringUtils.reverse(input));
    }
}
