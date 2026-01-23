import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class P0010
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of array:");
        n = sc.nextInt();
        
        int[] arr = new int[n];
        Random rd = new Random();

        for (int i=0; i<n; i++){
            arr[i] = rd.nextInt(n);
        }

        System.out.println("Enter search value:");
        int v=sc.nextInt();

        Arrays.sort(arr);
        System.out.print("Sorted array: [");
        for (int i=0; i<n-1;i++) System.out.print(arr[i] + ", ");
        System.out.println(arr[n-1] +"]");

        System.out.print("Found " +v + " at index: ");

        int ch=0;
        for (int i=0; i<n; i++){
            if (arr[i] == v){
                System.out.print(i);
                ch=1;
                break;
            }
        }
        if(ch==0) System.out.print("Not found");
        	}
}
