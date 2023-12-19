package alıştırma;

public class OgretimGor extends Akademisyen {
	public String unvan;
	
	public OgretimGor(String adSoyad,int telefon,String email,String bolum,String gorev,String dersler,String unvan) {
		super(adSoyad, telefon, email, bolum, gorev,  dersler);
		this.unvan=unvan;
	}
	public String getUnvan() {
		return unvan;
	}
	public void setUnvan(String unvan) {
		this.unvan=unvan;
	}
	public void dersegir() {
		System.out.print(getUnvan()+" "+getadSoyad());
		super.dersegir();
	}

}
