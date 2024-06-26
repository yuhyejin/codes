import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			sc.nextLine();

			HashSet<String> set = new HashSet<String>();
			
			for(int i=0; i<N; i++) {
				set.add(sc.nextLine());
			}
			
			String[] arr = new String[set.size()];
			set.toArray(arr);
			
			Arrays.sort(arr, new Comparator<String>() {
				@Override
				public int compare(String s1, String s2) {
					if(s1.length() == s2.length())
						return s1.compareTo(s2);
					else
						return s1.length() - s2.length();
				}
			});
			for(int i=0; i<set.size(); i++) {
				System.out.println(arr[i]);
			}
		}

    }

}
