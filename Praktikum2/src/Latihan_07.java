import java.util.Scanner;

public class Latihan_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String jwb;
		
		Resto restoObj = new Resto();
		
		do {
			restoObj.chooseMenu();
			System.out.print("Apakah anda akan pesen lagi ? (Y/T) ");
			jwb = input.nextLine();
		}
		while(jwb.equals("Y"));
	}
}