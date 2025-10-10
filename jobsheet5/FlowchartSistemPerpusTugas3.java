package jobsheet5;
import java.util.Scanner;

public class FlowchartSistemPerpusTugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bawaKTM, registrasiOnline;

        System.out.print("Apakah membawa kartu mahasiswa (Ya/Tidak)? ");
        bawaKTM = input.nextLine();

        System.out.print("Apakah sudah registrasi online (Ya/Tidak)? ");
        registrasiOnline = input.nextLine();

        if (bawaKTM.equalsIgnoreCase("Ya") && registrasiOnline.equalsIgnoreCase("Ya")) {
            System.out.println("Diizinkan masuk");
        } else {
            System.out.println("Ditolak masuk");
        }

        input.close();
    }
}
    

