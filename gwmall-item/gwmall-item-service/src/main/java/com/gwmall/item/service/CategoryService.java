package com.gwmall.item.service;

import com.gwmall.common.enums.ExceptionEnum;
import com.gwmall.common.exception.GwmallException;
import com.gwmall.item.mapper.CategoryMapper;
import com.gwmall.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author FengZongMin
 * @version 1.0
 * @ClassName CategoryService
 * @Description TODO
 * @CreateDate 2019-10-17 14:28
 * @UpdateDate 2019-10-17 14:28
 **/
@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> queryCategoryListByPid(Long pid) {
        Category t=new Category();
        t.setParentId(pid);
        List<Category> list=categoryMapper.select(t);
        if(CollectionUtils.isEmpty(list)){
            throw new GwmallException(ExceptionEnum.CATEGORY_NOT_FOUND);
        }
        return list;
    }
}
