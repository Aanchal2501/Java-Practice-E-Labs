# Java-Practice-E-Labs
import java.util.Scanner;
public class highest_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i =0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the value of k ");
        int k = sc.nextInt();
        int lowest = a[0], p = 0, sum = 0;
        for(int i = 1; i <= k; i++) {
            for(int j = 0; j < n; j++) {
                if(a[j] < lowest) {
                    lowest = a[j];
                    p = j;
                }
            }
            a[p] = -lowest;
            lowest = a[0];
        }
        for(int i =0;i<n;i++) {
            sum = sum + a[i];
            System.out.println(a[i]);
        }
        System.out.println("sum is : " + sum);
    }
}
