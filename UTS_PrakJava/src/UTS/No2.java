package UTS;

//Created By 21343050_Heri Ramadhan

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah baris: ");
        int x = input.nextInt();
        input.close();

        for (int a = 0; a <= x - 1; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print(" ");
            }
            for (int c = a; c <= x - 1; c++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        for (int a = x; a >= 0; a--) {
            for (int b = 0; b < a; b++) {
                System.out.print(" ");
            }
            for (int c = a; c <= x - 1; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
