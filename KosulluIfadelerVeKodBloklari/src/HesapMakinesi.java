import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("��lem yap�lacak ilk say�y� giriniz:");
		int ilk_sayi=input.nextInt();
 		System.out.println("��lem yap�lacak ikinci  say�y� giriniz:");
 		int ikinci_sayi=input.nextInt();
 		System.out.println("Toplama i�lemi i�in '1' \n��karma i�lemi i�in '2'\n�arpma i�lemi i�in '3'\n"
 				+ "B�lme i�lemi i�in '4'\nMod alma i�lemi i�in '5' Bas�n�nz...");
 		int islem=input.nextInt();
 		double sonuc;
 		
 		switch(islem)
 		{
 		case 1:
 			sonuc=ilk_sayi+ikinci_sayi;
 			System.out.println("Sonu�:"+sonuc);
 			break;
 		case 2:
 			sonuc=ilk_sayi-ikinci_sayi;
 			System.out.println("Sonu�:"+sonuc);
 			break;
 		case 3:
 			sonuc=ilk_sayi*ikinci_sayi;
 			System.out.println("Sonu�:"+sonuc);
 			break;
 		case 4:
 			sonuc=ilk_sayi/ikinci_sayi;
 			System.out.println("Sonu�:"+sonuc);
 			break;
 		case 5:
 			sonuc=ilk_sayi%ikinci_sayi;
 			System.out.println("Sonu�:"+sonuc);
 			break;
 		default:
 			System.out.println("��lem girmediniz :(");
 			
 		}

	}

}
