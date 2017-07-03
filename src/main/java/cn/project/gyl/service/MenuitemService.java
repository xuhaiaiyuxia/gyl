package cn.project.gyl.service;

import java.util.List;

import cn.project.gyl.pojo.Menuitem;
import cn.project.gyl.pojo.Privilege;

public interface MenuitemService {

	List<Menuitem>getListByPid(Long pid);

	Iterable<Menuitem> getAll();

	Iterable<Privilege> getMenuItemByUid(Long uid);
}
