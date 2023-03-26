package baiTap1;

public class ChuyenNoiThanh extends ChuyenXe {
	private int soTuyen, soKm;

	public ChuyenNoiThanh(String maSo, String tenTaiXe, double doanhThu, int soTuyen, int soKm) {
		super(maSo, tenTaiXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKm = soKm;
	}
	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public int getSoKm() {
		return soKm;
	}

	public void setSoKm(int soKm) {
		this.soKm = soKm;
	}
	@Override
	public String toString() {
		return super.toString()+ "ChuyenNoiThanh [soTuyen=" + soTuyen + ", soKm=" + soKm + "]";
	}
}
