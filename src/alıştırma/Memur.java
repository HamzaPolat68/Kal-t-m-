package alıştırma;

public class Memur extends çalış implements Devlet {
	public String departman,mesai;
	public int sicil;
	
	public Memur(String adSoyad,int tel,String email,String departman,String mesai) {
		super(adSoyad,tel,email);
		this.departman=departman;
		this.mesai=mesai;
	}
	public String getdepartman() {
		return departman;
	}
	public void setdepartman(String departman) {
		this.departman=departman;
	}
	public String mesai() {
		return mesai;
	}
	public void setmesai(String mesai) {
		this.mesai=mesai;
	}
	public int getSicilNo() {
		return sicil;
	}
	public void setSicilNo(int sicil) {
		this.sicil=sicil;
	}
	public void calis() {
		System.out.println(getadSoyad()+" çalıştı");
	}
	public void giris() {
		System.out.println(getadSoyad());
		super.giris();
	}
}