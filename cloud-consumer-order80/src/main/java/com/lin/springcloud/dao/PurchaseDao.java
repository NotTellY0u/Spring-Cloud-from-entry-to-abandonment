package com.lin.springcloud.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lin.springcloud.entity.PurchaseEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author Fibonacci
 * @email bugaosuni@gmail.com
 * @date 2020-12-11 22:59:59
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
