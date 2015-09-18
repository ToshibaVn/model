package model;

public class DaGiac extends HinhHoc implements HinhHoc2 {

	
	private int a,b,c;

	public int getA() {
		return a;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public DaGiac() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DaGiac(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public DaGiac(int a) {
		super();
		this.a = a;
	}

	public DaGiac(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double TinhDienTich() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double TinhChuVi() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
