import java.util.Scanner;
public class BirSayininBasamakSayilarininToplaminiHesaplayanProgram {

	public static void main(String[] args) {
		//Bir say�n�n basamak say�lar�n�n toplam�n� hesaplayan program yaz�n�z.
		 Scanner sc = new Scanner(System.in);
         System.out.print("Sayiyi Gir: ");
        int num = sc.nextInt();
 
        int adet = 0,toplam=0;
 
        while(num != 0)
        {
           toplam=(num%10)+toplam;
           num /= 10;
            ++adet;
        }
 
        System.out.println("Basamak Toplam�: " + toplam);

	}

}
