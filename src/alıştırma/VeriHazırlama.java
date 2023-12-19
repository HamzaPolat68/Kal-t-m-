package alıştırma;

public class VeriHazırlama extends Memur {
	public String gorev;
	
	public VeriHazırlama(String adSoyad,int tel,String email,String departman,String mesai,String gorev) {
		super(adSoyad,tel,email,departman,mesai);
		this.gorev=gorev;
	}
	public String getgorev() {
		return gorev;
	}
	public void setgorev(String gorev) {
		this.gorev=gorev;
	}
	public void yazisma() {
		System.out.println(getgorev()+" "+getadSoyad()+" yazışma yapar.");
	}

}
