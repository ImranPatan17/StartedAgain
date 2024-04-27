package day1_Neneandcardgame;




import java.util.*;

public class Solution {
    public static int countRepeatedElements(int[] array) {
        Map<Integer, Integer> elementCount = new HashMap<>();

        for (int num : array) {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }

        int repeatedCount = 0;
        for (int count : elementCount.values()) {
            if (count > 1) {
                repeatedCount++;
            }
        }

        return repeatedCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] array = new int[n];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }

            int repeatedCount = countRepeatedElements(array);
            System.out.println("Number of repeated elements: " + repeatedCount);
        }

        sc.close();
    }
}
