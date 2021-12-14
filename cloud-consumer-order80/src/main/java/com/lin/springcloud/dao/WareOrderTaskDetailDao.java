package com.lin.springcloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lin.springcloud.entity.WareOrderTaskDetailEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 库存工作单
 * 
 * @author Fibonacci
 * @email bugaosuni@gmail.com
 * @date 2020-12-11 22:59:58
 */
@Mapper
public interface WareOrderTaskDetailDao extends BaseMapper<WareOrderTaskDetailEntity> {
	
}
