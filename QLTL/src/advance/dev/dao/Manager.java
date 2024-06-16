package advance.dev.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import advance.dev.model.TaiLieu;

public class Manager implements IManager {
	private List<TaiLieu> taiLieuList = new ArrayList<TaiLieu>();

	@Override
	public void add(TaiLieu tl) {
		// TODO Auto-generated method stub
		taiLieuList.add(tl);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		for (TaiLieu taiLieu : taiLieuList) {
			System.out.println(taiLieu);
		}
	}

	@Override
	public void sortBySoLuong(int order) {
		// TODO Auto-generated method stub
		Collections.sort(taiLieuList, new Comparator<TaiLieu>() {

			@Override
			public int compare(TaiLieu o1, TaiLieu o2) {
				// TODO Auto-generated method stub
				if (order > 0)
					return o1.getSoLuong() > o2.getSoLuong() ? -1 : 1;
				if (order < 0)
					return o1.getSoLuong() > o2.getSoLuong() ? 1 : -1;
				return 0;
			}
		});
	}

}
