package GeeksForGeeks.Day1;


import java.util.Scanner;

public class TrappingWaterProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
       /* int sum=0;
        for(int i=1;i<n-1;i++) {
            int left_max = find_left_max(arr, n, i);
            int right_max= find_right_max(arr,n,i);
            sum+=Math.min(left_max,right_max)-arr[i];
        }
        System.out.println(
                sum
        );*/

        int left[] = new int[n];
        int right[] = new int[n];
        int water = 0;
        left[0] = arr[0];
        for (int i = 1; i < n; i++)
            left[i] = Math.max(left[i - 1], arr[i]);
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            right[i] = Math.max(right[i + 1], arr[i]);
        for (int i = 0; i < n; i++)
            water += Math.min(left[i], right[i]) - arr[i];

        System.out.println(water);

    }

    private static int find_right_max(int[] arr, int n, int i) {
        int max=0;
        for (int j = n-1; j >i; j--) {
            max=Math.max(max,arr[j]);
        }
        return max;
    }

    private static int find_left_max(int[] arr, int n, int i) {
        int max=0;
        for (int j = 0; j <=i; j++) {
            max=Math.max(max,arr[j]);
        }
        return max;
    }
}
