package GeeksForGeeks.Day1;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        SieveOfEratosthenes(n);
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                System.out.println("False");
                System.exit(0);
            }
        }
        System.out.println("True");

    }
    public static void SieveOfEratosthenes(int n){
        Boolean prime[] = new Boolean[n+1];
        for (int i = 0; i < n; i++) {
            prime[i]=true;
        }
        for (int i = 2; i*i <= n; i++) {
            if (prime[i]==true){
                for(int j = i*i; j <= n; j += i)
                    prime[j] = false;
            }
        }
        for(int i = 2; i <= n; i++)
        {
            if(prime[i])
                System.out.print(i + " ");
        }
    }
}
