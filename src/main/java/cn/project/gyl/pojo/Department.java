package cn.project.gyl.pojo;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Department implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8480434050968342729L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long did;
	private String name;
	private String description;
	public Long getDid() {
		return did;
	}
	public void setDid(Long did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
