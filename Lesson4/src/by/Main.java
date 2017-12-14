package by;

import java.util.Scanner;

public class Main {

	// ���� ������� �������
	public static int razM() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ������ �������!");
		int raz = scan.nextInt();
		return raz;
	}

	// �������� ������� � ������� �������� � ����� ��� �� �����
	public static int[] mass(int a) {
		int[] x = new int[a];

		for (int i = 0; i < x.length; i++) {
			x[i] = (int) (Math.random() * 101);
			System.out.print(x[i] + " ");
		}
		System.out.println();
		System.out.println();
		return x;
	}

	// ������� � ����� �� ����� ������ �������� �������
	public static void printChet(int[] x) {
		System.out.println("������ �������� �������:");
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				System.out.print(x[i] + " ");
			}
		}
		System.out.println();
		System.out.println();
	}

	// ������� � ����� �� ����� �������� �������� �������
	public static void printNChet(int[] x) {
		System.out.println("�������� �������� �������:");
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 != 0) {
				System.out.print(x[i] + " ");
			}
		}
		System.out.println();
		System.out.println();
	}

	// ������� � ����� �� ����� ����� �������� �������� ��������� �������
	public static void sumRaz(int[] x) {
		int sumr = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 != 0) {
				sumr = sumr - x[i];
			}
		}
		System.out.println("����� �������� �������� ���������: " + sumr);
		System.out.println();
	}

	// ������� �� ����� ���������� ������ � �������� ��������� �������
	public static void kol(int[] x) {
		int sumch = 0;
		int sumn = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				sumch = sumch + 1;
			} else {
				sumn = sumn + 1;
			}
		}
		System.out.println("����������� ������ ���������: " + sumch);
		System.out.println("����������� �������� ���������: " + sumn);
		System.out.println();
	}

	// ������� ������������ � ����������� ������ �������
	public static void maxMinC(int[] x) {
		int max = 0;
		int min = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				max = x[i];
				min = x[i];
				break;
			}
		}
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				if (x[i] > max) {
					max = x[i];
				}
				if (x[i] < min) {
					min = x[i];
				}
			}
		}
		System.out.println("������������ ������ �������: " + max);
		System.out.println("����������� ������ �������: " + min);
		System.out.println();
	}

	// ������� ������������ � ����������� �������� �������
	public static void maxMinN(int[] x) {
		int max = 0;
		int min = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 != 0) {
				max = x[i];
				min = x[i];
				break;
			}
		}
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 != 0) {
				if (x[i] > max) {
					max = x[i];
				}
				if (x[i] < min) {
					min = x[i];
				}
			}
		}
		System.out.println("������������ �������� �������: " + max);
		System.out.println("����������� �������� �������: " + min);
		System.out.println();
	}

	// �������� �� ������� ��������� ������� 3
	public static void del(int[] x) {
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 3 == 0) {
				x[i] = (Integer) null;
			}
			System.out.print(x[i] + " ");
			System.out.println();
		}
	}

	// �������� � ����� �� ����� ������� � ��
	public static void fi() {
		char[] x = { '�', '�', '�', '�', '�', '�', '�', '�', '�', ' ', '�', '�', '�', '�', '�', '�', '�', '�', '�' };
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]);
		}
		System.out.println();
	}

	// ���� �� � ���������� � ����� ��� �� �����
	public static char[] fi2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ������ � ���");
		String fi = scan.nextLine();
		int n = fi.length();
		char[] x = new char[n];
		for (int i = 0; i < x.length; i++) {
			x[i] = fi.charAt(i);
			System.out.print(x[i]);
		}
		System.out.println();
		return x;
	}

	// ���������� ������� � ��������
	public static void fio(char[] x) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ��������");
		String o = scan.nextLine();
		// System.out.print(o);
		int n = x.length + o.length() + 1;
		char[] y = new char[n];
		y[x.length] = ' ';
		for (int q = 0; q < x.length; q++) {
			y[q] = x[q];
		}
		for (int j = 0; j < o.length(); j++) {
			y[j + x.length + 1] = o.charAt(j);
		}
		for (int i = 0; i < n; i++) {
			System.out.print(y[i]);
		}
	}

	// ����� �� ����� ��������� �� ���������
	public static void diapaz(int[] x) {
		System.out.println("�������� �� ��������� �� 20 �� 40");
		for (int i = 0; i < x.length; i++) {
			if (x[i] > 20 && x[i] < 40) {
				System.out.print(x[i] + " ");
			}
		}
		System.out.println();
	}

	// ���������� ���������
	public static void sortP(int[] x) {
		int m = 0;
		for (int i = x.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (x[j] > x[j + 1]) {
					m = x[j + 1];
					x[j + 1] = x[j];
					x[j] = m;
				}
			}
		}
		System.out.println("������������� ������ �� ����������� ���������");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		System.out.println();
	}

	// ���������� ��������
	public static void sortV(int[] x) {
		int m = 0;
		for (int i = 1; i < x.length; i++) {
			for (int j = i; j > 0; j--) {
				if (x[j - 1] > x[j]) {
					m = x[j - 1];
					x[j - 1] = x[j];
					x[j] = m;
				}
			}
		}
		System.out.println("������������� ������ �� ����������� ��������");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = razM();
		int[] x = mass(n);
		printChet(x);
		printNChet(x);
		sumRaz(x);
		kol(x);
		maxMinC(x);
		maxMinN(x);
		diapaz(x);
		sortP(x);
		sortV(x);
		fi();
		char[] fi = fi2();
		fio(fi);

	}

}
