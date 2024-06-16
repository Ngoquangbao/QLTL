package advance.dev.model;

public class TaiLieu {
	private String maTaiLieu;
	private String nhaXuatBan;
	private int soLuong;

	public TaiLieu(String maTaiLieu, String nhaXuatBan, int soLuong) {
		super();
		this.maTaiLieu = maTaiLieu;
		this.nhaXuatBan = nhaXuatBan;
		this.soLuong = soLuong;
	}

	public String getMaTaiLieu() {
		return maTaiLieu;
	}

	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("MaTL:%s - Nxb:%s - SL:%d", maTaiLieu, nhaXuatBan, soLuong);
	}
}
