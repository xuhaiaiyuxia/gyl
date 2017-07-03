var menuitem = {
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
	zNodes:[
		{id:'1',name:'供应链管理系统',pid:'0'},
	/***********************************************************************************/
		/**
		  *	基础数据管理
		  */
		{id:'2',name:'基础数据',pid:'1'},
		{id:'3',name:'公司',pid:'2'},
		{id:'5',name:'部门',pid:'3',url:'/deptController/department',target:'right'},
		{id:'6',name:'用户',pid:'3',url:'/userController/user',target:'right'},
		{id:'7',name:'商品档案',pid:'2',url:'base/product/product.html',target:'right'},
		{id:'8',name:'仓库',pid:'2',url:'base/repository/repository.html',target:'right'},
		{id:'9',name:'客户',pid:'2',url:'base/customer/customer.html',target:'right'},
		{id:'10',name:'供应商',pid:'2',url:'base/product_provider/product_provider.html',target:'right'},
	/***********************************************************************************/
		/**
		  *    权限管理
		  */
		{id:'11',name:'权限管理',pid:'1'},
		/************************************************************/
		    /**
			  *   角色管理
			  */
		{id:'111',name:'角色管理',pid:'11'},
		{id:'1111',name:'角色查询',pid:'111',url:'privilege/user_role.html',target:'right'},
		{id:'1112',name:'角色配置',pid:'111',url:'privilege/user_role.html',target:'right'},
		{id:'112',name:'权限配置',pid:'11',url:'privilege/role_privilege.html',target:'right'},
	/***********************************************************************************/
		 /**
		   *  业务
		   */
		 {id:'4',name:'业务',pid:'1'},
	/***********************************************************************************/
		/**
		  *  库存管理
		  */
		{id:'15',name:'库存管理',pid:'4'},
			/**
		      *  期初管理
			  */
		{id:'151',name:'期初管理',pid:'15'},
		{id:'1511',name:'查询',pid:'151',url:'kucun/qichu/list.html',target:'right'},
		{id:'1512',name:'修改、删除',pid:'151'},
		{id:'1513',name:'增加',pid:'151'},
			/**
			  *  盘点
			  */
		{id:'152',name:'盘点',pid:'15'},
		{id:'1521',name:'查询',pid:'152',url:'kucun/pandian/list.html',target:'right'},
		{id:'1522',name:'修改、删除',pid:'152'},
		{id:'1523',name:'增加',pid:'152'},
	/***********************************************************************************/
	    /**
		  *	预警管理
		  */
		{id:'18',name:'预警管理',pid:'4'},
		{id:'181',name:'采购入库预警',pid:'18',url:'yujing/caigouruku.html',target:'right'},
		{id:'182',name:'销售发货预警',pid:'18'},
		{id:'183',name:'销售出库预警',pid:'18'},
	/*****************************************************************************************/
		/**
		  *	应收应付管理
		  */
		{id:'17',name:'应收应付款管理',pid:'4'},
		  /**
		    *   销售应收单管理
			*/
		{id:'171',name:'销售应收单管理',pid:'17'},
		{id:'1711',name:'查询',pid:'171',url:'ysyf/xiaoshouys/list.html',target:'right'},
		{id:'1712',name:'修改、删除',pid:'171'},
		{id:'1713',name:'增加',pid:'171'},
		{id:'1714',name:'审批',pid:'171'},
		  /**
		    *  采购应付单
			*/
		{id:'172',name:'采购应付单管理',pid:'17'},
		{id:'1721',name:'查询',pid:'172',url:'ysyf/caigouyf/list.html',target:'right'},
		{id:'1722',name:'修改、删除',pid:'172'},
		{id:'1723',name:'增加',pid:'172'},
		{id:'1724',name:'审批',pid:'172'},
	/****************************************************************************************/
	      /**
		    *  采购管理
			*/
			
		{id:'14',name:'采购管理',pid:'4'},
			/**
			  *  请购单管理
			  */
			{id:'141',name:'请购单管理',pid:'14'},
			{id:'1411',name:'查询',pid:'141',url:'caigou/qinggou/list.html',target:'right'},
			{id:'1412',name:'修改、删除',pid:'141',url:'caigou/qinggou/update.html',target:'right'},
			{id:'1413',name:'增加',pid:'141',url:'caigou/qinggou/add.html',target:'right'},
			{id:'1414',name:'审批',pid:'141'},
			/**
			  *  采购订单管理
			  */
			{id:'142',name:'采购订单管理',pid:'14'},
			{id:'1421',name:'查询',pid:'142',url:'caigou/caigoudingdan/list.html',target:'right'},
			{id:'1422',name:'修改、删除',pid:'142'},
			{id:'1423',name:'增加',pid:'142'},
			{id:'1424',name:'审批',pid:'142'},
			/**
			  *  采购入库管理
			  */
			{id:'143',name:'采购入库管理',pid:'14'},
			{id:'1431',name:'查询',pid:'143',url:'caigou/caigourukudan/list.html',target:'right'},
			{id:'1432',name:'修改、删除',pid:'143'},
			{id:'1433',name:'增加',pid:'143'},
			{id:'1434',name:'审批',pid:'143'},
		    /**
			  *  采购发票管理
			  */
			{id:'144',name:'采购发票管理',pid:'14'},
			{id:'1441',name:'查询',pid:'144',url:'caigou/caigoufapiao/list.html',target:'right'},
			{id:'1442',name:'修改、删除',pid:'144'},
			{id:'1443',name:'增加',pid:'144'},
			{id:'1444',name:'审批',pid:'144'},
	/*************************************************************************************/
			/**
			  *   销售管理
			  */
			  {id:'16',name:'销售管理',pid:'4'},
		/**
		  *  销售预订单管理
		  */
		{id:'161',name:'销售预订单管理',pid:'16'},
		{id:'1611',name:'查询',pid:'161',url:'xiaoshou/xiaoshouyudingdan/list.html',target:'right'},
		{id:'1612',name:'修改',pid:'161',url:'xiaoshou/xiaoshouyudingdan/update.html',target:'right'},
		{id:'1613',name:'增加',pid:'161',url:'xiaoshou/xiaoshouyudingdan/add.html',target:'right'},
		{id:'1614',name:'审批',pid:'161'},
		/**
		  *  销售订单管理
		  */
		{id:'162',name:'销售订单',pid:'16'},
		{id:'1621',name:'查询',pid:'162',url:'xiaoshou/xiaoshoudingdan/list.html',target:'right'},
		{id:'1622',name:'修改、删除',pid:'162',url:'xiaoshou/xiaoshoudingdan/update.html',target:'right'},
		{id:'1623',name:'增加',pid:'162',url:'xiaoshou/xiaoshoudingdan/add.html',target:'right'},
        {id:'1624',name:'审批',pid:'162'},
		/**
		  *  销售发货单管理
		  */
		{id:'164',name:'发货单管理',pid:'16'},
		{id:'1641',name:'查询',pid:'164',url:'xiaoshou/xiaoshoufahuodan/list.html',target:'right'},
		{id:'1642',name:'修改、删除',pid:'164'},
		{id:'1643',name:'增加',pid:'164'},
		{id:'1644',name:'审批',pid:'164'},
		/**
		  *  销售出库单管理
		  */
		{id:'165',name:'销售出库单管理',pid:'16'},
		{id:'1651',name:'查询',pid:'165',url:'xiaoshou/xiaoshouchukudan/list.html',target:'right'},
		{id:'1652',name:'修改、删除',pid:'165'},
		{id:'1653',name:'增加',pid:'165'},
		/**
		  *  销售开票管理
		  */
		{id:'166',name:'销售开票管理',pid:'16'},
		{id:'1661',name:'查询',pid:'166',url:'xiaoshou/xiaoshoukaipiao/list.html',target:'right'},
		{id:'1662',name:'修改、删除',pid:'166'},
		{id:'1663',name:'增加',pid:'166'},
		{id:'1664',name:'审批',pid:'166'},
	],
	loadMenuitemTree:function(){
		$("#tree").zTree(menuitem.setting,menuitem.zNodes);
	}
};

$().ready(function(){
	menuitem.loadMenuitemTree();
});