package MaasHesabi;

public class Employee {
	public String name;
	public int salary;
	public int workHours;
	public int hireYear ;//ise baslangic yili
	public Employee(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	public int tax(int maas) {    // Maa�a uygulanan vergiyi hesaplayacakt�r.
		if(maas>=1000)
		{
			return (int)(maas*0.3);
		}
		return maas;
	}
	
	public int bonus(int maas,int calismasaati) {    // Saat ba��na 30 TL olacak �ekilde maa�a uygulanacak bonus �cretleri hesaplayacakt�r.
		
		    maas=maas+calismasaati*30;
			return maas;
		
	
	}

	public int raiseSalary(int yil,int maas) {// �al��an�n i�e ba�lang�� y�l�na g�re maa� art���n� hesaplayacakt�r. �uan ki y�l� 2021 olarak al�n.
		yil=2021-yil;
		if(yil<10)
		{
			maas=maas+(int)(maas*0.5);
			return maas;
		}
		else if(yil>9 &&yil<20)
		{
			maas=maas+(int)(maas*0.10);
			return maas;
		}
		else
		{
			maas=maas+(int)(maas*0.15);
			return maas;
		}
	}

	public  void toString(Employee emp) {
		int vergi=tax(emp.salary);
		int bonus=bonus(emp.salary,emp.workHours)-emp.salary;
		int vergiBonus=((emp.salary-vergi)+bonus);
		int maasArtisi=raiseSalary(emp.hireYear,emp.salary)-emp.salary;
		int toplamMaas=vergiBonus+ maasArtisi;
		System.out.println("Ad�:"+emp.name+"\nMaa��:"+emp.salary+"\n�al��ma saati:"+emp.workHours+"\nBa�lang�� Y�l� :"+emp.hireYear+
				"\nvergi:"+vergi+"\nBonus:"+bonus+"\nMaas Art���:"+maasArtisi );
		System.out.println("Vergi ve Bonuslar ile birlikte maa� :"+vergiBonus);
		System.out.println("Toplam Maa� :"+toplamMaas);
		
	}
}
