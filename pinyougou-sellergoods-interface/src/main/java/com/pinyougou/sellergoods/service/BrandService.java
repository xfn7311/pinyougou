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
	
	public List<TbBrand> findAll();
	/**
	 * 返回分页列表
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageResult findPage(int pageNum , int pageSize);
	/**
	 * 添加品牌
	 * @param brand
	 */
	public void add(TbBrand brand);
	/**
	 * 修改品牌
	 * @param brand
	 */
	public void update(TbBrand brand);
	/**
	 * 根据id查询品牌实体
	 * @param id
	 * @return
	 */
	public TbBrand findOne(Long id);
	/**
	 * 根据id批量删除品牌
	 * @param ids
	 */
	public void delete(Long[] ids);
	/**
	 * 带条件分页查询
	 * @param brand
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageResult findPage(TbBrand brand,int pageNum , int pageSize);
}
