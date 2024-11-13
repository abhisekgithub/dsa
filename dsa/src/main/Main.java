package main;

public class Main {
    public static void main(String[] args) {
        pattern1(5);
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
}
