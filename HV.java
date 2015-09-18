package model;

public class HV extends DaGiac  {

	public HV(int a) {
		super(a);
	}
	@Override
	public double TinhDienTich() {
		return this.getA()*this.getA();
	}
	@Override
	public double TinhChuVi() {
		return this.getA()*4;
	}

	

}
