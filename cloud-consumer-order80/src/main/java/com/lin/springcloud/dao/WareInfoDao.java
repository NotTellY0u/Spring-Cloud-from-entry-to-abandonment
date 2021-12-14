package com.lin.springcloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lin.springcloud.entity.WareInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author Fibonacci
 * @email bugaosuni@gmail.com
 * @date 2020-12-11 22:59:59
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
