
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String menuChoice = "";
        String menu = "D - Democrat, R - Republican, I - Independent, O - Other: Choose your affiliation"; //create menu
        //display menu
        System.out.println(menu);
        menuChoice = in.nextLine();

        if (menuChoice.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey");
        }
        else if (menuChoice.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant");
        }
        else if (menuChoice.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Man");
        }
        else if (menuChoice.equalsIgnoreCase("O")) {
            System.out.println("You chose other");
        }
    }
}