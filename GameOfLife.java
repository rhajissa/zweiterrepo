import java.util.Random;

public class GameOfLife {

    // Größe des Spielfelds
    private static final int ROWS = 10;
    private static final int COLS = 10;

    public static void main(String[] args) {
        // Erzeuge ein zufälliges Start-Grid
        int[][] grid = new int[ROWS][COLS];
        initializeGrid(grid);

        // Anzahl der Iterationen des Spiels
        int iterations = 10;
        System.out.println("Startzustand:");
        printGrid(grid);

        // Game of Life für eine bestimmte Anzahl an Iterationen
        for (int i = 0; i < iterations; i++) {
            grid = nextGeneration(grid);
            System.out.println("Generation " + (i + 1) + ":");
            printGrid(grid);
        }
    }

    // Initialisiere das Grid zufällig
    public static void initializeGrid(int[][] grid) {
        Random random = new Random();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                // Setze zufällig lebendig (1) oder tot (0)
                grid[i][j] = random.nextInt(2);
            }
        }
    }

    // Berechnet die nächste Generation des Grids
    public static int[][] nextGeneration(int[][] currentGrid) {
        int[][] newGrid = new int[ROWS][COLS];

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                int livingNeighbors = countLivingNeighbors(currentGrid, i, j);

                // Anwendung der Regeln des Game of Life
                if (currentGrid[i][j] == 1) {
                    // Lebende Zelle
                    if (livingNeighbors < 2 || livingNeighbors > 3) {
                        newGrid[i][j] = 0;  // Zelle stirbt
                    } else {
                        newGrid[i][j] = 1;  // Zelle bleibt lebendig
                    }
                } else {
                    // Tote Zelle
                    if (livingNeighbors == 3) {
                        newGrid[i][j] = 1;  // Zelle wird wiederbelebt
                    } else {
                        newGrid[i][j] = 0;  // Zelle bleibt tot
                    }
                }
            }
        }

        return newGrid;
    }

    // Zählt die lebenden Nachbarn einer Zelle
    public static int countLivingNeighbors(int[][] grid, int row, int col) {
        int count = 0;

        // Prüfen der 8 Nachbarn um die Zelle herum
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) {
                    continue;  // Die Zelle selbst wird nicht gezählt
                }

                int newRow = row + i;
                int newCol = col + j;

                // Prüfen, ob der Nachbar innerhalb des Spielfelds liegt
                if (newRow >= 0 && newRow < ROWS && newCol >= 0 && newCol < COLS) {
                    count += grid[newRow][newCol];
                }
            }
        }

        return count;
    }

    // Ausgabe des Grids auf der Konsole
    public static void printGrid(int[][] grid) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(grid[i][j] == 1 ? "O " : ". ");
            }
            System.out.println();
        }
    }
}