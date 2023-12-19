package alıştırma;

public class Akademisyen extends çalış implements Devlet {
	public String bolum,gorev,dersler;
	int sicil;
	
	public Akademisyen(String adSoyad,int tel,String email,String bolum,String gorev, String dersler) {
		super(adSoyad,tel,email);
		this.bolum=bolum;
		this.gorev=gorev;
		this.dersler=dersler;
	}
	public String getbolum() {
		return bolum;
	}
	public void setbolum(String bolum) {
		this.bolum=bolum;
	}
	public String getgorev() {
		return gorev;
	}
	public void setgorev(String gorev) {
		this.gorev=gorev;
	}
	public String getdersler() {
		return dersler;
	}
	public void setdersler(String dersler) {
		this.dersler=dersler;
	}
	public int getSicilNo() {
		return sicil;
	}
	public void setSicilNo(int sicil) {
		this.sicil=sicil;
	}
	public void dersegir() {
		System.out.println(" derse girdi.");
	}
	public void giris() {
		System.out.print(getadSoyad());
	}
}
