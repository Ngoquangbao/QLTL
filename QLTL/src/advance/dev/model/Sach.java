package advance.dev.model;

public class Sach extends TaiLieu {
	private String tacGia;
	private int soTrang;

	public Sach(String maTaiLieu, String nhaXuatBan, int soLuong, String tacGia, int soTrang) {
		super(maTaiLieu, nhaXuatBan, soLuong);
		this.tacGia = tacGia;
		this.soTrang = soTrang;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		super.toString();
		return String.format("TacGia:%s - SoTrang:%d", tacGia, soTrang);
	}
}
