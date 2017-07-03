var privilege = {
		setting:{
			isSimpleData: true,
			treeNodeKey: "id",
			treeNodeParentKey: "pid",
			showLine: true,
			root:{ 
				isRoot:true,
				nodes:[]
			}
		},
		/**
		 * 加载树
		 */
		loadPrivilegeTree:function(){
	//		var data = [{"id":1,"pid":0,"name":"供应链管理系统","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":2,"pid":1,"name":"基础数据","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":3,"pid":2,"name":"部门","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":8,"pid":2,"name":"用户","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":13,"pid":2,"name":"角色","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":18,"pid":2,"name":"商品","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":23,"pid":2,"name":"仓库","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":28,"pid":2,"name":"客户","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":33,"pid":2,"name":"供应商","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":38,"pid":1,"name":"权限管理","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":39,"pid":38,"name":"角色配置","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":41,"pid":38,"name":"权限配置","description":null,"icon":"images/002.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":43,"pid":1,"name":"业务","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":44,"pid":43,"name":"采购管理","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":45,"pid":44,"name":"请购单管理","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":46,"pid":45,"name":"增加","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":47,"pid":45,"name":"修改","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":48,"pid":45,"name":"查询","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":49,"pid":45,"name":"审批","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":50,"pid":44,"name":"请购单管理","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":51,"pid":50,"name":"增加","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":52,"pid":50,"name":"修改","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":53,"pid":50,"name":"查询","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":54,"pid":50,"name":"审批","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":55,"pid":44,"name":"采购入库单管理","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":56,"pid":55,"name":"增加","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":57,"pid":55,"name":"修改","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":58,"pid":55,"name":"查询","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":59,"pid":55,"name":"审批","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":60,"pid":44,"name":"采购发票管理","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":61,"pid":60,"name":"增加","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":62,"pid":60,"name":"修改","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":63,"pid":60,"name":"查询","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":64,"pid":60,"name":"审批","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":65,"pid":43,"name":"销售管理","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":66,"pid":65,"name":"销售预订单管理","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":67,"pid":66,"name":"增加","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":68,"pid":66,"name":"修改","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":69,"pid":66,"name":"查询","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":70,"pid":66,"name":"审批","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":71,"pid":65,"name":"销售订单管理","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":72,"pid":71,"name":"增加","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":73,"pid":71,"name":"增加","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":74,"pid":71,"name":"查询","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":75,"pid":71,"name":"审批","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":76,"pid":65,"name":"发货单管理","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":77,"pid":76,"name":"增加","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":78,"pid":76,"name":"修改","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":79,"pid":76,"name":"查询","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":80,"pid":76,"name":"审批","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":81,"pid":65,"name":"销售出库单管理","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":82,"pid":81,"name":"增加","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":83,"pid":81,"name":"修改","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":84,"pid":81,"name":"查询","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":85,"pid":81,"name":"审批","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":86,"pid":65,"name":"销售开票管理","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":87,"pid":86,"name":"增加","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":88,"pid":86,"name":"修改","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":89,"pid":86,"name":"查询","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":90,"pid":86,"name":"审批","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":91,"pid":43,"name":"应收应付管理","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":92,"pid":91,"name":"销售应收管理","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":93,"pid":92,"name":"增加","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":94,"pid":92,"name":"修改","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":95,"pid":92,"name":"查询","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":96,"pid":92,"name":"审批","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":97,"pid":91,"name":"采购应付单管理","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":98,"pid":97,"name":"增加","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":99,"pid":97,"name":"修改","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":100,"pid":97,"name":"查询","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":101,"pid":97,"name":"审批","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":102,"pid":43,"name":"预警管理","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":104,"pid":102,"name":"销售发货预警","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":105,"pid":102,"name":"销售出库预警","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":106,"pid":43,"name":"仓库管理","description":null,"icon":null,"checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":107,"pid":106,"name":"期初","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":108,"pid":107,"name":"增加","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":109,"pid":107,"name":"修改","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":110,"pid":107,"name":"查询","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":111,"pid":107,"name":"审批","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":112,"pid":106,"name":"盘点","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":true,"type":"1"},{"id":113,"pid":112,"name":"增加","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":114,"pid":112,"name":"修改","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":115,"pid":112,"name":"查询","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"},{"id":116,"pid":112,"name":"审批","description":null,"icon":"/images/003.gif","checked":null,"url":null,"target":null,"isParent":false,"type":"1"}];
			//$("#tree").zTree(privilege.setting,data);
			$.post("/menuitemController/getByPid",null,function(data){
				$("#tree").zTree(privilege.setting,data);
			});
		}
	};

	$().ready(function(){
		privilege.loadPrivilegeTree();
	});