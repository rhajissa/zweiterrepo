public class TwoDimensionalArrayExample {
    public static void main(String[] args) {
        // Deklariere und initialisiere ein 2D-Array mit 3 Zeilen und 4 Spalten
        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Zugriff auf einzelne Elemente
        System.out.println("Element in Zeile 2, Spalte 3: " + array[1][2]); // Ausgabe: 7

        // Ausgabe des gesamten Arrays
        System.out.println("Zweidimensionales Array:");
        for (int i = 0; i < array.length; i++) {           // Iteriere durch die Zeilen
            for (int j = 0; j < array[i].length; j++) {    // Iteriere durch die Spalten
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Neue Zeile nach jeder Zeile des Arrays
        }
    }
}