package qlhocsinh;

import java.io.IOException;
import java.util.Scanner;

public class GiaoVien extends Person {
	private String mon;
	private int lopChuNhiem;
	private float luongMotNgay;
	private float soNgayCong;
	
	
//	constructor
	public GiaoVien(String id, String name, String ngaySinh, String mon, int lopChuNhiem, float luongMotNgay,
			float soNgayCong) {
		super(id, name, ngaySinh);
		this.mon = mon;
		this.lopChuNhiem = lopChuNhiem;
		this.luongMotNgay = luongMotNgay;
		this.soNgayCong = soNgayCong;
	}
	
	public GiaoVien() {
		super();
		this.mon = "";
	}
	
//	get & set
	public String getMon() {
		return mon;
	}

	public void setMon(String mon) {
		this.mon = mon;
	}

	public int getLopChuNhiem() {
		return lopChuNhiem;
	}

	public void setLopChuNhiem(int lopChuNhiem) {
		this.lopChuNhiem = lopChuNhiem;
	}

	public float getLuongMotNgay() {
		return luongMotNgay;
	}

	public void setLuongMotNgay(float luongMotNgay) {
		this.luongMotNgay = luongMotNgay;
	}

	public float getSoNgayCong() {
		return soNgayCong;
	}

	public void setSoNgayCong(float soNgayCong) {
		this.soNgayCong = soNgayCong;
	}

//	method
	public double tinhLuong() {
		return luongMotNgay * soNgayCong;
	}
	
	static Scanner sc = new Scanner(System.in);
	
	void nhapThongTin(Person[] p) {
		// TODO Auto-generated method stub
		System.out.print("Nháº­p id: ");
		id = sc.nextLine();
		System.out.print("Nháº­p há»� tĂªn: ");
		name = sc.nextLine();
		System.out.print("Nháº­p ngĂ y sinh: ");
		ngaySinh = sc.nextLine();
		System.out.print("MĂ´n: ");
		mon = sc.nextLine();
		System.out.print("Lá»›p chá»§ nhiá»‡m: ");
		lopChuNhiem = Integer.parseInt(sc.nextLine());
		System.out.print("LÆ°Æ¡ng má»™t ngĂ y: ");
		luongMotNgay = Float.parseFloat(sc.nextLine());
		System.out.print("Sá»‘ ngĂ y cĂ´ng: ");
		soNgayCong = Float.parseFloat(sc.nextLine());
	}

	protected Person[] p = new Person[100];
	@Override
	public void showData() {
		// TODO Auto-generated method stub
		System.out.println(
				"---------------------------------------------------DANH SĂ�CH GIĂ�O VIĂ�N-----------------------------------------------");
		System.out.println(String.format(" %10s  ", "MĂ£ sá»‘") + String.format("%13s  ", "Há»� tĂªn")
				+ String.format("%13s  ", "NgĂ y sinh") + String.format("%11s  ", "MĂ´n")
				+ String.format("%13s  ", "Lá»›p CN") + String.format("%13s  ", "LÆ°Æ¡ng 1 buá»•i")
				+ String.format("%15s  ", "Sá»‘ ngĂ y cĂ´ng") + String.format("%13s  ", "LÆ°Æ¡ng"));
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < p.length; i++) {
			if (p[i] instanceof GiaoVien) {
				System.out.println(String.format(" %10s  ", p[i].getId()) + String.format("%13s  ", p[i].getName())
						+ String.format("%13s  ", p[i].getNgaySinh())
						+ String.format("%11s  ", ((GiaoVien) p[i]).getMon())
						+ String.format("%13s  ", ((GiaoVien) p[i]).getLopChuNhiem())
						+ String.format("%13s  ", ((GiaoVien) p[i]).getLuongMotNgay())
						+ String.format("%15s  ", ((GiaoVien) p[i]).getSoNgayCong())
						+ String.format("%13s  ", ((GiaoVien) p[i]).tinhLuong()));
			}
		}
	}

	@Override
	public void addData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void export() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imp() {
		// TODO Auto-generated method stub
		
	}
	
}
