import java.util.Scanner;
public class KullaniciGirisi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String kullanici_adi="Dilara";
		String sifre="java 101";
		System.out.println("Kullan�c� ad� giriniz:");
		String ad_giris =input.nextLine();
		if(kullanici_adi.equals(ad_giris))
		{
			System.out.println("Kullan�c� ad� DO�RU:)");
		}
		else
		{
			System.out.println("Kullan�c� ad� YANLI�!!!");
			System.out.println("�ifre s�f�rlamak ister misiniz?");
			System.out.println("Cevab�n�z evet ise 'E' ye Hay�r ise 'H' bas�n�z...");
			String cevap = input.next();
			if(cevap.equals("E"))
			{
				input.nextLine();
				while(true)
			  {
				System.out.println("Yeni �ifre Giriniz:");
				
				String Yenisifre=input.nextLine();
				if(Yenisifre.equals(sifre))
				{
					System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
				}
				else
				{
					System.out.println("�ifre olusturuldu :)");
					break;
				}
			 }
			}
			else
			{
				System.out.println("Programdan ��kt�n�z :(");
			}
			
		}
		
		

	}

}
