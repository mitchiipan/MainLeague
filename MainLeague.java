
import java.util.Objects;
import java.util.Scanner;

public class MainLeague {


    String[][] chart = new String[18][18];
    String[] clubNames = new String[18];

    public MainLeague(Scanner scanner) {
        int j = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String clubName = line.substring(0, 25).trim();
            clubNames[j] = clubName;
            String result = line.substring(25);
            String[] results = result.split(" ");
            for (int i = 0; i < results.length; i++) {
                chart[j][i] = results[i];
            }
            j = j + 1;

        }

    }

    public String getResult(String home, String guest) {

        Integer homeIndex = null;
        Integer guestIndex = null;


        for (int i = 0; i < clubNames.length; i++) {
            if (Objects.equals(clubNames[i], home)) {
                homeIndex = i;
            } else if (Objects.equals(clubNames[i], guest)) {
                guestIndex = i;
            }
        }
        if (homeIndex == null || guestIndex == null){
            throw new IllegalArgumentException(" Bitte überprüfen Sie die eingegebenen Mannschaften auf Richtigkeit.");
        }

        return this.chart[homeIndex][guestIndex];

    }
//    public String[][] getChart() {
//        return chart;
//    }

}



