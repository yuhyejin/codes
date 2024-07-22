import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        num[] numArr = new num[n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            numArr[i] = new num(x, y);
        }

        Arrays.sort(numArr, new Comparator<num>() {
            @Override
            public int compare(num o1, num o2) {
                if(o1.getX() == o2.getX())
                    return o1.getY() - o2.getY();
                else
                    return o1.getX() - o2.getX();
            }
        });

        for(num a : numArr)
            System.out.println(a.getX() + " " + a.getY());
    }
}

class num {
    private int x;
    private int y;

    public num() {
    }

    public num(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}