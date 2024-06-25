import java.util.Scanner;

public class Main {
    static char arr[][];
    static int min = 64;
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new char[n][m];

        for(int i=0; i<n; i++) {
            String str = sc.next();
            for(int j=0; j<m; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for(int i=0; i<=n-8; i++) {
            for(int j=0; j<=m-8; j++) {
                find(i, j);
            }
        }
        
        System.out.println(min);
      	
      	sc.close();
    }

    public static void find(int x, int y) {
        int cnt = 0;
        char color = arr[x][y];

        for(int i=x; i<x+8; i++) {
            for(int j=y; j<y+8; j++) {
                if(arr[i][j] != color)
                    cnt++;
                if(color == 'W')
                    color = 'B';
                else color = 'W';
            }
            if(color == 'W')
                color = 'B';
            else color = 'W';
        }
        cnt = Math.min(cnt, 64-cnt);

        min = Math.min(cnt, min);
    }
}