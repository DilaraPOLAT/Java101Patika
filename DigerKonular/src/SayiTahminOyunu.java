import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

	public static void main(String[] args) {
		Random rnd=new Random();
		Scanner scan=new Scanner(System.in);
		int number=rnd.nextInt(100);
		int tahmin,i,tahminsyc=0;
	
		for(i=0;i<5;i++)
		{
			System.out.println("Tahmin Giriniz:");
			tahmin=scan.nextInt();
			if(tahmin==number)
			{
				System.out.println("Tebrikler:) "+tahminsyc+". Denemede Do�ru Tahmin etiniz.");
			}
			else if(i==4)
			{
				tahminsyc++;
				System.out.println("Malesef:( Yanl�� Tahmin:"+"Kalan Hak "+(5-tahminsyc)+" Yar��ma bitti.");
				System.out.println("Sayi ="+number);
			}
			else
			{
				tahminsyc++;
				System.out.println("Malesef:( Yanl�� Tahmin:"+"Kalan Hak "+(5-tahminsyc));
				if(tahmin<0 && tahmin >100)
				{
					System.out.println("L�tfen 0-100 aras�nda bir sayi girin!");
				}
				else if(tahmin>number)
				{
					System.out.println("Tahmin eti�iniz say� daha k���k bir say� olacak!");
				}
				
				else 
				{
					System.out.println("Tahmin eti�iniz say� daha b�y�k bir say� olacak!");
				}
				
				
			}
			
		}
		
		

	}

}
