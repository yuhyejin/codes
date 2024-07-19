import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Member> memArr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            memArr.add(new Member(age, name, i));
        }

        Collections.sort(memArr, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                if(o1.getAge() == o2.getAge())
                    return o1.getIdx() - o2.getIdx();
                else return o1.getAge() - o2.getAge();
            }
        });

        for (Member mem : memArr) {
            System.out.println(mem.getAge() + " " + mem.getName());
        }



    }
}

class Member {
    private int age;
    private String name;
    private int idx;

    public Member() {
    }

    public Member(int age, String name, int idx) {
        this.age = age;
        this.name = name;
        this.idx = idx;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getIdx() {
        return idx;
    }
}

