package advance.dev.dao;

import advance.dev.model.TaiLieu;

public interface IManager {
	public void add(TaiLieu tl);
	public void print();
	public void sortBySoLuong(int order);
}
