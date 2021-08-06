# Java-Practice-E-Labs
import java.util.Scanner;
public class evenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        for(int i : a){
            a[i] = sc.nextInt();
            sum = sum + a[i];
            i++;
        }
        if(sum % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
        }
}
