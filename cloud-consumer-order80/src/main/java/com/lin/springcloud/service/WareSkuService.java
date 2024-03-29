package com.lin.springcloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lin.springcloud.entity.WareSkuEntity;
import com.lin.springcloud.utils.PageUtils;
import com.lin.springcloud.vo.SkuHasStockVo;

import java.util.List;
import java.util.Map;

/**
 * 商品库存
 *
 * @author Fibonacci
 * @email bugaosuni@gmail.com
 * @date 2020-12-11 22:59:58
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);


    void addStock(Long skuId, Long wareId, Integer skuNum);

    /**
     * 判断是否有库存
     * @param skuIds skuID
     * @return 返回信息
     */
    List<SkuHasStockVo> getSkusHasStock(List<Long> skuIds);
}

