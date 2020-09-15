package tpc.metocan.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tblkullanici {

	@Id
	@SequenceGenerator(name = "sq_kullanici_id", sequenceName = "sq_kullanici_id",
	initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "sq_kullanici_id")
	private int id;
	private String islem;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIslem() {
		return islem;
	}
	public void setIslem(String islem) {
		this.islem = islem;
	}
	
	
	
}
