import java.util.*;

public class CardExch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            boolean flag = false;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() >= k) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println(k - 1);
            } else {
                System.out.println(n);
            }
        }
        sc.close();
    }
}
