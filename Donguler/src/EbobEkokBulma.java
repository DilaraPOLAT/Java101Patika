import java.util.Scanner;
public class EbobEkokBulma {

	public static void main(String[] args) {
		//Java ile iki say�n�n EBOB ve EKOK de�erlerini "While D�ng�s�" kullanarak yaz�n�z.
		  Scanner sc = new Scanner(System.in);
	         System.out.print("N1 ve N2 gir: ");
	         int n1 = sc.nextInt(), n2 = sc.nextInt(), ekok,ebob=1;
	 
	        ekok= (n1 > n2) ? n1 : n2;
	 
	        while(true)
	        {
	            if( ekok % n1 == 0 && ekok % n2 == 0 )
	            {
	                System.out.printf("%d ve %d say�lar�n�n EKOK'u %d \n", n1, n2, ekok);
	                break;
	            }
	            ++ekok;
	        }
	        
	        while(n1 != n2)
	        {
	            if(n1 > n2)
	                n1 -= n2;
	            else
	                n2 -= n1;
	        }
	 
	        System.out.println("EBOB'u = " + n1);

	}

}
