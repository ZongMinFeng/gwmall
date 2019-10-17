package com.gwmall.item.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author FengZongMin
 * @version 1.0
 * @ClassName Category
 * @Description TODO
 * @CreateDate 2019-10-17 14:19
 * @UpdateDate 2019-10-17 14:19
 **/
@Table(name="tb_category")
@Data
public class Category {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String name;
    private Long parentId;
    private Boolean isParent;
    private Integer sort;
}
