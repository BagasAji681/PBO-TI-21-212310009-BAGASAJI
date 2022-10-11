import java.util.Scanner;

public class Latihan_10 {
	public static void main(String[] args) {
		int pin,saldo = 150,setor,tarik;
		String jwb = "";
		Scanner input = new Scanner(System.in);
		Scanner input_jwb = new Scanner(System.in);
		
		do {
			System.out.print("Masukkan PIN = ");
			pin = input.nextInt(); 
		}while(pin != 212310009);
		
		do {
			System.out.println("Masukkan Menu");
			System.out.println("1. Lihat Saldo");
			System.out.println("2. Setor Tunai");
			System.out.println("3. Tarik Tunai");
			System.out.println("4. Keluar");
			System.out.print("Masukkan Pilihan = ");
			int pil = input.nextInt();
			
			if (pil == 1) {
				System.out.println(saldo);
			}else if (pil == 2) {
				System.out.print("Masukkan Nominal Setor Tunai = ");
				setor = input.nextInt();
				System.out.println("Saldo Anda saat ini = " + (saldo + setor));
			}else if (pil == 3) {
				System.out.print("Masukkan Nominal Tarik Tunai = ");
				tarik = input.nextInt();
				input.close();
				if (tarik > saldo) {
					System.out.println("Saldo tidak cukup");
				}else {
					System.out.println("Saldo Anda saat ini = " + (saldo - tarik));
				}
			}else if (pil == 4) {
				System.out.print("Apakah Anda ingin keluar aplikasi ? (Y/T) = ");
				jwb = input_jwb.nextLine();
			}else {
				System.out.println("Anda salah memasukkan menu");
			}
		}while(jwb.equals("N"));
	}
}