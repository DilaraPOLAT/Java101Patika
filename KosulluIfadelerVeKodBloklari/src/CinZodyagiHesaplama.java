import java.util.Scanner;
public class CinZodyagiHesaplama {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Do�um Y�l�n�z� Giriniz: "); int yil = sc.nextInt();
	        if(yil%12==0){
	            System.out.println("Maymun");
	        }else if(yil%12==1){
	            System.out.println("Horoz");
	        }else if(yil%12==2){
	            System.out.println("K�pek");
	        }else if(yil%12==3){
	            System.out.println("Domuz");
	        }else if(yil%12==4){
	            System.out.println("Fare");
	        }else if(yil%12==5){
	            System.out.println("�k�z");
	        }else if(yil%12==6){
	            System.out.println("Kaplan");
	        }else if(yil%12==7){
	            System.out.println("Tav�an");
	        }else if(yil%12==8){
	            System.out.println("Ejderha");
	        }else if(yil%12==9){
	            System.out.println("Y�lan");
	        }else if(yil%12==10){
	            System.out.println("At");
	        }else if(yil%12==11){
	            System.out.println("Koyun");
	        }
	    

	}

}
