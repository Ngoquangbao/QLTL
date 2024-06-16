package advance.dev.model;

public class TapChi extends TaiLieu {
	private int soPhatHanh;
	private String thangPhatHanh;

	public TapChi(String maTaiLieu, String nhaXuatBan, int soLuong, int soPhatHanh, String thangPhatHanh) {
		super(maTaiLieu, nhaXuatBan, soLuong);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public String getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(String thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		super.toString();
		return String.format("SoPhatHanh:%d - ThangPhatHanh:%s", soPhatHanh, thangPhatHanh);
	}

}
