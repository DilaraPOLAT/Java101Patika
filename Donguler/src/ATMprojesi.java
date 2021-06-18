import java.util.Scanner;
public class ATMprojesi {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	         int bakiye = 1000;
	        
	        System.out.println("Bakiyeniz = " + bakiye);
	        System.out.println("\n****�SLEMLER****\n");
	        System.out.println("1. Para �ekme");
	        System.out.println("2. Para Yat�rma");
	        System.out.println("3. Bakiye sorgulama");
	        System.out.println("4. Kart �ade");
	        
	        System.out.print("\n�sleminizi Seciniz: ");
	        int islem = sc.nextInt();
	        
	        switch(islem) {
	        case 1:
	            System.out.println("Bakiyeniz = " + bakiye);
	            System.out.print("�ekmek istedi�iniz tutar� giriniz: ");
	            int tutar = sc.nextInt();
	            if(tutar > bakiye) {
	                System.out.print("Yetersiz bakiye. Tekrar giriniz: ");
	                tutar = sc.nextInt();
	            }
	            bakiye -= tutar;
	            System.out.println("Yeni bakiyeniz = " + bakiye);
	            break;
	        case 2:
	            System.out.println("Bakiyeniz = " + bakiye);
	            System.out.print("Yat�rmak istedi�iniz tutar� giriniz: ");
	            tutar = sc.nextInt();
	            bakiye += tutar;
	            System.out.println("Yeni bakiyeniz = " + bakiye);
	            break;
	        case 3:
	            System.out.println("Bakiyeniz = " + bakiye);
	            break;
	        case 4:
	            System.out.println("Kart�n�z� almay� unutmay�n�z.!!");
	        default:
	            System.out.println("Yanl�s islem secitiniz. Tekrar giriniz.");
	        }

	}

}
