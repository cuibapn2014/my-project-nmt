package vn.edu.giadinh;
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}
	
	static void menu() {
		Scanner number = new Scanner(System.in);
		int n;
		double n0;
		boolean flag = true;
		System.out.println(" _____________________________________________");
		System.out.println("| Hay chon 1 trong nhung chuc nang duoi day:  |");
		System.out.println("| 1. Giai phuong trinh bac nhat               |");
		System.out.println("| 2. Giai phuong trinh bac hai                |");
		System.out.println("| 3. Tinh tien dien                           |");
		System.out.println("| 4. Exit                                     |");
		System.out.println("|                                             |");
		System.out.println("|_____________________________________________|");
		do{System.out.print("Chon chuc nang: ");
		n = number.nextInt();
		switch(n) {
			case 1:
				n0 = giaiPhTrinhB1();
				System.out.println("Nghiem cua phuong trinh: x = " + n0);break;
			case 2:
				giaiPhTrinhB2();break;
			case 3:
				n0 = tinhTien();
				System.out.println("So tien ban phai tra la: " + n0);break;
			case 4:
				flag = false;break;
			default:
				flag = false;break;
		}	
		}while(flag);
	}
	
	static double giaiPhTrinhB1() {
		double a, b;
		Scanner number = new Scanner(System.in);
		System.out.println("Chuong trinh giai phuong trinh bac 1");
		System.out.println("Vui long nhap vao day 2 so a va b: ");
		System.out.print("a = ");
		a = number.nextDouble();
		System.out.print("b = ");
		b = number.nextDouble();
			return -b/a;
	}
	
	static void giaiPhTrinhB2() {
		double a, b, c, delta, n1, n2;
		Scanner number = new Scanner(System.in);
		System.out.println("Chuong trinh giai phuong trinh bac 2");
		System.out.println("Vui long nhap vao day 3 so a ,b va c: ");
		System.out.print("a = ");
		a = number.nextDouble();
		System.out.print("b = ");
		b = number.nextDouble();
		System.out.print("c = ");
		c = number.nextDouble();
		delta = b*b - 4*a*c;
		if(delta >= 0) {
			n1 = (-b + Math.sqrt(delta))/2*a;
			n2 = (-b - Math.sqrt(delta))/2*a;
			System.out.println("Phuong trinh co 2 nghiem phan biet:");
			System.out.println("x1 =" + n1 + ", x2 = " + n2);
		}else if(delta == 0) {
			n1 = (-b - Math.sqrt(delta))/2*a;
			System.out.println("Phuong trinh co nghiem kep: x = " + n1);
		}else {
			System.out.println("Phuong trinh vo nghiem");
	}
	}
	static int tinhTien() {
		int tien, soDien;
		Scanner number = new Scanner(System.in);
		do {
		System.out.println("Chuong trinh Tinh tien dien:");
		System.out.println("Hay nhap vao day so dien da tieu thu: ");
		soDien = number.nextInt();
		}while(soDien < 0);
			if(soDien < 50) {
				tien = soDien * 1000;
			}else {
				tien = 50 * 1000 + (soDien - 50) * 1200;
			}
		return tien;
	}

}

