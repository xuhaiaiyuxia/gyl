package cn.project.gyl.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;

@Entity
@NamedQueries({
	
})
public class Menuitem {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long mid;//主键
	private Long pid;//父节点
	private String name;//树上的每一个节点的名称
	private Boolean isParent;//是否为父节点
	private String icon;//图片路径
	public Long getMid() {
		return mid;
	}
	public void setMid(Long mid) {
		this.mid = mid;
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
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	@Override
	public String toString() {
		return "Menuitem [mid=" + mid + ", pid=" + pid + ", name=" + name + ", isParent=" + isParent + ", icon=" + icon
				+ "]";
	}
	
}
