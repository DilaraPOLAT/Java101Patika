import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {

	public static void main(String[] args) {
		
		double kilo,boy,sonuc;
		Scanner input=new Scanner(System.in);
		System.out.println("L�tfen boyunuzu (metre cinsinde) giriniz :");
        boy=input.nextDouble();
        
        System.out.println("L�tfen kilonuzu giriniz : ");
        kilo=input.nextDouble();
        
        sonuc= kilo/(boy*boy);
        System.out.println("V�cut Kitle �ndeksiniz :"+sonuc);
	}

}
