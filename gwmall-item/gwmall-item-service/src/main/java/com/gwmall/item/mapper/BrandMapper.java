package com.gwmall.item.mapper;

import com.gwmall.item.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author FengZongMin
 * @version 1.0
 * @ClassName BrandMapper
 * @Description TODO
 * @CreateDate 2019-10-17 16:23
 * @UpdateDate 2019-10-17 16:23
 **/
public interface BrandMapper extends Mapper<Brand> {
    @Insert("INSERT INTO tb_category_brand (category_id, brand_id) VALUES(#{cid}, #{bid})")
    int insertCategoryBrand(@Param("cid")Long cid, @Param("bid")Long bid);
}
