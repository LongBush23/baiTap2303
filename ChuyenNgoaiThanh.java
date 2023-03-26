package baiTap1;

public class ChuyenNgoaiThanh extends ChuyenXe {
	private String noiDen;
	private int soNgayDenDuoc;
	public ChuyenNgoaiThanh(String maSo, String tenTaiXe, double doanhThu, String noiDen, int soNgayDenDuoc) {
		super(maSo, tenTaiXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgayDenDuoc = soNgayDenDuoc;
	}
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public int getSoNgayDenDuoc() {
		return soNgayDenDuoc;
	}
	public void setSoNgayDenDuoc(int soNgayDenDuoc) {
		this.soNgayDenDuoc = soNgayDenDuoc;
	}
	@Override
	public String toString() {
		return super.toString()+ "ChuyenNgoaiThanh [noiDen=" + noiDen + ", soNgayDenDuoc=" + soNgayDenDuoc + "]";
	}

}
