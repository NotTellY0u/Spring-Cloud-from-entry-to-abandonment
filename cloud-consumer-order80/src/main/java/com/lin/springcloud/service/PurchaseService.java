package com.lin.springcloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lin.springcloud.entity.PurchaseEntity;
import com.lin.springcloud.utils.PageUtils;
import com.lin.springcloud.vo.MergeVo;
import com.lin.springcloud.vo.PurchaseDoneVo;

import java.util.List;
import java.util.Map;

/**
 * 采购信息
 *
 * @author Fibonacci
 * @email bugaosuni@gmail.com
 * @date 2020-12-11 22:59:59
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 获取未领取的采购单
     * @param params 采购单信息
     * @return 未领取的采购单
     */
    PageUtils queryPageUnreceivePurchase(Map<String, Object> params);

    /**
     * 合并采购单
     * @param mergeVo 需要合并的采购单
     */
    void mergePurchase(MergeVo mergeVo);

    /**
     * 领取采购单
     * @param ids 采购单
     */
    void received(List<Long> ids);

    /**
     * 完成采购
     * @param doneVo 采购信息
     * @return
     */
    PageUtils done(PurchaseDoneVo doneVo);
}

