import java.util.Scanner;

public class ManavKasaProgrami {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double armut = 2.14, elma = 3.67 ,	domates = 1.11,muz=0.95 ,patlican =5.00,sonuc;
		int a,e,d,m,p;
		
		System.out.println("Armut Ka� Kilo ? :");
		a=input.nextInt();
		System.out.println("Elma Ka� Kilo ? :");
		e=input.nextInt();
		System.out.println("Domates Ka� Kilo ? :");
		d=input.nextInt();
		System.out.println("Muz Ka� Kilo ? :");
		m=input.nextInt();
		System.out.println("Patl�can Ka� Kilo ? :");
		p=input.nextInt();
		sonuc=a*armut+e*elma+d*domates+m*muz+p*patlican;
		
		System.out.println("Toplam Tutar :"+sonuc);
		
		

	}

}
