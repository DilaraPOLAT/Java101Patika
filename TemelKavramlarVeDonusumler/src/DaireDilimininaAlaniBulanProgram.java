import java.util.Scanner;

public class DaireDilimininaAlaniBulanProgram {

	public static void main(String[] args) {
		int r,a;
		double pi=3.14,result;
		Scanner input=new Scanner(System.in);
		System.out.println("Yar��ap Giriniz:");
		r=input.nextInt();
		System.out.println("A�� Giriniz:");
		a=input.nextInt();
		result=(pi*(r*r)*a)/360;
		System.out.println("Sonu�:"+result);
		

	}

}
