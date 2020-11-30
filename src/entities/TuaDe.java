package entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "TuaDe")
public class TuaDe implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long maTieuDe;
	@Column(columnDefinition = "NVARCHAR(255)")
	private String tenTieuDe;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maLoaiDia")
	private LoaiDia loaiDia;
	@OneToMany(mappedBy = "tuaDe", cascade = CascadeType.ALL)
	private Set<Dia> dsDia = new HashSet<Dia>();
	@OneToMany(mappedBy = "tuaDe", cascade = CascadeType.ALL)
	private Set<PhieuDatTruoc> dsPhieuDatTruoc = new HashSet<PhieuDatTruoc>();

	public TuaDe() {
		super();
	}

	public TuaDe(String tenTieuDe, LoaiDia loaiDia) {
		super();
		this.tenTieuDe = tenTieuDe;
		this.loaiDia = loaiDia;
	}

	public long getMaTieuDe() {
		return maTieuDe;
	}

	public void setMaTieuDe(long maTieuDe) {
		this.maTieuDe = maTieuDe;
	}

	public String getTenTieuDe() {
		return tenTieuDe;
	}

	public void setTenTieuDe(String tenTieuDe) {
		this.tenTieuDe = tenTieuDe;
	}

	public LoaiDia getLoaiDia() {
		return loaiDia;
	}

	public void setLoaiDia(LoaiDia loaiDia) {
		this.loaiDia = loaiDia;
	}

	@Override
	public String toString() {
		return "TieuDe [maTieuDe=" + maTieuDe + ", tenTieuDe=" + tenTieuDe + ", loaiDia=" + loaiDia + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (maTieuDe ^ (maTieuDe >>> 32));
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
		TuaDe other = (TuaDe) obj;
		if (maTieuDe != other.maTieuDe)
			return false;
		return true;
	}

}
