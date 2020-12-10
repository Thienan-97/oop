/*package qlhocsinh;

import java.util.Scanner;

public class TruongHoc {
//	private int soLuong;
	private Person p[] = new Person[4];

//	Biáº¿n static 
	static Scanner sc = new Scanner(System.in);

//	táº¡o sáºµn máº£ng dá»¯ liá»‡u
	public void dataList() {
//		HocSinh hs1 = new HocSinh("01", "An", "20/11", 6, "Tuáº¥n", 25, 9, 4, 6, 4);
//		HocSinh hs2 = new HocSinh("02", "Ă‚n", "9/7", 9, "DÆ°Æ¡ng", 23, 8, 6, 7, 4);
//		GiaoVien gv1 = new GiaoVien("T01", "Tuáº¥n", "11/11", "ToĂ¡n", 6, 60, 20);
//		GiaoVien gv2 = new GiaoVien("A01", "DÆ°Æ¡ng", "18/12", "Anh", 9, 60, 22);
//
//		p[0] = hs1;
//		p[1] = hs2;
//		p[2] = gv1;
//		p[3] = gv2;
	}

//	ThĂªm n pháº§n tá»­ vĂ o máº£ng
//	public void addPerson() {
//		String id, hoTen, ngaySinh, giaoVienCN;
//		float soNgayHoc, soNgayLam, hocPhiMotBuoi, luongMotNgay, diemToan, diemVan, diemAnh;
//		int lop, lopChuNhiem, hanhKiem;
//		System.out.println("Nháº­p n: ");
//		int n = Integer.parseInt(sc.nextLine());
//		if (n < p.length) {
//			System.out.println("Nháº­p láº¡i n: ");
//			n = Integer.parseInt(sc.nextLine());
//		}
//		Person[] pNew = arrayLengthChange(p, n);
//		int luaChon = menuAddPerson(sc);

	static void addStud(Person[] p) {
	   
		int lop;
		String giaoVienCN;
		float hocPhiMotBuoi;
		float soNgayHoc;
		float diemToan, diemVan, diemAnh;
		int hanhKiem;
	    int addMore;

	    do {
	        stud[i] = new Student(numID, year, userName, course);
	        ++i;

	        System.out.println("To add another Student Record Press 1");
	        addMore = sc.nextInt();
	    } while (addMore == 1);

	    }

	switch(luaChon)

	{
		case 1:
//			for (int i = p.length; i < pNew.length; i++) {
////				nháº­p thĂ´ng tin
//				System.out.print("Nháº­p id: ");
//				id = sc.nextLine();
//				System.out.print("Nháº­p há»� tĂªn: ");
//				hoTen = sc.nextLine();
//				System.out.print("Nháº­p ngĂ y sinh: ");
//				ngaySinh = sc.nextLine();
//				System.out.print("Lá»›p: ");
//				lop = Integer.parseInt(sc.nextLine());
//				System.out.print("Nháº­p giĂ¡o viĂªn chá»§ nhiá»‡m: ");
//				giaoVienCN = sc.nextLine();
//				System.out.print("Há»�c phĂ­ má»™t buá»•i: ");
//				hocPhiMotBuoi = Float.parseFloat(sc.nextLine());
//				System.out.print("Sá»‘ ngĂ y há»�c: ");
//				soNgayHoc = Float.parseFloat(sc.nextLine());
//				System.out.print("Ä�iá»ƒm toĂ¡n: ");
//				diemToan = Float.parseFloat(sc.nextLine());
//				System.out.print("Ä�iá»ƒm anh: ");
//				diemAnh = Float.parseFloat(sc.nextLine());
//				System.out.print("Ä�iá»ƒm vÄƒn: ");
//				diemVan = Float.parseFloat(sc.nextLine());
//				System.out.print("Háº¡nh kiá»ƒm: ");
//				hanhKiem = Integer.parseInt(sc.nextLine());
//
////				lÆ°u thĂ´ng tin vĂ o pháº§n tá»­ cá»§a máº£ng
//				HocSinh hs = new HocSinh(id, hoTen, ngaySinh, lop, giaoVienCN, soNgayHoc, diemToan, diemVan, diemAnh,
//						hanhKiem);
//				pNew[i] = hs;
//			}
//			System.out.println(
//					"----------------------------------------------DANH SĂ�CH Há»ŒC SINH------------------------------------------");
//			System.out.println(String.format(" %10s  ", "MĂ£ sá»‘") + String.format("%13s  ", "Há»� tĂªn")
//					+ String.format("%13s  ", "NgĂ y sinh") + String.format("%11s  ", "Lá»›p")
//					+ String.format("%13s  ", "GVCN") + String.format("%15s  ", "Sá»‘ ngĂ y há»�c"));
//			System.out.println(
//					"----------------------------------------------------------------------------------------------------------");
//			for (int i = 0; i < pNew.length; i++) {
//				if (pNew[i] instanceof HocSinh) {
//					System.out.println(
//							String.format(" %10s  ", pNew[i].getId()) + String.format("%13s  ", pNew[i].getName())
//									+ String.format("%13s  ", pNew[i].getNgaySinh())
//									+ String.format("%11s  ", ((HocSinh) pNew[i]).getLop())
//									+ String.format("%13s  ", ((HocSinh) pNew[i]).getGiaoVienCN())
//									+ String.format("%15s  ", ((HocSinh) pNew[i]).getSoNgayHoc()));
//				}
//			}
			
			break;
		case 0:
			System.out.println("Káº¿t thĂºc chÆ°Æ¡ng trĂ¬nh.");
			break;
		default:
			System.out.println("Lá»±a chá»�n khĂ´ng há»£p lá»‡.");
			break;
		}
	}

//		for (int i = p.length; i < pNew.length; i++) {
//			if (p[i] instanceof HocSinh) {
//				System.out.println(String.format(" %10s  ", pNew[i].getId())
//						+ String.format("%13s  ", pNew[i].getName()) + String.format("%13s  ", pNew[i].getNgaySinh())
//						+ String.format("%11s  ", ((HocSinh) pNew[i]).getLop())
//						+ String.format("%13s  ", ((HocSinh) pNew[i]).getGiaoVienCN())
//						+ String.format("%15s  ", ((HocSinh) pNew[i]).getSoNgayHoc())));
//			} else if (pNew[i] instanceof GiaoVien) {
//				System.out.println(String.format(" %10s  ", pNew[i].getId())
//						+ String.format("%13s  ", pNew[i].getName()) + String.format("%13s  ", pNew[i].getNgaySinh())
//						+ String.format("%11s  ", ((GiaoVien) pNew[i]).getMon())
//						+ String.format("%13s  ", ((GiaoVien) pNew[i]).getLopChuNhiem())
//						+ String.format("%13s  ", ((GiaoVien) pNew[i]).getLuongMotNgay())
//						+ String.format("%15s  ", ((GiaoVien) pNew[i]).getSoNgayCong())
//						+ String.format("%13s  ", ((GiaoVien) pNew[i]).tinhLuong()));
//			}
//		}

//	menu lá»±a chá»�n thĂªm há»�c sinh hay giĂ¡o viĂªn
//	static int menuAddPerson(Scanner sc) {
//		int spaceNum = 20;
//		System.out.println(
//				String.format("%" + spaceNum + "s", "") + "QUáº¢N LĂ� NHĂ‚N Sá»°" + String.format("%" + spaceNum + "s", ""));
//		System.out.println("Menu:");
//		System.out.println("\t1. ThĂªm há»�c sinh");
//		System.out.println("\t2. ThĂªm giĂ¡o viĂªn");
//		System.out.println("\t0. ThoĂ¡t.");
//		System.out.print("Lá»±a chá»�n: ");
//		return Integer.parseInt(sc.nextLine());
//	}
//
////	thay Ä‘á»•i kĂ­ch thÆ°á»›c máº£ng
//	static Person[] arrayLengthChange(Person[] arr, int newLength) {
//		Person[] arrNew = new Person[newLength];
//		System.arraycopy(arr, 0, arrNew, 0, arr.length);
//		return arrNew;
//	}

//	1. xuáº¥t danh sĂ¡ch há»�c sinh
//	public void showDataHocSinh() {
//		System.out.println(
//				"----------------------------------------------DANH SĂ�CH Há»ŒC SINH------------------------------------------");
//		System.out.println(String.format(" %10s  ", "MĂ£ sá»‘") + String.format("%13s  ", "Há»� tĂªn")
//				+ String.format("%13s  ", "NgĂ y sinh") + String.format("%11s  ", "Lá»›p")
//				+ String.format("%13s  ", "GVCN") + String.format("%15s  ", "Sá»‘ ngĂ y há»�c"));
//		System.out.println(
//				"----------------------------------------------------------------------------------------------------------");
//		for (int i = 0; i < p.length; i++) {
//			if (p[i] instanceof HocSinh) {
//				System.out.println(String.format(" %10s  ", p[i].getId()) + String.format("%13s  ", p[i].getName())
//						+ String.format("%13s  ", p[i].getNgaySinh())
//						+ String.format("%11s  ", ((HocSinh) p[i]).getLop())
//						+ String.format("%13s  ", ((HocSinh) p[i]).getGiaoVienCN())
//						+ String.format("%15s  ", ((HocSinh) p[i]).getSoNgayHoc()));
//			}
//		}
//	}

//	2. xuáº¥t danh sĂ¡ch xáº¿p loáº¡i há»�c sinh
	public void showDataDiemVaXepLoai() {
		System.out.println(
				"-----------------------------------------------------------------DANH SĂ�CH Há»ŒC SINH------------------------------------------------------");
		System.out.println(
				String.format(" %10s  ", "MĂ£ sá»‘") + String.format("%13s  ", "Há»� tĂªn") + String.format("%13s  ", "Lá»›p")
						+ String.format("%13s  ", "Ä�iá»ƒm toĂ¡n") + String.format("%13s  ", "Ä�iá»ƒm VÄƒn")
						+ String.format("%13s  ", "Ä�iá»ƒm anh") + String.format("%13s  ", "Háº¡nh kiá»ƒm")
						+ String.format("%13s  ", "Ä�iá»ƒm trung bĂ¬nh") + String.format("%15s  ", "Xáº¿p loáº¡i"));
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < p.length; i++) {
			if (p[i] instanceof HocSinh) {
				System.out.println(String.format(" %10s  ", p[i].getId()) + String.format("%13s  ", p[i].getName())
						+ String.format("%13s  ", ((HocSinh) p[i]).getLop())
						+ String.format("%13s  ", ((HocSinh) p[i]).getDiemToan())
						+ String.format("%13s  ", ((HocSinh) p[i]).getDiemVan())
						+ String.format("%13s  ", ((HocSinh) p[i]).getDiemAnh())
						+ String.format("%13s  ", ((HocSinh) p[i]).getHanhKiem())
						+ String.format("%15s  ", ((HocSinh) p[i]).tinhDiemTrungBinh())
						+ String.format("%15s  ", ((HocSinh) p[i]).xepLoaiHocSinh()));
			}
		}
	}

//	3. xuáº¥t danh sĂ¡ch giĂ¡o viĂªn
//	public void showDataGiaoVien() {
//		System.out.println(
//				"---------------------------------------------------DANH SĂ�CH GIĂ�O VIĂ�N-----------------------------------------------");
//		System.out.println(String.format(" %10s  ", "MĂ£ sá»‘") + String.format("%13s  ", "Há»� tĂªn")
//				+ String.format("%13s  ", "NgĂ y sinh") + String.format("%11s  ", "MĂ´n")
//				+ String.format("%13s  ", "Lá»›p CN") + String.format("%13s  ", "LÆ°Æ¡ng 1 buá»•i")
//				+ String.format("%15s  ", "Sá»‘ ngĂ y cĂ´ng") + String.format("%13s  ", "LÆ°Æ¡ng"));
//		System.out.println(
//				"---------------------------------------------------------------------------------------------------------------------");
//		for (int i = 0; i < p.length; i++) {
//			if (p[i] instanceof GiaoVien) {
//				System.out.println(String.format(" %10s  ", p[i].getId()) + String.format("%13s  ", p[i].getName())
//						+ String.format("%13s  ", p[i].getNgaySinh())
//						+ String.format("%11s  ", ((GiaoVien) p[i]).getMon())
//						+ String.format("%13s  ", ((GiaoVien) p[i]).getLopChuNhiem())
//						+ String.format("%13s  ", ((GiaoVien) p[i]).getLuongMotNgay())
//						+ String.format("%15s  ", ((GiaoVien) p[i]).getSoNgayCong())
//						+ String.format("%13s  ", ((GiaoVien) p[i]).tinhLuong()));
//			}
//		}
//	}

//	4. ThĂªm má»›i 1 há»�c sinh
//	public void addHosSinh(Person p) {
//
//	}

}
*/