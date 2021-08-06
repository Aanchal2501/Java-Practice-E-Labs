# Java-Practice-E-Labs
import java.util.Scanner;
public class ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first element : ");
        int first = sc.nextInt();
        System.out.println("enter the difference : ");
        int diff = sc.nextInt();
        System.out.println("enter the no. of element in sequence : ");
        int n = sc.nextInt();
        int sum = first;
        String s = "";
        for(int i = 1; i <= n; i++) {
            s = s + sum + ", ";
            sum = sum + diff;
        }
        s = s.substring(0,s.length()-2);
        System.out.println(s);
    }
}
