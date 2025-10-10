package jobsheet5;
import java.util.Scanner;

public class FlowchartAksesWifiTugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenisPengguna;
        int sks;

        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa): ");
        jenisPengguna = input.nextLine();

        System.out.print("Masukkan jumlah SKS: ");
        sks = input.nextInt();

        if (jenisPengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if (jenisPengguna.equalsIgnoreCase("mahasiswa")) {
            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses WiFi ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }

        input.close();
    }
}