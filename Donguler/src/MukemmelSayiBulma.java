import java.util.Scanner;
public class MukemmelSayiBulma {

	public static void main(String[] args) {
		// Bir say�n�n kendisi hari� pozitif tam say� �arpanlar� (kalans�z b�len say�lar�n) toplam� 
		//kendisine e�it olan say�ya m�kemmel say� denir.
		  Scanner input = new Scanner(System.in);
	         int toplam = 0;
	        
	        System.out.print("Bir sayi giriniz: ");
	        int sayi = input.nextInt();
	        
	        for(int i = 1; i < sayi; i++)
	        {
	            if(sayi % i == 0) {
	                toplam += i;
	            }
	        }
	        if(sayi == toplam) {
	            System.out.println(sayi + " M�kemmel bir sayidir");
	        }
	        else {
	            System.out.println(sayi + " M�kemmel bir sayi degildir.");
	        }

	}

}
