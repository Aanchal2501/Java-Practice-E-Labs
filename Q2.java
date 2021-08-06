# Java-Practice-E-Labs

import java.util.Scanner;
public class add_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements of array :");
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
            a[i] = a[i] + 1;
        }
        System.out.println("elements in array are :");
        for (int j : a) {
            System.out.println(j);
            j++;
        }
    }
}
