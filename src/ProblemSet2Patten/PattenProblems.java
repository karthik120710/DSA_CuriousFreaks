package ProblemSet2Patten;

public class PattenProblems {
    public static void main(String[] args) {
        patten4(5);
    }

    public static void patten1(int n){
            /*
        Input:
        n = 4
        Expected output:
        ****
        ***
        **
        *
            */
        for(int i=1;i<=n;i++){
            for (int j = 1; j <= n-i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void patten2(int n){

        /*
        Input:

                n = 4
                Expected output:
                4321
                321
                21
                1
         */

        for(int i=0;i<n;i++)
        {
            for(int j=n-i; j>= 1; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void patten3 (int n){
        /*
            Input:
            n = 4
            Expected output:
            *
            **
            ***
            ****
         */

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patten4(int n){
        /*
            Input:
            n = 8
            Expected output:
            1
            2 2
            3 3 3
            4 4 4 4
            5 5 5 5 5
            6 6 6 6 6 6
            7 7 7 7 7 7 7
            8 8 8 8 8 8 8 8
         */
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
