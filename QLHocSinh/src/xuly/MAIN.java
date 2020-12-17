package xuly;

import qlhocsinh.Person;

import java.io.IOException;
import java.util.Scanner;

import qlhocsinh.HocSinh;
//import qlhocsinh.TruongHoc;

public class MAIN {
	static Scanner sc = new Scanner(System.in);
//	TruongHoc truong = new TruongHoc();
	static int i = 0;
	static Person[] p = new HocSinh[100];
//	truong.dataList();
	public static void main(String[] args) {
		HocSinh hs = new HocSinh();
		int luaChon;
		/*
		 * Menu quáº£n lĂ½ nhĂ¢n sá»±
		 */
		do {
			luaChon = inMenu(sc);

			switch (luaChon) {
			case 1:
				
				hs.addData();
				break;
			case 2:
				hs.showData();
				break;
			case 3:
				hs.delData();
				break;
			case 4:
				try {
					hs.export();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 0:
				System.out.println("Káº¿t thĂºc chÆ°Æ¡ng trĂ¬nh.");
				break;
			default:
				System.out.println("Lá»±a chá»�n khĂ´ng há»£p lá»‡.");
				break;
			}
			sc.nextLine();
		} while (luaChon != 0);
	}

//	PhÆ°Æ¡ng thá»©c static
	static int inMenu(Scanner sc) {
		int spaceNum = 20;
		System.out.println(
				String.format("%" + spaceNum + "s", "") + "QUáº¢N LĂ� Há»ŒC SINH" + String.format("%" + spaceNum + "s", ""));
		System.out.println("Menu:");
		System.out.println("\t1. Thêm học sinh");
		System.out.println("\t2. Xuất danh sách xếp loại họcc sinh");
		System.out.println("\t3. xóa học sinh");
		System.out.println("\t4. in học sinh");
//        System.out.println("\t5. TĂ­nh vĂ  xuáº¥t tá»•ng lÆ°Æ¡ng cho toĂ n cĂ´ng ty");
//        System.out.println("\t6. TĂ¬m NhĂ¢n viĂªn thÆ°á»�ng cĂ³ lÆ°Æ¡ng cao nháº¥t");
//        System.out.println("\t7. TĂ¬m TrÆ°á»Ÿng PhĂ²ng cĂ³ sá»‘ lÆ°á»£ng nhĂ¢n viĂªn dÆ°á»›i quyá»�n nhiá»�u nháº¥t");
//        System.out.println("\t8. Sáº¯p xáº¿p nhĂ¢n viĂªn toĂ n cĂ´ng ty theo thá»© tá»± abc");
//        System.out.println("\t9. Sáº¯p xáº¿p nhĂ¢n viĂªn toĂ n cĂ´ng ty theo thá»© tá»± lÆ°Æ¡ng giáº£m dáº§n");
//        System.out.println("\t10. TĂ¬m GiĂ¡m Ä�á»‘c cĂ³ sá»‘ lÆ°á»£ng cá»• pháº§n nhiá»�u nháº¥t");
//        System.out.println("\t11. TĂ­nh vĂ  Xuáº¥t tá»•ng THU NHáº¬P cá»§a tá»«ng GiĂ¡m Ä�á»‘c");
		System.out.println("\t0. Thoát");
		System.out.print("Lá»±a chá»�n: ");
		return Integer.parseInt(sc.nextLine());
	}
	


}
