package com.cybersoft.xuly;

import java.util.ArrayList;

import com.cybersoft.quanlynhansu.NhanSu;
import com.cybersoft.quanlynhansu.NhanVien;

public class TestFile {
	public static void main(String[] args) {
		ArrayList<NhanSu> dsNhanSu = new ArrayList<NhanSu>();
		ArrayList<NhanSu> dsNhanVien = new ArrayList<NhanSu>();
		
		NhanSu nv = new NhanVien("", "Tuấn", "0369296613", 22, 100);
		
		dsNhanSu.add(nv);
		dsNhanVien.add(nv);
		
		System.out.println("DS Nhan Su:");
		for (NhanSu nhanSu : dsNhanSu) {
			nhanSu.xuatThongTin();
		}
		
		nv.setMaSo("MS01");
		
		System.out.println("DS Nhan Vien:");
		for (NhanSu nhanSu : dsNhanVien) {
			nhanSu.xuatThongTin();
		}
		
		// in lan 2
		
		System.out.println("========IN LAN 2");
		
		System.out.println("DS Nhan Su:");
		for (NhanSu nhanSu : dsNhanSu) {
			nhanSu.xuatThongTin();
		}
		
		System.out.println("DS Nhan Vien:");
		for (NhanSu nhanSu : dsNhanVien) {
			nhanSu.xuatThongTin();
		}
		
	}
}
