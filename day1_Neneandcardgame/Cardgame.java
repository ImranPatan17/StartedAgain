package day1_Neneandcardgame;
import java.util.*;
public class Cardgame {
    public static int countRepeatedElements(int[] array) {
        // Create a HashMap to store element counts
        Map<Integer, Integer> elementCount = new HashMap<>();

        // Iterate through the array and count occurrences of each element
        for (int num : array) {
            if (elementCount.containsKey(num)) {
                elementCount.put(num, elementCount.get(num) + 1);
            } else {
                elementCount.put(num, 1);
            }
        }

        // Initialize a variable to count repeated elements
        int repeatedCount = 0;

        // Iterate through the element counts and count repeated elements
        for (int count : elementCount.values()) {
            if (count > 1) {
                repeatedCount++;
            }
        }

        return repeatedCount;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int t=sc.nextInt();
         int n;
         while(t-- >0){
            n=sc.nextInt();
            int [] array=new int[100];
         
            for (int i = 0; i < n; i++) {
                 array[i] = sc.nextInt();
            }
       
        int repeatedCount = countRepeatedElements(array);
        System.out.println( repeatedCount -1);
         }
        sc.close();
    }
}
