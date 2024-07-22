import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Num> numArr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            numArr.add(new Num(x, y));
        }

        Collections.sort(numArr, new Comparator<Num>() {
            @Override
            public int compare(Num o1, Num o2) {
                if(o1.getY() == o2.getY())
                    return o1.getX() - o2.getX();
                else
                    return o1.getY() - o2.getY();
            }
        });

        for(Num num : numArr)
            System.out.println(num.getX() + " " + num.getY());
    }
}

class Num {
    private int x;
    private int y;

    public Num() {
    }

    public Num(int x, int y) {
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