import java.util.Scanner;

public class PalindromikKelimeBulanProgram {

	public static void main(String[] args) {
//		Java dilinde kullan�c�n�n girdi�i kelimenin "Palindromik" olup olmad��� bulan bir program yaz�yoruz.
//		E�er bir kelimenin tersten okunu�u yine ayn� kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".
//		�rnek : abba , asa , kavak, kayak
		Scanner scan= new Scanner(System.in);
		System.out.println("Kelime Giriniz:");
		String kelime=scan.next();
		int i,syc=0,pldmi=0;
		for(i=kelime.length()-1;i>=0;i--)
		{
			
			if(kelime.charAt(i)!=kelime.charAt(syc))
			{
				System.out.println("Palindromik Kelime De�il!");
				pldmi=1;
				break;
			}
			
			syc++;
		}
		if(pldmi==0)
		{
			System.out.println("Palindromik Kelime.");
		}
		

	}

}
