package com.cybersoft.xuly;

import java.util.ArrayList;
import java.util.Scanner;

import com.cybersoft.quanlynhansu.CongTy;
import com.cybersoft.quanlynhansu.GiamDoc;
import com.cybersoft.quanlynhansu.NhanSu;
import com.cybersoft.quanlynhansu.NhanVien;
import com.cybersoft.quanlynhansu.TruongPhong;

public class MAIN {
	public static void main(String[] args) {
		
		String bienNull = null;

        System.out.println("".equals(bienNull));

        Scanner scanner = new Scanner(System.in);
        CongTy congTy = new CongTy("Cyber Group", "CG", "0286236876", 1000000000);
        themDummyData(congTy);

        congTy.xuatThongTin();
        System.out.println();

        int luaChon;
        /*
		 * Menu quản lý nhân sự
         */
        do {
            luaChon = inMenu(scanner);

            switch (luaChon) {
                case 1:
                    congTy.nhapThongTin(scanner);
                    break;
                case 2:
                    congTy.phanBoNhanVien(scanner);
                    break;
                case 3:

                    break;
                case 4:
                    congTy.xuatThongTin();
                    break;
                case 5:
                    System.out.println("Tổng lương: " + congTy.tinhTongLuong());
                    break;
                case 6:
                    System.out.println("Nhân viên có lương cao nhất:");

                    NhanSu nhanVien = congTy.timNhanVienLuongCaoNhat();
                    nhanVien.xuatThongTin();

                    nhanVien.setMaSo("XXXXXXX");

                    break;
                case 7:
                    System.out.println("Trưởng phòng có số lượng nhân viên dưới quyền nhiều nhất:");
                    NhanSu truongPhong = congTy.timTruongPhongQuanLyNhieuNhat();
                    if (truongPhong != null) {
                        truongPhong.xuatThongTin();
                    }
                    break;
                case 8:
                    congTy.sapXepTheoTen();
                    System.out.println("SAU KHI SẮP XẾP LÀ: ");
                    congTy.xuatThongTin();
                    break;
                case 9:
                    congTy.sapXepTheoLuong();
                    System.out.println("SAU KHI SẮP XẾP LÀ: ");
                    congTy.xuatThongTin();
                    break;
                case 10:
                    System.out.println("Giám đốc có số cổ phần nhiều nhất:");
                    NhanSu giamDoc = congTy.timGiamDocCoPhanNhieuNhat();
                    giamDoc.xuatThongTin();
                    break;
                case 11:
                	congTy.timThuThap();

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
        System.out.println(String.format("%" + spaceNum + "s", "") + "QUẢN LÝ NHÂN SỰ" + String.format("%" + spaceNum + "s", ""));
        System.out.println("Menu:");
        System.out.println("\t1. Nhập thông tin công ty");
        System.out.println("\t2. Phân bổ Nhân viên vào Trưởng phòng");
        System.out.println("\t3. Thêm, xóa thông tin một nhân sự");
        System.out.println("\t4. Xuất ra thông tin toàn bộ người trong công ty");
        System.out.println("\t5. Tính và xuất tổng lương cho toàn công ty");
        System.out.println("\t6. Tìm Nhân viên thường có lương cao nhất");
        System.out.println("\t7. Tìm Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất");
        System.out.println("\t8. Sắp xếp nhân viên toàn công ty theo thứ tự abc");
        System.out.println("\t9. Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần");
        System.out.println("\t10. Tìm Giám Đốc có số lượng cổ phần nhiều nhất");
        System.out.println("\t11. Tính và Xuất tổng THU NHẬP của từng Giám Đốc");
        System.out.println("\t0. Thoát.");
        System.out.print("Lựa chọn: ");
        return Integer.parseInt(sc.nextLine());
    }

    static void themDummyData(CongTy cty) {
        cty.themNhanSu(new NhanVien("", "Tuấn", "0369296613", 25, 100));
        cty.themNhanSu(new NhanVien("", "Lâm", "0369296614", 21, 100));
        cty.themNhanSu(new NhanVien("", "Trần", "0369296615", 26, 100));
        cty.themNhanSu(new NhanVien("", "Khang", "0369296213", 21, 100));
        cty.themNhanSu(new NhanVien("", "An", "0369296663", 20, 100));
        cty.themNhanSu(new NhanVien("", "Khánh", "0369766613", 22, 100));
        cty.themNhanSu(new NhanVien("", "Phong", "0369216613", 22, 100));
        cty.themNhanSu(new NhanVien("", "Thanh", "0369896613", 22, 100));
        cty.themNhanSu(new NhanVien("", "Chí", "0369200613", 22, 100));
        cty.themNhanSu(new NhanVien("", "Tuấn", "0369226613", 22, 100));
        cty.themNhanSu(new NhanVien("", "Trí", "0369296513", 22, 100));

        cty.themNhanSu(new TruongPhong("", "Lee", "0909001002", 20, 200, 0));
        cty.themNhanSu(new TruongPhong("", "Anh", "0909001003", 20, 200, 0));
        cty.themNhanSu(new TruongPhong("", "Tú", "0909001004", 20, 200, 0));

        cty.themNhanSu(new GiamDoc("", "Vượng", "0900000001", 15, 300, 75));
        cty.themNhanSu(new GiamDoc("", "Khoa", "0900000002", 17, 500, 90));
    }
}
