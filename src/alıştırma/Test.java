package alıştırma;

public class Test {

	public static void main(String[] args) {
		OgretimGor o=new OgretimGor("Hamza Polatçelik",1435,"h@ibu.edu.tr","Bilgisayar Mühendisliği","Hoca","OOP","Profesör");
		o.dersegir();
		VeriHazırlama v=new VeriHazırlama("Saci Yerabakan",2131,"s@ibu.edu.tr","Yazı İşleri","Gece","Yazışma Müdürü");
		v.yazisma();
		o.setSicilNo(6814);
		System.out.println(o.getadSoyad()+" "+"Sicil No: "+o.getSicilNo());
		
	}

}
