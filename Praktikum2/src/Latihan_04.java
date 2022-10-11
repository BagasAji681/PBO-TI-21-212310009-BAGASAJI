import java.util.Scanner;

public class Latihan_04 {
	public static void main(String[] args) {
		int angka;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Masukkan Angka = ");
		angka = input.nextInt();
		
		faktorisasi(angka);
	}
	
	static void faktorisasi (int paramAngka) {
		for (int i = 1; i <= paramAngka; i++) {
			if (paramAngka % i == 0 && paramAngka != i) {
				System.out.print(i + ",");
			}else if (i == paramAngka && paramAngka % i == 0){
				System.out.print(i + " ");
			}else {
				System.out.print("");
			}
		}
	}
}