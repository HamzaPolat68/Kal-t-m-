package alıştırma;

public class Asistan extends Akademisyen {
	public String yuksekOgr;
	
	public Asistan(String adSoyad, int tel,String email,String bolum,String gorev,String dersler,String yuksekOgr) {
		super(adSoyad,tel,email,bolum,gorev,dersler);
		this.yuksekOgr=yuksekOgr;
	}
	public String getyuksekOgr() {
		return yuksekOgr;
	}
	public void setyuksekOgr(String yuksekOgr) {
		this.yuksekOgr=yuksekOgr;
	}
	public void labagir() {
		System.out.print("Asistan"+getadSoyad()+"Laba girdi");
	}

}
