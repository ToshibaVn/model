package model;

public class TamGiac extends DaGiac {

	public TamGiac() {
		super();
	}

	public TamGiac(int a, int b, int c) {
		super(a, b, c);
	}

	public TamGiac(int a, int b) {
		super(a, b);
	}

	public TamGiac(int a) {
		super(a);
	}
@Override
public double TinhDienTich() {
	double p=(this.getA()+this.getB()+this.getC())/2;
	return Math.sqrt( p*(p-this.getA())*(p-this.getB())*(p-this.getC()));
}
@Override
public double TinhChuVi() {
	return this.getA()+this.getB()+this.getC();
}
}
