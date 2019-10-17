package com.gwmall.item.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author FengZongMin
 * @version 1.0
 * @ClassName Brand
 * @Description TODO
 * @CreateDate 2019-10-17 16:21
 * @UpdateDate 2019-10-17 16:21
 **/
@Data
@Table(name="tb_brand")
public class Brand {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String name;
    private String image;
    private Character letter;
}
