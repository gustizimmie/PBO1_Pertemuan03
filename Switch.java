import java.util.Scanner;
public class Switch{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int nilai;
        System.out.println("Selamat Datang Di Sistem Pemilihan Kelas");
        System.out.println("Silahkan Masukkan Nilai dari (0-100) ");
        nilai = scanner.nextInt();

        switch(nilai / 10){
            case 10:
            case 9: 
                kelas = 1;
                break;
            case 8: 
                kelas = 2;
                break;
            case 7: 
                kelas = 3;
                break;
            case 6: 
                kelas = 4;
                break;
            default:
                kelas = 5;
                break;
        }
        switch(kelas){
            case 1:
                System.out.println("Selamat! Anda masuk ke Kelas A.");
                break;
            case 2:
                System.out.println("Anda masuk ke Kelas B.");
                break;
            case 3:
                System.out.println("Anda masuk ke Kelas C.");
                break;
            case 4:
                System.out.println("Anda masuk ke Kelas D.");
                break;
            case 5:
                System.out.println("Anda masuk ke Kelas E.");
                break;
            default:
                System.out.println("Nilai tidak valid. Masukkan nilai antara 0 hingga 100.");
        }

        scanner.close();
    }
}