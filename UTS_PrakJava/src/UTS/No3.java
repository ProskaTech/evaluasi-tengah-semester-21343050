package UTS;

//Created By 21343050_Heri Ramadhan

import javax.swing.JOptionPane;

public class No3 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Masukkan Angka Yang Anda Inginkan: ");
        int angka = Integer.parseInt(a);

        if (angka > 0) {
            String msg = angka+" Adalah Angka Positif";
            JOptionPane.showMessageDialog(null, msg);
        } else if (angka < 0) {
            String msg = angka+" Adalah Angka Negatif";
            JOptionPane.showMessageDialog(null, msg);
        } else {
            String msg = angka+" Bukanlah Negatif dan Positif";
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}
