
import java.util.Scanner;
public class UcgeninAlaniniHesaplayanProgram {

	public static void main(String[] args) {
		int a,b,c;
		double alan,cevre;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("a kenar� giriniz:");
		a=scan.nextInt();
		System.out.println("b kenar� giriniz:");
		b=scan.nextInt();
		System.out.println("c kenar� giriniz:");
		c=scan.nextInt();
		
		cevre= (double)((a+b+c) / 2);
        alan = Math.sqrt(cevre * (cevre-a) * (cevre-b) * (cevre-a));
      
        System.out.println(alan);
	}

}
