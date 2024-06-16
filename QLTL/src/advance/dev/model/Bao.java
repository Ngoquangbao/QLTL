package advance.dev.model;

public class Bao extends TaiLieu {
	private String phatHanh;
	
	public Bao(String maTaiLieu, String nhaXuatBan, int soLuong, String phatHanh) {
		super(maTaiLieu, nhaXuatBan, soLuong);
		this.phatHanh = phatHanh;
	}

	public String getPhatHanh() {
		return phatHanh;
	}

	public void setPhatHanh(String phatHanh) {
		this.phatHanh = phatHanh;
	}
	public String toString() {
		// TODO Auto-generated method stub
		super.toString();
		return String.format("phatHanh:%s", phatHanh);
	}
}
