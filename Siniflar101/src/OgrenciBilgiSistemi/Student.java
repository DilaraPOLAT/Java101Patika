package OgrenciBilgiSistemi;

public class Student {

	  String name,stuNo;
	    int classes;
	    Course mat;
	    Course fizik;
	    Course kimya;
	    double avarage;
	    boolean isPass;


	    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
	        this.name = name;
	        this.classes = classes;
	        this.stuNo = stuNo;
	        this.mat = mat;
	        this.fizik = fizik;
	        this.kimya = kimya;
	        calcAvarage();
	        this.isPass = false;
	    }


	    public void addBulkExamNote(int mat, int fizik, int kimya) {
            double sonuc;
	        if (mat >= 0 && mat <= 100) {
	        	sonuc=(double)mat*0.8+this.mat.note*0.2;
	            this.mat.note = (int)sonuc;
	        }

	        if (fizik >= 0 && fizik <= 100) {
	        	sonuc=(double)fizik*0.8+this.fizik.note*0.2;
	            this.fizik.note = (int)sonuc;
	        }

	        if (kimya >= 0 && kimya <= 100) {
	        	sonuc=(double)kimya*0.8 + this.kimya.note*0.2;
	            this.kimya.note = (int)sonuc;
	        }
		    

	    }

	    public void isPass() {
	        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
	            System.out.println("Notlar tam olarak girilmemi�");
	        } else {
	            this.isPass = isCheckPass();
	            printNote();
	            System.out.println("Ortalama : " + this.avarage);
	            if (this.isPass) {
	                System.out.println("S�n�f� Ge�ti. ");
	            } else {
	                System.out.println("S�n�fta Kald�.");
	            }
	        }
	    }

	    public void calcAvarage() {
	        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
	    }

	    public boolean isCheckPass() {
	        calcAvarage();
	        return this.avarage > 55;
	    }

	    public void printNote(){
	        System.out.println("=========================");
	        System.out.println("��renci : " + this.name);
	        System.out.println("Matematik Notu : " + this.mat.note);
	        System.out.println("Fizik Notu : " + this.fizik.note);
	        System.out.println("Kimya Notu : " + this.kimya.note);
	    }
	
}
