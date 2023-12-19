package alıştırma;

public class çalış {
	public String adSoyad,email;
	public int tel;
	
	public çalış(String adSoyad,int tel,String email) {
		this.adSoyad=adSoyad;
		this.email=email;
		this.tel=tel;
	}
	
	public String getadSoyad() {
		return adSoyad;
	}
	public void setadSoyad(String adSoyad) {
		this.adSoyad=adSoyad;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email=email;
	}
	public int gettel() {
		return tel;
	}
	public void settel(int tel) {
		this.tel=tel;
	}
	public void giris() {
		System.out.print(" giriş yaptı");
	}
	public void cikis() {
		System.out.print(" çıkış yaptı");
	}
	public void yemek() {
		System.out.print(" yemek yedi");
	}
}
