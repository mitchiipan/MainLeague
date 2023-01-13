
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException { // muss beim File Scanner dingens dabei sein , falls keine Datei dabei ist

        String home = "Hannover ";
        String guest = "Hamburger SV";

            File bundesliga = new File("src\\resources\\bundesliga1314.txt");

            Scanner scanner = new Scanner(bundesliga);

            MainLeague mainleague = new MainLeague(scanner);



        System.out.println(home + " " + mainleague.getResult(home, guest) + " " + guest);


    }
}