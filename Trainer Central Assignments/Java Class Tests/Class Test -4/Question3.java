import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    private static int ax, ay, gx, gy, mr, mc, mox, moy;
    private static char[][] maze;
    private static String aPath = "";  // adventurer path
    private static String mPath ="";  // monster path


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions of the maze: ");
        mr = sc.nextInt();
        mc = sc.nextInt();
        maze = new char[mr][mc];

        System.out.println("Enter position of the adventurer: ");
        ax = sc.nextInt() - 1;
        ay = sc.nextInt() - 1;

        System.out.println("Enter position of the monster: ");
        mox = sc.nextInt() - 1;
        moy = sc.nextInt() - 1;

        System.out.println("Enter position of the gold: ");
        gx = sc.nextInt() - 1;
        gy = sc.nextInt() - 1;

        for (int i = 0; i < mr; i++) {
            Arrays.fill(maze[i], '.');
        }

        maze[ax][ay] = 'A';
        maze[gx][gy] = 'G';

        int[][] dp = new int[mr][mc];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        
        int Aresult = findPath(ax, ay, dp, "", true);

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int Mresult = findPath(mox, moy, dp, "", false);

        if (Aresult <= Mresult) {
            System.out.println("Minimum no. of Steps : " + Aresult);
            System.out.println("Path: " + aPath);  
        } else {
            System.out.println("No possible solution");
        }
    }

    public static int findPath(int x, int y, int[][] dp, String currentPath, boolean isA) {
        if (x >= mr || y >= mc || x < 0 || y < 0 || maze[x][y] == '#') {
            return 1000;
        }

        if (maze[x][y] == 'G') {
            if(isA==true){
                aPath = currentPath+"("+(x+1)+","+(y+1)+")";  //store path
            }
            else{
                mPath = currentPath;
            }
            
            return 0;
        }

        if (dp[x][y] != -1) {
            return dp[x][y];
        }

        maze[x][y] = '#';  // mark the current cell

        int right = findPath(x, y + 1, dp, (currentPath + "("+(x+1)+","+(y+1)+")-->"), isA); 
        int up = findPath(x - 1, y, dp, (currentPath + "("+(x+1)+","+(y+1)+")-->"), isA);    
        int down = findPath(x + 1, y, dp, (currentPath + "("+(x+1)+","+(y+1)+")-->"), isA);  
        int left = findPath(x, y - 1, dp, (currentPath + "("+(x+1)+","+(y+1)+")-->"), isA);  

        maze[x][y] = '.';  // backtrack

        dp[x][y] = 1 + min(down, up, right, left);

        return dp[x][y];
    }

    public static int min(int a, int b, int c, int d) {
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}
