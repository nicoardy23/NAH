package latihan.mysql;

import java.math.BigInteger;

public class CobaMySQL {
	private Long id;
	private String namaLengkap;
	private String alamat;
	private String noHP;
	private String noKTP;
	private short createdBy;
	private String createdDate;
	private short modifiedBy;
	private String modfiedDate;
	private char isDelete;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNamaLengkap() {
		return namaLengkap;
	}

	public void setNamaLengkap(String namaLengkap) {
		this.namaLengkap = namaLengkap;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getNoHP() {
		return noHP;
	}

	public void setNoHP(String noHP) {
		this.noHP = noHP;
	}

	public String getNoKTP() {
		return noKTP;
	}

	public void setNoKTP(String noKTP) {
		this.noKTP = noKTP;
	}

	public short getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(short createdBy) {
		this.createdBy = createdBy;
	}

	public short getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(short modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public char getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(char isDelete) {
		this.isDelete = isDelete;
	}
}
