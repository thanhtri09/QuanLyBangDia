package entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "Dia")
public class Dia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long maDia;
	private TrangThaiDia trangThai;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maTieuDe")
	private TuaDe tuaDe;
	@OneToMany(mappedBy = "hoaDon", cascade = CascadeType.ALL)
	private Set<ChiTietHoaDon> dsChiTietHoaHon = new HashSet<ChiTietHoaDon>();

	public Dia() {
		super();
	}

	public Dia(TrangThaiDia trangThai, TuaDe tieuDe) {
		super();
		this.trangThai = trangThai;
		this.tuaDe = tieuDe;
	}

	public long getMaDia() {
		return maDia;
	}

	public void setMaDia(long maDia) {
		this.maDia = maDia;
	}

	public TrangThaiDia getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(TrangThaiDia trangThai) {
		this.trangThai = trangThai;
	}

	public TuaDe getTieuDe() {
		return tuaDe;
	}

	public void setTieuDe(TuaDe tieuDe) {
		this.tuaDe = tieuDe;
	}
	
	public Set<ChiTietHoaDon> getDsChiTietHoaHon() {
		return dsChiTietHoaHon;
	}

	public void setDsChiTietHoaHon(Set<ChiTietHoaDon> dsChiTietHoaHon) {
		this.dsChiTietHoaHon = dsChiTietHoaHon;
	}

	@Override
	public String toString() {
		return "Dia [maDia=" + maDia + ", trangThai=" + trangThai + ", tieuDe=" + tuaDe + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (maDia ^ (maDia >>> 32));
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
		Dia other = (Dia) obj;
		if (maDia != other.maDia)
			return false;
		return true;
	}

}
