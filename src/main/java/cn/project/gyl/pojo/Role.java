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
import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
public class Role implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 451038666309852878L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long rid;
	private Long pid;
	private String name;
	private Boolean isParent;//是否为父节点
	@ManyToMany
	@JoinTable(name="user_role",joinColumns={@JoinColumn(name="role_id")},
			inverseJoinColumns = @JoinColumn(name = "user_id"))
	@JsonProperty(required=false)
	private Set<User> users;
	@ManyToMany()
	@JoinTable(joinColumns=@JoinColumn(name="role_id"),
				inverseJoinColumns=@JoinColumn(name="privilege_id"),
				name="role_privilege")
	@JsonIgnore
	private Set<Privilege> privileges;
	@Transient
	private Boolean checked;//设置是否被选中
	
	public Boolean getChecked() {
		return checked;
	}
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	public Set<Privilege> getPrivileges() {
		return privileges;
	}
	public void setPrivileges(Set<Privilege> privileges) {
		this.privileges = privileges;
	}
	public Long getRid() {
		return rid;
	}
	public void setRid(Long rid) {
		this.rid = rid;
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
	public Boolean getIsParent() {
		return isParent;
	}
	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Role [rid=" + rid + ", pid=" + pid + ", name=" + name + ", isParent=" + isParent + ", checked="
				+ checked + "]";
	}
	
	
}
