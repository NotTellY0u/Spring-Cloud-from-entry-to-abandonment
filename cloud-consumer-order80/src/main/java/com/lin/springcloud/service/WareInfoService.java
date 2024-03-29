package com.lin.springcloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lin.springcloud.entity.WareInfoEntity;
import com.lin.springcloud.utils.PageUtils;
import java.math.BigDecimal;
import java.util.Map;

/**
 * 仓库信息
 *
 * @author Fibonacci
 * @email bugaosuni@gmail.com
 * @date 2020-12-11 22:59:59
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 查运费
     *
     * @param addrId 地址id
     * @return 运费价格
     */
    BigDecimal getFare(Long addrId);
}

