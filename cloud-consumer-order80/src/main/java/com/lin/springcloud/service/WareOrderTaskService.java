package com.lin.springcloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lin.springcloud.entity.WareOrderTaskEntity;
import com.lin.springcloud.utils.PageUtils;
import java.util.Map;

/**
 * 库存工作单
 *
 * @author Fibonacci
 * @email bugaosuni@gmail.com
 * @date 2020-12-11 22:59:58
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

