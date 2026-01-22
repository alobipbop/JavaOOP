import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class P0006
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of array:");
        n = sc.nextInt();
        
        int[] arr = new int[n];
        Random rd = new Random();

        for (int i=0; i<n; i++){
            arr[i] = rd.nextInt(10);
        }

        System.out.println("Enter search value:");
        int v=sc.nextInt();

        Arrays.sort(arr);
        System.out.print("Sorted array: [");
        for (int i=0; i<n-1;i++) System.out.print(arr[i] + ", ");
        System.out.println(arr[n-1] +"]");

        System.out.print("Found " +v + " at index: ");

        int mid=(n-1)/2, l=0,r=n-1;
        int ch=1;
        while (l<=r) {
            if (arr[mid]==v) break;
            if (v <= arr[mid]) {
                r=mid;
                mid=((r-l)/2)+l;
            }
            else{
                l=mid;
                mid=((r-l)/2)+l;
            }
            if (arr[mid]==v) break;

            if(l==r && r==mid) {
                System.out.print("Not found");
                ch= 0;
                break;
            }
        }
        if(ch==1) System.out.print(mid);
        	}
}
