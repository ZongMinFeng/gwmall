package com.gwmall.item.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gwmall.common.enums.ExceptionEnum;
import com.gwmall.common.exception.GwmallException;
import com.gwmall.common.vo.PageResult;
import com.gwmall.item.mapper.BrandMapper;
import com.gwmall.item.pojo.Brand;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.Collection;
import java.util.List;

/**
 * @author FengZongMin
 * @version 1.0
 * @ClassName BrandService
 * @Description TODO
 * @CreateDate 2019-10-17 16:24
 * @UpdateDate 2019-10-17 16:24
 **/
@Service
public class BrandService {
    @Autowired
    private BrandMapper brandMapper;

    public PageResult<Brand> queryBrandByPage(Integer page, Integer rows, String sortBy, Boolean desc, String key) {
        //分页
        PageHelper.startPage(page, rows);

        //过滤
        Example example = new Example(Brand.class);
        if (StringUtils.isNotEmpty(key)){
            example.createCriteria().orLike("name", "%"+key+"%")
                    .orEqualTo("letter", key.toUpperCase());
        }

        //排序
        if(StringUtils.isNotEmpty(sortBy)){
            String orderByClause=sortBy+" "+(desc?"DESC":"ASC");
            example.setOrderByClause(orderByClause);
        }

        //查询
        List<Brand> list = brandMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(list)){
            throw new GwmallException(ExceptionEnum.BRAND_NOT_FOUND);
        }

        //解析分页结果
        PageInfo<Brand> info=new PageInfo<>(list);
        return new PageResult<>(info.getTotal(), list);
    }

    @Transactional
    public void saveBrand(Brand brand, List<Long> cids) {
        brand.setId(null);
        int count=brandMapper.insert(brand);
        if (count!=1){
            throw new GwmallException(ExceptionEnum.BRAND_SAVE_ERROR);
        }

        //新增中间表
        for (Long cid : cids) {
            count = brandMapper.insertCategoryBrand(cid, brand.getId());
            if (count!=1){
                throw new GwmallException(ExceptionEnum.BRAND_SAVE_ERROR);
            }
        }
    }
}
