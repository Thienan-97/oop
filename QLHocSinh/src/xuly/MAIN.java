package xuly;

import qlhocsinh.Person;

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
//			case 3:
//				truong.showDataGiaoVien();
//				break;
//			case 4:
//				truong.addPerson();
//				break;
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
		System.out.println("\t1. ThĂªm há»�c sinh");
		System.out.println("\t2. Xuáº¥t danh sĂ¡ch xáº¿p loáº¡i há»�c sinh");
		System.out.println("\t3. Xuáº¥t danh sĂ¡ch giĂ¡o viĂªn");
		System.out.println("\t4. ThĂªm há»�c sinh");
//        System.out.println("\t5. TĂ­nh vĂ  xuáº¥t tá»•ng lÆ°Æ¡ng cho toĂ n cĂ´ng ty");
//        System.out.println("\t6. TĂ¬m NhĂ¢n viĂªn thÆ°á»�ng cĂ³ lÆ°Æ¡ng cao nháº¥t");
//        System.out.println("\t7. TĂ¬m TrÆ°á»Ÿng PhĂ²ng cĂ³ sá»‘ lÆ°á»£ng nhĂ¢n viĂªn dÆ°á»›i quyá»�n nhiá»�u nháº¥t");
//        System.out.println("\t8. Sáº¯p xáº¿p nhĂ¢n viĂªn toĂ n cĂ´ng ty theo thá»© tá»± abc");
//        System.out.println("\t9. Sáº¯p xáº¿p nhĂ¢n viĂªn toĂ n cĂ´ng ty theo thá»© tá»± lÆ°Æ¡ng giáº£m dáº§n");
//        System.out.println("\t10. TĂ¬m GiĂ¡m Ä�á»‘c cĂ³ sá»‘ lÆ°á»£ng cá»• pháº§n nhiá»�u nháº¥t");
//        System.out.println("\t11. TĂ­nh vĂ  Xuáº¥t tá»•ng THU NHáº¬P cá»§a tá»«ng GiĂ¡m Ä�á»‘c");
		System.out.println("\t0. ThoĂ¡t.");
		System.out.print("Lá»±a chá»�n: ");
		return Integer.parseInt(sc.nextLine());
	}

}
