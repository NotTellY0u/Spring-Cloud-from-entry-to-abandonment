package com.lin.springcloud.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lin.springcloud.dao.PurchaseDetailDao;
import com.lin.springcloud.entity.PurchaseDetailEntity;
import com.lin.springcloud.service.PurchaseDetailService;
import com.lin.springcloud.utils.PageUtils;
import com.lin.springcloud.utils.Query;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;


@Service("purchaseDetailService")
public class PurchaseDetailServiceImpl extends ServiceImpl<PurchaseDetailDao, PurchaseDetailEntity> implements PurchaseDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        QueryWrapper<PurchaseDetailEntity> queryWrapper = new QueryWrapper<>();

        String key = (String) params.get("key");
        if(StringUtils.isNotBlank(key)){
            queryWrapper.and(wrapper->{
                wrapper.eq("purchase_id",key).or().eq("sku_id",key);
            });
        }
        String status = (String) params.get("status");
        if(StringUtils.isNotBlank(status)){
            queryWrapper.eq("status",status);
        }
        String wareId = (String) params.get("wareId");
        if(StringUtils.isNotBlank(wareId)){
            queryWrapper.eq("ware_id",wareId);
        }

        IPage<PurchaseDetailEntity> page = this.page(
                new Query<PurchaseDetailEntity>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

    /**
     * 通过id获取采购项信息
     * @param id 采购单id
     * @return 采购项信息列表
     */
    @Override
    public List<PurchaseDetailEntity> listDetailByPurchaseId(Long id) {
        List<PurchaseDetailEntity> detailEntities = this.list(new QueryWrapper<PurchaseDetailEntity>().eq("purchase_id", id));
        return detailEntities;
    }

    @Override
    public boolean save(PurchaseDetailEntity entity) {
        return super.save(entity);
    }

    @Override
    public boolean saveBatch(Collection<PurchaseDetailEntity> entityList) {
        return super.saveBatch(entityList);
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<PurchaseDetailEntity> entityList) {
        return super.saveOrUpdateBatch(entityList);
    }

    @Override
    public boolean removeById(Serializable id) {
        return super.removeById(id);
    }

    @Override
    public boolean removeByMap(Map<String, Object> columnMap) {
        return super.removeByMap(columnMap);
    }

    @Override
    public boolean remove(Wrapper<PurchaseDetailEntity> queryWrapper) {
        return super.remove(queryWrapper);
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return super.removeByIds(idList);
    }

    @Override
    public boolean updateById(PurchaseDetailEntity entity) {
        return super.updateById(entity);
    }

    @Override
    public boolean update(Wrapper<PurchaseDetailEntity> updateWrapper) {
        return super.update(updateWrapper);
    }

    @Override
    public boolean update(PurchaseDetailEntity entity, Wrapper<PurchaseDetailEntity> updateWrapper) {
        return super.update(entity, updateWrapper);
    }

    @Override
    public boolean updateBatchById(Collection<PurchaseDetailEntity> entityList) {
        return super.updateBatchById(entityList);
    }

    @Override
    public PurchaseDetailEntity getById(Serializable id) {
        return super.getById(id);
    }

    @Override
    public List<PurchaseDetailEntity> listByIds(Collection<? extends Serializable> idList) {
        return super.listByIds(idList);
    }

    @Override
    public List<PurchaseDetailEntity> listByMap(Map<String, Object> columnMap) {
        return super.listByMap(columnMap);
    }

    @Override
    public PurchaseDetailEntity getOne(Wrapper<PurchaseDetailEntity> queryWrapper) {
        return super.getOne(queryWrapper);
    }

    @Override
    public int count() {
        return super.count();
    }

    @Override
    public int count(Wrapper<PurchaseDetailEntity> queryWrapper) {
        return super.count(queryWrapper);
    }

    @Override
    public List<PurchaseDetailEntity> list(Wrapper<PurchaseDetailEntity> queryWrapper) {
        return super.list(queryWrapper);
    }

    @Override
    public List<PurchaseDetailEntity> list() {
        return super.list();
    }

    @Override
    public <E extends IPage<PurchaseDetailEntity>> E page(E page, Wrapper<PurchaseDetailEntity> queryWrapper) {
        return super.page(page, queryWrapper);
    }

    @Override
    public <E extends IPage<PurchaseDetailEntity>> E page(E page) {
        return super.page(page);
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<PurchaseDetailEntity> queryWrapper) {
        return super.listMaps(queryWrapper);
    }

    @Override
    public List<Map<String, Object>> listMaps() {
        return super.listMaps();
    }

    @Override
    public List<Object> listObjs() {
        return super.listObjs();
    }

    @Override
    public <V> List<V> listObjs(Function<? super Object, V> mapper) {
        return super.listObjs(mapper);
    }

    @Override
    public List<Object> listObjs(Wrapper<PurchaseDetailEntity> queryWrapper) {
        return super.listObjs(queryWrapper);
    }

    @Override
    public <V> List<V> listObjs(Wrapper<PurchaseDetailEntity> queryWrapper, Function<? super Object, V> mapper) {
        return super.listObjs(queryWrapper, mapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page, Wrapper<PurchaseDetailEntity> queryWrapper) {
        return super.pageMaps(page, queryWrapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page) {
        return super.pageMaps(page);
    }

    @Override
    public QueryChainWrapper<PurchaseDetailEntity> query() {
        return super.query();
    }

    @Override
    public LambdaQueryChainWrapper<PurchaseDetailEntity> lambdaQuery() {
        return super.lambdaQuery();
    }

    @Override
    public UpdateChainWrapper<PurchaseDetailEntity> update() {
        return super.update();
    }

    @Override
    public LambdaUpdateChainWrapper<PurchaseDetailEntity> lambdaUpdate() {
        return super.lambdaUpdate();
    }

    @Override
    public boolean saveOrUpdate(PurchaseDetailEntity entity, Wrapper<PurchaseDetailEntity> updateWrapper) {
        return super.saveOrUpdate(entity, updateWrapper);
    }
}