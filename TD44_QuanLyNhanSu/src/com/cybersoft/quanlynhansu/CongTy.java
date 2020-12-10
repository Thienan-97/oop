package com.cybersoft.quanlynhansu;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CongTy implements IExportable, IXuatNhap {
	/* properties */
	private String tenCongTy;
	private String tenVietTat; // CG -> CG20200001
	private String maSoThue;
	private double doanhThuThang;
	private ArrayList<NhanSu> dsNhanSu;

	private int STT = 999;
	private Helper helper;

	/* constructors */
	public CongTy() {
		tenCongTy = "";
		maSoThue = "";
		dsNhanSu = new ArrayList<NhanSu>();
		helper = new Helper();
	}

	public CongTy(String tenCongTy, String maSoThue) {
		this.tenCongTy = tenCongTy;
		this.maSoThue = maSoThue;
		dsNhanSu = new ArrayList<NhanSu>();
		helper = new Helper();
	}

	public CongTy(String tenCongTy, String tenVietTat, String maSoThue, double doanhThuThang) {
		this.tenCongTy = tenCongTy;
		this.tenVietTat = tenVietTat;
		this.maSoThue = maSoThue;
		this.doanhThuThang = doanhThuThang;
		dsNhanSu = new ArrayList<NhanSu>();
		helper = new Helper();
	}

	/* get, set */

	/* methods */
	public void nhapThongTin(Scanner sc) {
		System.out.print("Tên công ty: ");
		tenCongTy = sc.nextLine();
		System.out.print("Tên viết tắt: ");
		tenVietTat = sc.nextLine();
		System.out.print("Mã số thuế: ");
		maSoThue = sc.nextLine();
		System.out.print("Doanh thu tháng hiện tại: ");
		doanhThuThang = Double.parseDouble(sc.nextLine());

	}

	public boolean themNhanSu(NhanSu ns) {
		// 1. kiểm tra null
		// 2. kiểm tra tên rỗng
		// 3. kiểm tra trùng lặp
		// 4. thêm
		if (ns == null) {
			return false;
		}

		if ("".equals(ns.getHoTen())) {
			return false;
		}

		if (helper.daTonTaiNhanSu(ns)) {
			return false;
		}

		ns.setMaSo(helper.generateId());
		dsNhanSu.add(ns);
		return true;
	}

	public boolean xoaNhanSu(String maSo) {
		if (maSo == null) {
			return false;
		}

		for (NhanSu nhanSu : dsNhanSu) {
			if (maSo.equalsIgnoreCase(nhanSu.getMaSo())) {
				dsNhanSu.remove(nhanSu);
				return true;
			}
		}
		return false;
	}

	public void xuatThongTin() {
		int num = 72;
		String ttCongTy = "THÔNG TIN CÔNG TY";
		String ttNhanSu = "DANH SÁCH NHÂN SỰ";

		System.out.println();
		System.out.println(String.format("%" + (num * 2 - ttCongTy.length()) / 2 + "s", "") + ttCongTy
				+ String.format("%" + (num * 2 - ttCongTy.length()) / 2 + "s", ""));
		System.out.println("Tên công ty: " + tenCongTy);
		System.out.println("Mã số thuế: " + maSoThue);
		System.out.println("Doanh thu: " + String.format("%20.2f", doanhThuThang));

		System.out.println();
		System.out.println(String.format("%" + (num * 2 - ttNhanSu.length()) / 2 + "s", "") + ttNhanSu
				+ String.format("%" + (num * 2 - ttNhanSu.length()) / 2 + "s", ""));
		helper.drawLine(num);
		System.out.println();
		System.out.println(String.format(" %10s  ", "Mã số") + String.format("%16s  ", "Họ tên")
				+ String.format("%16s  ", "Số điện thoại") + String.format("%12s  ", "Ngày làm")
				+ String.format("%16s  ", "Lương cơ bản") + String.format("%17s  ", "Lương")
				+ String.format("%16s", "Chức vụ") + String.format("%25s  ", "Số nhân viên/Cổ phần"));
		helper.drawLine(num);
		System.out.println();
		for (NhanSu nhanSu : dsNhanSu) {
			nhanSu.xuatThongTin();
		}
		helper.drawLine(num);
		System.out.println();
		System.out.println(String.format(" %10s  ", "") + String.format("%16s  ", "") + String.format("%16s  ", "")
				+ String.format("%30s  ", "Tổng lương") + String.format("%17.2f  ", tinhTongLuong())
				+ String.format("%16s", "") + String.format("%25s  |", ""));
		helper.drawLine(num);
	}

	public double tinhTongLuong() {
		double tongLuong = 0;
		for (NhanSu nhanSu : dsNhanSu) {
			tongLuong += nhanSu.tinhLuong();
		}

		return tongLuong;
	}

	public void phanBoNhanVien(Scanner scanner) {
		ArrayList<NhanVien> dsNhanVienChuaPhanBo = new ArrayList<NhanVien>();
		ArrayList<TruongPhong> dsTruongPhong = new ArrayList<TruongPhong>();
		int luaChon;

		for (NhanSu ns : dsNhanSu) {
			if (ns instanceof NhanVien && ((NhanVien) ns).getTruongPhong() == null) {
				dsNhanVienChuaPhanBo.add((NhanVien) ns);
			} else if (ns instanceof TruongPhong) {
				dsTruongPhong.add((TruongPhong) ns);
			}
		}

		System.out.println("PHAN BO NHAN VIEN: ");

		for (NhanVien nv : dsNhanVienChuaPhanBo) {
			System.out.println("Thong tin nhan vien:");
			nv.xuatThongTin();

			System.out.println("Danh sach truong phong:");
			for (int i = 0; i < dsTruongPhong.size(); i++) {
				System.out.print("\t" + (i + 1) + ". ");
				dsTruongPhong.get(i).xuatThongTin();
			}
			System.out.println("\t0. Khong phan bo");
			int a = 1, b = 3;

			System.out.print("Lua chon: ");
			luaChon = a + (int) (Math.random() * ((b - a) + 1));
			System.out.println(luaChon);
			TruongPhong tp;

			// de-coupling code <> couple
			// micro optimize
			if (luaChon <= 0) {
				continue;
			}

			tp = dsTruongPhong.get(luaChon - 1);
			nv.setTruongPhong(tp.getMaSo());
			tp.tangNhanVien();

		}
	}

	public NhanSu timNhanVienLuongCaoNhat() {
		NhanSu nhanVien = new NhanVien();
		int viTri = -1;

		int maxLength = dsNhanSu.size();

		// 1. tim nhan vien thuong dau tien
		for (int i = 0; i < maxLength; i++) {
			NhanSu ns = dsNhanSu.get(i);
			if (ns instanceof NhanVien) {
				nhanVien.setMaSo(ns.getMaSo());
				nhanVien.setHoTen(ns.getHoTen());
				nhanVien.setSoDt(ns.getSoDt());
				nhanVien.setSoNgayLamViec(ns.getSoNgayLamViec());
				nhanVien.setLuongMotNgay(ns.getLuongMotNgay());
				viTri = i;
				break;
			}
		}

		for (int i = viTri; i < maxLength; i++) {
			NhanSu ns = dsNhanSu.get(i);

			if (!(ns instanceof NhanVien)) {
				continue;
			}

			if (ns.tinhLuong() > nhanVien.tinhLuong()) {
				nhanVien.setMaSo(ns.getMaSo());
				nhanVien.setHoTen(ns.getHoTen());
				nhanVien.setSoDt(ns.getSoDt());
				nhanVien.setSoNgayLamViec(ns.getSoNgayLamViec());
				nhanVien.setLuongMotNgay(ns.getLuongMotNgay());
			}
		}

		return nhanVien;
	}

	public NhanSu timTruongPhongQuanLyNhieuNhat() {
		NhanSu truongPhong = null;
		int viTri = 0;
		int maxLength = dsNhanSu.size();
		// tim ong truong phong dau tien
		for (int i = 0; i < maxLength; i++) {
			NhanSu ns = dsNhanSu.get(i);
			if (ns instanceof TruongPhong) {
				viTri = i;
				truongPhong = ns;
			}
		}

		// tim truong phong co so luong nhan vien duoi quyen nhieu nhat
		for (int i = viTri; i < maxLength; i++) {
			NhanSu ns = dsNhanSu.get(i);
			if (!(ns instanceof TruongPhong)) {
				continue;
			}

			int maxSoNv = ((TruongPhong) truongPhong).getSoNhanVien();
			int soNv = ((TruongPhong) ns).getSoNhanVien();
			if (maxSoNv < soNv) {
				truongPhong = ns;
			}
		}

		return truongPhong;
	}

	public void sapXepTheoTen() {
		Collections.sort(dsNhanSu, (a, b) -> a.getHoTen().compareTo(b.getHoTen()));
	}

	public void sapXepTheoLuong() {
		Collections.sort(dsNhanSu, new Comparator<NhanSu>() {
			@Override
			public int compare(NhanSu t, NhanSu t1) {
				if (t.getLuongMotNgay() * t.getSoNgayLamViec() > t1.getLuongMotNgay() * t1.getSoNgayLamViec()) {
					return -1;
				} else if (t.getLuongMotNgay() * t.getSoNgayLamViec() > t1.getLuongMotNgay() * t1.getSoNgayLamViec()) {
					return 1;
				} else {
					return 0;
				}
			}
		});
	}

	public NhanSu timGiamDocCoPhanNhieuNhat() {
		NhanSu giamDoc = null;
		int viTri = 0;
		int maxLength = dsNhanSu.size();
		// tim ong giam doc dau tien
		for (int i = 0; i < maxLength; i++) {
			NhanSu ns = dsNhanSu.get(i);
			if (ns instanceof GiamDoc) {
				viTri = i;
				giamDoc = ns;
			}
		}

		// tim giam co so co phan nhieu nhat
		for (int i = viTri; i < maxLength; i++) {
			NhanSu ns = dsNhanSu.get(i);
			if (!(ns instanceof GiamDoc)) {
				continue;
			}

			float maxSoCp = ((GiamDoc) giamDoc).getSoCoPhan();
			float soCp = ((GiamDoc) ns).getSoCoPhan();
			if (maxSoCp < soCp) {
				giamDoc = ns;
			}
		}

		return giamDoc;
	}

	public double loiNhuanCongTy() {
		double kq = tinhTongLuong();
		return doanhThuThang - kq;
	}

	public void timThuThap() {
        double kq = loiNhuanCongTy();
        NhanSu giamDoc = null;
        int viTri = 0;
        int maxLength = dsNhanSu.size();

        for (int i = 0; i < maxLength; i++) {
            NhanSu ns = dsNhanSu.get(i);
            if (ns instanceof GiamDoc) {
                viTri = i;
                giamDoc = ns;
                ns.xuatThongTin();
                float coPhan = ((GiamDoc) giamDoc).getSoCoPhan();
                double luong = giamDoc.tinhLuong();
                double thuNhap = giamDoc.tinhLuong() + (coPhan * kq);
                System.out.print("Tổng thu nhập của giám đốc: " + thuNhap + "\n");
            }
        }
    }

	// nested class
	private class Helper {

		public String generateId() {
			return tenVietTat + OffsetDateTime.now().getYear() + getStt(4);
		}

		public String getStt(int length) {
			String result = "";
			int i = 1;

			while (STT / (int) Math.pow(10, length - i) == 0) {
				result += "0";
				i++;
			}
			result += STT;
			STT++;

			return result;
		}

		public boolean daTonTaiNhanSu(NhanSu ns) {
			for (NhanSu nhanSu : dsNhanSu) {
				if (nhanSu.getSoDt().equalsIgnoreCase(ns.getSoDt())) {
					return true;
				}
			}
			return false;
		}

		private void drawLine(int num) {
			for (int i = 0; i < num; i++) {
				System.out.print("- ");
			}
		}
	}

	@Override
	public Object exportExcel() {
		dsNhanSu.get(100);
		return null;
	}

	@Override
	public void nhapThongTin() {

	}
}
