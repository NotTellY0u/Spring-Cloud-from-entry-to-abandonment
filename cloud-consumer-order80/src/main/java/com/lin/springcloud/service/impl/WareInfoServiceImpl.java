package com.lin.springcloud.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lin.springcloud.dao.WareInfoDao;
import com.lin.springcloud.entity.WareInfoEntity;
import com.lin.springcloud.service.WareInfoService;
import com.lin.springcloud.utils.PageUtils;
import com.lin.springcloud.utils.Query;
import com.lin.springcloud.utils.R;
import com.lin.springcloud.vo.MemberAddressVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;


@Service("wareInfoService")
public class WareInfoServiceImpl extends ServiceImpl<WareInfoDao, WareInfoEntity> implements WareInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {

        String key = (String) params.get("key");
        QueryWrapper<WareInfoEntity> wrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(key)) {
            wrapper.eq("id", key).or().like("name", key).
                    or().like("address", key).or().like("areacode", key);
        }
        IPage<WareInfoEntity> page = this.page(
                new Query<WareInfoEntity>().getPage(params),
                wrapper
        );

        return new PageUtils(page);
    }

    @Override
    public BigDecimal getFare(Long addrId) {

        return null;
    }

    @Override
    public boolean save(WareInfoEntity entity) {
        return super.save(entity);
    }

    @Override
    public boolean saveBatch(Collection<WareInfoEntity> entityList) {
        return super.saveBatch(entityList);
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<WareInfoEntity> entityList) {
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
    public boolean remove(Wrapper<WareInfoEntity> queryWrapper) {
        return super.remove(queryWrapper);
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return super.removeByIds(idList);
    }

    @Override
    public boolean updateById(WareInfoEntity entity) {
        return super.updateById(entity);
    }

    @Override
    public boolean update(Wrapper<WareInfoEntity> updateWrapper) {
        return super.update(updateWrapper);
    }

    @Override
    public boolean update(WareInfoEntity entity, Wrapper<WareInfoEntity> updateWrapper) {
        return super.update(entity, updateWrapper);
    }

    @Override
    public boolean updateBatchById(Collection<WareInfoEntity> entityList) {
        return super.updateBatchById(entityList);
    }

    @Override
    public WareInfoEntity getById(Serializable id) {
        return super.getById(id);
    }

    @Override
    public List<WareInfoEntity> listByIds(Collection<? extends Serializable> idList) {
        return super.listByIds(idList);
    }

    @Override
    public List<WareInfoEntity> listByMap(Map<String, Object> columnMap) {
        return super.listByMap(columnMap);
    }

    @Override
    public WareInfoEntity getOne(Wrapper<WareInfoEntity> queryWrapper) {
        return super.getOne(queryWrapper);
    }

    @Override
    public int count() {
        return super.count();
    }

    @Override
    public int count(Wrapper<WareInfoEntity> queryWrapper) {
        return super.count(queryWrapper);
    }

    @Override
    public List<WareInfoEntity> list(Wrapper<WareInfoEntity> queryWrapper) {
        return super.list(queryWrapper);
    }

    @Override
    public List<WareInfoEntity> list() {
        return super.list();
    }

    @Override
    public <E extends IPage<WareInfoEntity>> E page(E page, Wrapper<WareInfoEntity> queryWrapper) {
        return super.page(page, queryWrapper);
    }

    @Override
    public <E extends IPage<WareInfoEntity>> E page(E page) {
        return super.page(page);
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<WareInfoEntity> queryWrapper) {
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
    public List<Object> listObjs(Wrapper<WareInfoEntity> queryWrapper) {
        return super.listObjs(queryWrapper);
    }

    @Override
    public <V> List<V> listObjs(Wrapper<WareInfoEntity> queryWrapper, Function<? super Object, V> mapper) {
        return super.listObjs(queryWrapper, mapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page, Wrapper<WareInfoEntity> queryWrapper) {
        return super.pageMaps(page, queryWrapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page) {
        return super.pageMaps(page);
    }

    @Override
    public QueryChainWrapper<WareInfoEntity> query() {
        return super.query();
    }

    @Override
    public LambdaQueryChainWrapper<WareInfoEntity> lambdaQuery() {
        return super.lambdaQuery();
    }

    @Override
    public UpdateChainWrapper<WareInfoEntity> update() {
        return super.update();
    }

    @Override
    public LambdaUpdateChainWrapper<WareInfoEntity> lambdaUpdate() {
        return super.lambdaUpdate();
    }

    @Override
    public boolean saveOrUpdate(WareInfoEntity entity, Wrapper<WareInfoEntity> updateWrapper) {
        return super.saveOrUpdate(entity, updateWrapper);
    }
}