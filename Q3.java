# Java-Practice-E-Labs
import java.util.Scanner;
public class outliner {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        int c = 0, p= 0, p1=0;
        for(int i =0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            if( a[i] % 2 == 0) {
                c++;
                p = a[i];
            }
            else {
                p1 = a[i];
            }
        }
        System.out.println("the outliner number is : ");
        if(c == 1)
            System.out.println(p);
        else
            System.out.println(p1);
    }
}
