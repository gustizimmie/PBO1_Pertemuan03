import java.util.Scanner;
public class ifElse{
    public static void main(String[]args){
        String vocherInput = "";
        String NIKInput = "";
        String NIK = "12345";
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nSelamat datang di wifi Kampung");
        System.out.println("Pilih :");
        System.out.println("1. Kode Vocher 24 Jam - UB24");
        System.out.println("2. Kode Vocher 20 Jam - UB20");
        System.out.println("3. Kode Vocher 12 Jam - UB12");
        System.out.println("4. Kode Vocher 6  Jam - UB06");
        System.out.println("5. Kode Vocher 3  Jam - UB03");

        System.out.println("Pilih kode Wifi yang Anda inginkan (1-5):");
        int pilih = scanner.nextInt();
        scanner.nextLine();
       
        if(pilih == 1){
            String vocher = "UB24"; 
            System.out.println("Anda memilih yang 24 jam");    
            System.out.println("Silahkan Masukkan Kode Vocher : ");
            vocherInput = scanner.nextLine();
            System.out.println("Silahkan Masukkan NIK : ");
            NIKInput = scanner.nextLine();
            if(vocherInput.equalsIgnoreCase(vocher)&&(NIKInput.equals(NIK))){
                System.out.println("Selamat wifi aktif selama 24 jam");
            }else{
                System.out.println("Vocher / NIK Salah");
                System.out.println("Silahkan Coba lagi");
            }  
        }else if(pilih == 2){
            String vocher = "UB20"; 
            System.out.println("Anda memilih yang 20 jam");    
            System.out.println("Silahkan Masukkan Kode Vocher : ");
            vocherInput = scanner.nextLine();
            System.out.println("Silahkan Masukkan NIK : ");
            NIKInput = scanner.nextLine();
            if(vocherInput.equalsIgnoreCase(vocher)&&(NIKInput.equals(NIK))){
                System.out.println("Selamat wifi aktif selama 20 jam");
            }else{
                System.out.println("Vocher / NIK Salah");
                System.out.println("Silahkan Coba lagi");
            }  
        }else if(pilih == 3){
            String vocher = "UB12"; 
            System.out.println("Anda memilih yang 12 jam");    
            System.out.println("Silahkan Masukkan Kode Vocher : ");
            vocherInput = scanner.nextLine();
            System.out.println("Silahkan Masukkan NIK : ");
            NIKInput = scanner.nextLine();
            if(vocherInput.equalsIgnoreCase(vocher)&&(NIKInput.equals(NIK))){
                System.out.println("Selamat wifi aktif selama 12 jam");
            }else{
                System.out.println("Vocher / NIK Salah");
                System.out.println("Silahkan Coba lagi");
            }  
        }else if(pilih == 4){
            String vocher = "UB06"; 
            System.out.println("Anda memilih yang 6 jam");    
            System.out.println("Silahkan Masukkan Kode Vocher : ");
            vocherInput = scanner.nextLine();
            System.out.println("Silahkan Masukkan NIK : ");
            NIKInput = scanner.nextLine();
            if(vocherInput.equalsIgnoreCase(vocher)&&(NIKInput.equals(NIK))){
                System.out.println("Selamat wifi aktif selama 6 jam");
            }else{
                System.out.println("Vocher / NIK Salah");
                System.out.println("Silahkan Coba lagi");
            }  
        }else if(pilih == 5){
            String vocher = "UB03"; 
            System.out.println("Anda memilih yang 3 jam");    
            System.out.println("Silahkan Masukkan Kode Vocher : ");
            vocherInput = scanner.nextLine();
            System.out.println("Silahkan Masukkan NIK : ");
            NIKInput = scanner.nextLine();
            if(vocherInput.equalsIgnoreCase(vocher)&&(NIKInput.equals(NIK))){
                System.out.println("Selamat wifi aktif selama 3 jam");
            }else{
                System.out.println("Vocher / NIK Salah");
                System.out.println("Silahkan Coba lagi");
            }  
        }else{
            System.out.println("Tidak ada pilihan");
        }
        scanner.close();
    }
}
