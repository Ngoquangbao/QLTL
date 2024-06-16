package advance.dev;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import advance.dev.dao.IManager;
import advance.dev.dao.Manager;
import advance.dev.model.Bao;
import advance.dev.model.Sach;
import advance.dev.model.TapChi;

public class MainApp {
	static final int ASC = 1;
	static final int DESC = -1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IManager manager = new Manager();
		readFromFile(manager);
		manager.print();

		System.out.println("=====SAP XEP TANG DAN======");
		manager.sortBySoLuong(ASC);
		manager.print();

		System.out.println("=====SAP XEP GIAM DAN======");
		manager.sortBySoLuong(DESC);
		manager.print();

	}

	private static void readFromFile(IManager manager) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fstream = new FileInputStream("input.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String strLine;
			// Đọc từng dòng từ tập tin input.txt
			while ((strLine = br.readLine()) != null) {
				if(strLine.startsWith("#sach")) {
					readSach(manager, br.readLine());
				}
				if(strLine.startsWith("#bao")) {
					readBao(manager, br.readLine());
				}
				if(strLine.startsWith("#tapchi")) {
					readTapChi(manager, br.readLine());
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	private static void readTapChi(IManager manager, String line) {
		// TODO Auto-generated method stub
		String data[] = line.split(",");
		String maTaiLieu = data[0];
		String nxb = data[1];
		
		int sl = Integer.parseInt(data[2].trim());
		int soPhatHanh = Integer.parseInt(data[3].trim());
		String phatHanh = data[4];
		
		manager.add(new TapChi(maTaiLieu, nxb, sl, soPhatHanh, phatHanh));
	}

	private static void readBao(IManager manager, String line) {
		// TODO Auto-generated method stub
		String data[] = line.split(",");
		String maTaiLieu = data[0];
		String nxb = data[1];
		
		int sl = Integer.parseInt(data[2].trim());
		String phatHanh = data[3];
		
		manager.add(new Bao(maTaiLieu, nxb, sl, phatHanh));
	}

	private static void readSach(IManager manager, String line) {
		// TODO Auto-generated method stub
		String data[] = line.split(",");
		String maTaiLieu = data[0];
		String nxb = data[1];
		int sl = Integer.parseInt(data[2].trim());
		String tacGia = data[3];
		int soTrang = Integer.parseInt(data[4].trim());
		
		manager.add(new Sach(maTaiLieu, nxb, sl, tacGia, soTrang));
	}

}
