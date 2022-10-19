package UTS;

//Created By 21343050_Heri Ramadhan

public class No1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i; j++) {
                if (i == 1) {
                    System.out.print(j+1);
                } else {
                    System.out.print(j);
                }
            }
            for (int j = 1; j <= 2*(2-i+1)-1; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j <= 4*i; j++) {
                if (i == 2) {
                    if (j >= 5) {
                        System.out.print(j);
                    }
                } else {
                    System.out.print(j+1);
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*(5-i+1)-1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
