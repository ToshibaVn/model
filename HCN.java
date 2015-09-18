package model;

public class HCN extends DaGiac {

	

	public HCN(int a, int b) {
		super(a, b);
	}

	@Override
	public double TinhDienTich() {
		return this.getA()*this.getB();
	}
	@Override
	public double TinhChuVi() {
		return 2*(this.getA()+this.getB());
	}
	

	

}
