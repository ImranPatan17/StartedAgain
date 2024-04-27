package day2_Yogurtsale;
import java.util.Scanner;
public class Sol {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[3];
        int t=sc.nextInt();
        while (t-->0) {
            for (int i = 0; i < 3; i++) {
                arr[i]=sc.nextInt();
            }
            int n,a,b;
            n=arr[0];
            a=arr[1];
            b=arr[2];
           
            int ans = n*a;
            if(b<2*a){
                ans = (n / 2) * b + (n % 2) * a;
            }
            System.out.println(ans);
        }
sc.close();
    }
}
