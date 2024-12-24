package ProblemSet3;

import java.util.Arrays;
import java.util.Scanner;

public class BasicMath {
    public static void main(String[] args) {
            printNPrime(30);

    }

    public static int printNoOfDegit(int n){
        int degit=0;
        while(n>0){
            degit++;
            n/=10;
        }
        return degit;
    }

    public static int reverserNumber(int n){
        int reverse=0;int lastdegit;
        while(n>0){
            lastdegit=n%10;
            reverse=(reverse*10)+lastdegit;
            n/=10;
        }
        return reverse;
    }

    public static void printNPrime(int n){
        int[] prime=new int[n+1];
        for(int i=0;i<=n;i++){
            prime[i]=1;
        }
        System.out.println(Arrays.toString(prime));

        for(int i=2;i*i <= n;i++){
            if(prime[i]==1){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=0;
                }
            }
        }
        System.out.println(Arrays.toString(prime));

        for (int i = 2; i <= n; i++) {
           if(prime[i]==1)
               System.out.print(i+" ");
        }

    }
}
