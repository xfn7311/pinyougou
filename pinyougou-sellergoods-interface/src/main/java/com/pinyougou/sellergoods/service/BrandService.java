package com.pinyougou.sellergoods.service;

import java.util.List;

import com.pinyougou.entity.PageResult;
import com.pinyougou.pojo.TbBrand;
/**
 * 品牌管理
 * @author DELL
 *
 */
public interface BrandService {
	
	List<TbBrand> findAll();
	/**
	 * 返回分页列表
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	PageResult findPage(int pageNum , int pageSize);
	/**
	 * 添加品牌
	 * @param brand
	 */
	void add(TbBrand brand);
}
