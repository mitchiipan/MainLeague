import java.util.Objects;


public class OverallRanking {
    /**
     * Zusatzaufagbe
     * Methode gibt alle Tore, Gegentore einer Mannschaft in der Saison wieder.
     * Existiert die Mannschaft nicht --> IllegalArgumentException
     * Methoden: getOverallRanking , toString
     * toString --> Vereinsname Tore:Gegentore Punkte
     * Sieg 3       Unentschieden 1         Niederlage 0
     */

    int points;
    int goals;
    int counterGoals;

    public MainLeague mainLeague;//so, ich hab mein 2D Array. Darin alle Spielergebnisse


    public OverallRanking getOverallRanking(String club) { // Ich will alle Ergebnisse von einer Mannschaft

        int clubIndex = 0;
        int j= 0;
        for (int i = 0; i < mainLeague.clubNames.length; i++){  // um im 2DArray an alle Ergebnisse zu kommen benötige ich den Richtigen Index für die jeweilige Mannschaft, das geht über das
            if (Objects.equals(mainLeague.clubNames,club)){     // clubNames Array, hier gleiche Reihenfolge wie im 2DA, aber abgleichbar mit club. also Index des Mannschaftsnamens nehmen und
                clubIndex = i;                                  // in eine eigene Variable speichern, diese nutzen um an der Stelle [i] das darin befindliche 2. Array mit allen ergebnissen zu bekommen
            }else{
                throw new IllegalArgumentException(" Bitte überprüfen Sie die eingegebene Mannschaft auf Richtigkeit.");
            }
        }
        for (int i = 0; i < mainLeague.chart.length ; i++) {    // dh. ich brauche --> chart[i][alle] also mittels for schleife einmal durch das ding durch und alle rausholen
                                                                // wenn ich das richtig gegoogelt habe, dann muss ich nicht immer beide Array Klammern angeben, nur die, die ich auch bearbeiten will, hier die erste
                                                                // wenn equal, dann richtiger Index, und ich will das an der Index stelle befindliche 2. Array haben
                                                                // das



           }






        return null;
    }

}
