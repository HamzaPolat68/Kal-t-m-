package alıştırma;

public class Güvenlik extends Memur {
	public String belge;
	
	public Güvenlik(String adSoyad,int tel,String email,String departman,String mesai,String belge) {
		super(adSoyad,tel,email,departman,mesai);
		this.belge=belge;
	}
	public String getbelge() {
		return belge;
	}
	public void setbelge(String belge) {
		this.belge=belge;
	}
	

}
