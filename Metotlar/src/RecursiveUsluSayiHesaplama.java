import java.util.Scanner;

public class RecursiveUsluSayiHesaplama {
    public static int sonuc=1;
	static int usBul(int sayi,int us)
	{
		if(us==0)
		{
			return sonuc;
		}
		sonuc*=sayi;
		return usBul(sayi,us-1);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Taban de�eri giriniz :");
		int sayi=input.nextInt();
		System.out.println("�s de�eri giriniz :");
		int sayi1=input.nextInt();
		System.out.println(usBul(sayi,sayi1));
		

	}

}
