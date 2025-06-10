import java.util.Scanner;

public class RatInMaze {
    static boolean isPathSafe(int[][] arr, int x, int y, int n) {
        return (x < n && y < n && arr[x][y] == 1);
    }

    static boolean ratInMaze(int[][] arr, int x, int y, int n, int[][] resultantArray) {
        // Base Case: If the rat has reached the destination
        if (x == n - 1 && y == n - 1) {
            resultantArray[x][y] = 1;
            return true;
        }

        // Check if the current cell is safe
        if (isPathSafe(arr, x, y, n)) {
            // Mark the cell as part of the solution path
            resultantArray[x][y] = 1;

            // Move right
            if (ratInMaze(arr, x + 1, y, n, resultantArray)) {
                return true;
            }

            // Move down
            if (ratInMaze(arr, x, y + 1, n, resultantArray)) {
                return true;
            }

            // Backtrack: unmark the cell
            resultantArray[x][y] = 0;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        System.out.println("Enter the Maze Array Values (0 or 1):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] resultantArray = new int[n][n]; // initialized to 0 by default in Java

        if (ratInMaze(arr, 0, 0, n, resultantArray)) {
            System.out.println("Path found:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(resultantArray[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No Path");
        }

        sc.close();
    }
}
