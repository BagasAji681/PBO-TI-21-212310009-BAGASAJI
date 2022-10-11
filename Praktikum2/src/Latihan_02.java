import java.util.Scanner;

public class Latihan_02 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int z,i;
	boolean angka_prima = true;
			
		System.out.print("Input NPM Anda : ");
		z = input.nextInt();
		input.close();
			
		//0 dan 1 bukan prima
		if (z == 0 || z == 1) {
			angka_prima = false;
		}
		else {
			for (i = 2; i <= z / 2; i++) {
				if (z % i == 0) {
					angka_prima = false;
					break;
				}
			}
		}
		if (angka_prima)
			System.out.println(z + " Adalah bilangan prima");
		else
			System.out.println(z + " Bukan bilangan prima");
	}
}