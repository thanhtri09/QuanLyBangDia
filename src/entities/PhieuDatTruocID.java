package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PhieuDatTruocID implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "maKhachHang")
	private long maKhachHang;
	@Column(name = "maTuaDe")
	private long maTuaDe;

	public PhieuDatTruocID() {

	}

	public long getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(long maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public long getMaTuaDe() {
		return maTuaDe;
	}

	public void setMaTuaDe(long maTuaDe) {
		this.maTuaDe = maTuaDe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (maKhachHang ^ (maKhachHang >>> 32));
		result = prime * result + (int) (maTuaDe ^ (maTuaDe >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhieuDatTruocID other = (PhieuDatTruocID) obj;
		if (maKhachHang != other.maKhachHang)
			return false;
		if (maTuaDe != other.maTuaDe)
			return false;
		return true;
	}

	
}
