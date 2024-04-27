package day2_Yogurtsale;
import java.util.Scanner;
public class YogurtSale {
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
            if(n%2==0){
                if(((double)b/2)<a)
                System.out.println((n/2)*b); 
                else
                System.out.println(n*a);
            }
            else{
                if(b/2<=a){
                    if ((n/2)*b+a<n*a) 
                    System.out.println((n/2)*b+a);
                    else
                    System.out.println(n*a);
                }  
            }
        }
sc.close();
    }
}
