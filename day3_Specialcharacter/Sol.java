package day3_Specialcharacter;
import java.util.*;
public class Sol {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0){
            
            int n= sc.nextInt();
            if(n%2==1)
            System.out.println("NO");
            else
            {
                System.out.println("YES");
               // StringBuilder result = new StringBuilder();

                // Concatenate the string "AABB" n times
                for (int i = 0; i < n/2; ++i) 
                    for (int j = 0; j < 2; ++j)
                    System.out.print("AB".charAt(i & 1));
                    System.out.println();
                  
                
        
                // Print the concatenated string in a straight line
                // 4

            }
        }
        sc.close();
    }
}
// for (int j = 0; j < 2; ++j)
// cout << "AB"[i & 1];