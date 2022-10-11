import java.util.Scanner;

public class Resto {
	private
		long harga;
		int pil;
		
		private long getPrices(){
			if (pil == 1) {
				harga = 22000;
			}else if (pil == 2) {
				harga = 18000;
			}else {
				harga = 25000;
			}
			return harga;
		}	
	
		public void chooseMenu() {
			System.out.println("Menu Sarapan:");
			System.out.println("1. Nasi Goreng");
			System.out.println("2. Bubur Ayam");
			System.out.println("3. Soto Ayam");
			System.out.print("Masukkan Pilihan = ");
			
			Scanner input = new Scanner(System.in);
			pil = input.nextInt();
			
			System.out.println("Harga adalah = " + getPrices());
		}
	
}