import java.util.Scanner;
public class HavaSicakliginaGoreEtkinlikOnerme {

	public static void main(String[] args) {
		int heat;
		Scanner input=new Scanner(System.in);
		System.out.println("S�cakl�k Giriniz:");
		heat=input.nextInt();
		if(heat<5)
		{
			System.out.println("Kaya�a gidebilirsiniz.");
		}
		else if(5<=heat && 15>=heat)
		{
			System.out.println("Sinemaya gidebilirsiniz.");
		}
	    if(10<=heat && 25>=heat)
	    {
	    	System.out.println("Pikni�e gidebilirsiniz.");
	    }
	    else if(heat>25)
	    {
	    	System.out.println("Y�zmeye gidebilirsiniz.");
	    }
		

	}

}
