import java.util.Scanner;

public class Latihan_03 {
	public static void main(String[] args) {
		int pilih;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Menu Nyarap:");
		System.out.println("1. Nasi Goreng");
		System.out.println("2. Bubur Ayam");
		System.out.println("3. Soto Ayam");
		System.out.print("Masukkan Pilihan = ");
		pilih = input.nextInt();
		input.close();
		
		if (pilih == 1) {
			System.out.println("Anda memesan Nasi Goreng dengan harga Rp\r\n"
					+ "22.000,-");
		}else if (pilih == 2) {
			System.out.println("“Anda memesan Bubur Ayam dengan harga Rp18.000,-");
		}else if (pilih == 3) {
			System.out.println("“Anda memesan Soto Ayam dengan harga Rp 25.000,-");
		}else {
			System.out.println("Maaf menu yang anda masukkan salah.");
		}
	}
}