import java.util.Scanner;
public class GirilenSayiyaKadarOlan4ve5inkuvvetleri {

	public static void main(String[] args) {
		// Java d�ng�ler ile girilen say�ya kadar olan 4 ve 5'in kuvvetlerini ekrana yazd�ran program� yaz�yoruz.
	      Scanner sc = new Scanner(System.in);
	        System.out.println("Sayi gir: ");
	        int sayi = sc.nextInt();
	        for(int i=1;i<=sayi;i++){
	            System.out.print("4'�nc� kat� :"+Math.pow(i, 4));
	            System.out.print("\t5'inci kat� : "+Math.pow(i, 5));
	            System.out.println("");
	        }
	}

}
