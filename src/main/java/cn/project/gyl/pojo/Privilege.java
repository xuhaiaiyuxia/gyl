package cn.project.gyl.pojo;



import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Privilege implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1104774117227231240L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; //主键
	private Long pid;//父节点id
	private String name;
	private String description;
	@ManyToMany()
	@JoinTable(joinColumns=@JoinColumn(name="privilege_id"),
				inverseJoinColumns=@JoinColumn(name="role_id"),
				name="role_privilege")
	@JsonIgnore
	private Set<Role> roles;
	private String icon;
	@Transient
	private Boolean checked;
	
	private String url;
	private String target;
	
	
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public Boolean getChecked() {
		return checked;
	}
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	private Boolean isParent; //是否为父节点
	
	public Boolean getIsParent() {
		return isParent;
	}
	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}
	private String type;//"1"表示菜单   "2"表示页面上的操作的元素
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
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
	//在本对象转化成json字符串的时候，该注解这么写可以忽略该属性 roles
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	
	
}
