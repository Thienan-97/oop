package qlhocsinh;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HocSinh extends Person{
//	properties
	protected int lop;
	protected String giaoVienCN;
	protected float hocPhiMotBuoi;
	protected float soNgayHoc;
	protected float diemToan, diemVan, diemAnh;
	protected int hanhKiem;
	
		
	public HocSinh(String id, String name, String ngaySinh, int lop, String giaoVienCN, float soNgayHoc, float diemToan,
			float diemVan, float diemAnh, int hanhKiem) {
		super(id, name, ngaySinh);
		this.lop = lop;
		this.giaoVienCN = giaoVienCN;
		this.soNgayHoc = soNgayHoc;
		this.diemToan = diemToan;
		this.diemVan = diemVan;
		this.diemAnh = diemAnh;
		this.hanhKiem = hanhKiem;
	}

	public HocSinh() {
		super();
		this.giaoVienCN = "";
	}

	public int getLop() {
		return lop;
	}

	public void setLop(int lop) {
		this.lop = lop;
	}

	public String getGiaoVienCN() {
		return giaoVienCN;
	}

	public void setGiaoVienCN(String giaoVienCN) {
		this.giaoVienCN = giaoVienCN;
	}

	public float getHocPhiMotBuoi() {
		return hocPhiMotBuoi;
	}

	public void setHocPhiMotBuoi(float hocPhiMotBuoi) {
		this.hocPhiMotBuoi = hocPhiMotBuoi;
	}

	public float getSoNgayHoc() {
		return soNgayHoc;
	}

	public void setSoNgayHoc(float soNgayHoc) {
		this.soNgayHoc = soNgayHoc;
	}
	
	public int getHanhKiem() {
		return hanhKiem;
	}

	public void setHanhKiem(int hanhKiem) {
		this.hanhKiem = hanhKiem;
	}
	
	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemVan() {
		return diemVan;
	}

	public void setDiemVan(float diemVan) {
		this.diemVan = diemVan;
	}

	public float getDiemAnh() {
		return diemAnh;
	}

	public void setDiemAnh(float diemAnh) {
		this.diemAnh = diemAnh;
	}

	//	method
	public double tinhHocPhi() {
		return soNgayHoc * hocPhiMotBuoi;
	}
	
	public float tinhDiemTrungBinh() {
		return (diemAnh + diemToan + diemVan) / 3;
	}
	
	public String xepLoaiHocSinh() {
		float diemTrungBinh = tinhDiemTrungBinh();
		String xepLoai = "Yếu";
		if (hanhKiem == 1) {
			xepLoai = "Yếu";
		} else if (diemTrungBinh >= 8 && hanhKiem == 4) {
			xepLoai = "Giỏi";
		} else if (diemTrungBinh >= 6.5 && hanhKiem > 2) {
			xepLoai = "Khá";
		} else if (diemTrungBinh > 6.5 && hanhKiem == 2) {
			xepLoai = "Trung bình";
		} else if (diemTrungBinh >= 4.5) {
			xepLoai = "Trung bình";
		} else {
			xepLoai = "Yếu";
		}
		return xepLoai;
	}
	
	static Scanner sc = new Scanner(System.in);
	static int i = 0;
	
	public static Person p[] = new Person[100];
	private BufferedWriter writer;
	
	@Override
	public void addData() {
		// TODO Auto-generated method stub
		int addMore;

	    do {
	    	System.out.print("Nhập id: ");
			id = sc.nextLine();
			System.out.print("Nhập họ tên: ");
			name = sc.nextLine();
//			System.out.print("Nhập ngày sinh: ");
//			ngaySinh = sc.nextLine();
//			System.out.print("Lớp: ");
//			lop = Integer.parseInt(sc.nextLine());
//			System.out.print("Nhập giáo viên chủ nhiệm: ");
//			giaoVienCN = sc.nextLine();
//			System.out.print("Học phí một buổi: ");
//			hocPhiMotBuoi = Float.parseFloat(sc.nextLine());
//			System.out.print("Số ngày học: ");
//			soNgayHoc = Float.parseFloat(sc.nextLine());
//			System.out.print("Điểm toán: ");
//			diemToan = Float.parseFloat(sc.nextLine());
//			System.out.print("Điểm anh: ");
//			diemAnh = Float.parseFloat(sc.nextLine());
//			System.out.print("Điểm văn: ");
//			diemVan = Float.parseFloat(sc.nextLine());
//			System.out.print("Hạnh kiểm: ");
//			hanhKiem = Integer.parseInt(sc.nextLine());
	        p[i] = new HocSinh(id, name, ngaySinh, lop, giaoVienCN, soNgayHoc, diemToan,
	    			diemVan, diemAnh, hanhKiem);
	        ++i;
	        System.out.println("To add another Student Record Press 1");
	        addMore = sc.nextInt();
	        sc.nextLine();
	    } while (addMore == 1);
	}

	
	@Override
	public void showData() {
		// TODO Auto-generated method stub
		System.out.println(
				"----------------------------------------------DANH SÁCH HỌC SINH------------------------------------------");
		System.out.println(String.format(" %10s  ", "Mã số") + String.format("%13s  ", "Họ tên")
				+ String.format("%13s  ", "Ngày sinh") + String.format("%11s  ", "Lớp")
				+ String.format("%13s  ", "GVCN") + String.format("%15s  ", "Số ngày học"));
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < p.length; i++) {
			if (p[i] instanceof HocSinh) {
				System.out.println(String.format(" %10s  ", p[i].getId()) + String.format("%13s  ", p[i].getName())
						+ String.format("%13s  ", p[i].getNgaySinh())
						+ String.format("%11s  ", ((HocSinh) p[i]).getLop())
						+ String.format("%13s  ", ((HocSinh) p[i]).getGiaoVienCN())
						+ String.format("%15s  ", ((HocSinh) p[i]).getSoNgayHoc()));
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		HocSinh hs = new HocSinh();
		
		hs.addData();
		hs.showData();
		hs.export();
		hs.delData();
	}
	
	@Override
		public String toString() {
			return "Name: "+ this.name;
	}
	
	@Override
	public void export() throws IOException {
		try {
			writer = new BufferedWriter(new FileWriter("E:/student.txt"));
			for (int i = 0; i < p.length; i++) {
				if (p[i] instanceof HocSinh) {
					writer.write("name: " + p[i].name);
					writer.newLine();
				}
			}
			writer.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}	
	}

	@Override
	public void delData() {
		HocSinh hs = new HocSinh();
		hs.showData();
		System.out.println("nhập id hs muốn xóa");
		String chooseID = sc.nextLine();
		
		if (p[i].id == chooseID) {
			for(int j=i;j<p.length;j++) {
				p[j] = p[j+1];			
			}
		}	
	}
}
