package main;

public class Main {
    public static void main(String[] args) {
        pattern2(5);
    }

    public static void pattern1(int n) {
        // _ j-1;
        // * n-2*j
        // _ j -1

        for(int j=0;j<n;j++){
            for(int i=0;i<=j-1;i++){
                System.out.print(" ");
            }
            for(int i=0;i<n-2*j;i++){
                System.out.print("*");
            }
            for(int i=0;i<=j-1;i++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void pattern2(int n) {
        /*
        * 1______1
        * 12____21
        * 123__321
        * 12344321
        *
        *
        * */

        for(int j=1;j<=n;j++){
            //numbers = j
            //space = 2*n-2*rowNumber
            //number = j
            for(int i=1;i<=j;i++){
                System.out.print(i);
            }
            //space
            for(int i =0;i<2*n-2*j;i++){
                System.out.print(" ");
            }
            for(int i=j;i>0;i--){
                System.out.print(i);
            }

            System.out.println();
        }

    }
}
