import java.util.Scanner;
public class TekBirSayiGirileneKadarCiftVeDordunKatlariniToplayanProgram {

	public static void main(String[] args) {
//		Java d�ng�ler ile tek bir say� girilene kadar kullan�c�dan giri�leri kabul eden ve girilen
//		de�erlerden �ift ve 4'�n katlar� olan say�lar� toplay�p ekrana basan program� yaz�yoruz.
		 Scanner input = new Scanner(System.in);
	        int toplam=0;
	        int sayi;
	        do {
	            System.out.println("Sayi gir: "); sayi = input.nextInt();
	            if(sayi%2 == 0 && sayi%4 == 0){
	                toplam += sayi;
	            }
	        } while (sayi%2==0);
	        System.out.println("Toplam : "+toplam);

	}

}
