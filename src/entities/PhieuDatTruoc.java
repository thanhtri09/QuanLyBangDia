package entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity(name = "PhieuDatTruoc")
public class PhieuDatTruoc implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private PhieuDatTruocID ma = new PhieuDatTruocID();
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("maKhachHang")
	@JoinColumn(name = "maKhachHang")
	private KhachHang khachHang;
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("maTuaDe")
	@JoinColumn(name = "maTuaDe")
	private TuaDe tuaDe;
	private boolean trangThai;

	public PhieuDatTruoc() {
		super();
	}

	public PhieuDatTruoc(KhachHang khachHang, TuaDe tuaDe, boolean trangThai) {
		super();
		this.khachHang = khachHang;
		this.tuaDe = tuaDe;
		this.trangThai = trangThai;
	}

	public PhieuDatTruocID getMa() {
		return ma;
	}

	public void setMa(PhieuDatTruocID ma) {
		this.ma = ma;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public TuaDe getTuaDe() {
		return tuaDe;
	}

	public void setTuaDe(TuaDe tuaDe) {
		this.tuaDe = tuaDe;
	}

	public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

	@Override
	public String toString() {
		return "PhieuDatTruoc [ma=" + ma + ", khachHang=" + khachHang + ", tuaDe=" + tuaDe + ", trangThai=" + trangThai
				+ "]";
	}

}
