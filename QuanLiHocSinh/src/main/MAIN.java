package main;

import java.io.IOException;
import java.util.Scanner;
import GiaoVien.*;
import qlhocsinh.*;
import HocSinh.*;

public class MAIN {
	public static void main(String[] args) {
		int luaChon;
		Scanner scanner = new Scanner(System.in);
		DsHocSinh hs = new DsHocSinh();
		DsGiaoVien gv = new DsGiaoVien();
		/*
		 * Menu quản lý nhân sự
		 */
		do {
			luaChon = inMenu(scanner);

			switch (luaChon) {
			case 1:
				hs.insert();
				break;
			case 2:
				hs.add();
				break;
			case 3:
				hs.delete();
				break;
			case 4:
				hs.update();
				break;
			case 5:
				hs.showData();
				break;
			case 6:
				hs.search();
				break;
			case 7:
				gv.insert();
				break;
			
			case 8:
				gv.add();
				break;
			case 9:
				gv.delete();
				break;
			case 10:

				break;
			case 11:
				gv.showData();
				break;
			case 12:
				try {
					hs.impData();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 13:
				try {
					hs.expData();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 14:
				try {
					gv.export();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 0:
				System.out.println("Kết thúc chương trình.");
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ.");
				break;
			}
			scanner.nextLine();
		} while (luaChon != 0);

	}

	static int inMenu(Scanner sc) {
		int spaceNum = 20;
		System.out.println(
				String.format("%" + spaceNum + "s", "") + "QUẢN LÝ HỌC SINH" + String.format("%" + spaceNum + "s", ""));
		System.out.println("Menu:");
		System.out.println("\t1. Nhập danh sách học sinh");
		System.out.println("\t2. Thêm học sinh");
		System.out.println("\t3. Xóa học sinh");
		System.out.println("\t4. Chỉnh sửa thông tin học sinh");
		System.out.println("\t5. Xuất danh sách học sinh");
		System.out.println("\t6. Tìm học sinh");
		System.out.println("\t7. Nhập danh sách giáo viên");
		System.out.println("\t8. Thêm giáo viên");
		System.out.println("\t9. Xóa giáo viên");
		System.out.println("\t10. Chỉnh sửa thông tin giáo viên");
		System.out.println("\t11. Xuất danh sách giáo viên");
		System.out.println("\t12. nhập danh sách");
		System.out.println("\t13. Export danh sách học sinh");
		System.out.println("\t14. Export danh sách giáo viên");
		System.out.println("\t0. Thoát.");
		System.out.print("Lựa chọn: ");
		return Integer.parseInt(sc.nextLine());
	}
}
