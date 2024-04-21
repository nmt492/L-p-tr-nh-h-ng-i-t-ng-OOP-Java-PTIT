package test18_4_2022;

interface ITuLieu {
	// static method
	double getGia();

}

class TuLieu implements ITuLieu {
	private String ma; // tựa sách
	private String tenNhaXB;
	private double gia;
	private int soLuong;

	public TuLieu(String ma, String tenNhaXB, double gia, int soLuong) {
		super();
		this.ma = ma;
		this.tenNhaXB = tenNhaXB;
		this.gia = gia;
		this.soLuong = soLuong;
	}

	public TuLieu() {
		super();
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTenNhaXB() {
		return tenNhaXB;
	}

	public void setTenNhaXB(String tenNhaXB) {
		this.tenNhaXB = tenNhaXB;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

}

class SachHoc extends TuLieu {
	private String ten;
	private String tenTG;
	private int soTrang;

	public SachHoc(String ma, String tenNhaXB, double gia, int soLuong, String tenTG, int soTrang) {
		super(ma, tenNhaXB, gia, soLuong);
		this.ten = ten;
		this.tenTG = tenTG;
		this.soTrang = soTrang;
	}

	public SachHoc() {
		super();
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getTenTG() {
		return tenTG;
	}

	public void setTenTG(String tenTG) {
		this.tenTG = tenTG;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	// Phương thức tính giá cho Sách học
	@Override
	public double getGia() {
		double gia = getGia(); // Lấy giá từ lớp cha TuLieu
		if (soTrang <= 300) {
			gia *= 0.95;
		} else if (soTrang <= 500) {
			gia *= 0.9;
		} else {
			gia *= 0.85;
		}
		if (getSoLuong() > 500) {
			gia *= 0.9;
		}
		return Math.round(gia);
	}

}

class Bao extends TuLieu {
	private String ngay;
	private String ten;


	public Bao(String ma, String tenNhaXB, double gia, int soLuong, String ngay, String ten) {
		super(ma, tenNhaXB, gia, soLuong);
		this.ngay = ngay;
		this.ten = ten;
	}

	public Bao() {
		super();
	}

	public String getNgay() {
		return ngay;
	}

	public void setNgay(String ngay) {
		this.ngay = ngay;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

}

public class Main {
	public static void main(String[] args) {
		Bao b = new Bao();
		System.out.println(b);
		SachHoc s = new SachHoc();
		System.out.println(s);
	}
}