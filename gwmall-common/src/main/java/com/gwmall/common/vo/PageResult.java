package com.gwmall.common.vo;

import lombok.Data;

import java.util.List;

/**
 * @author FengZongMin
 * @version 1.0
 * @ClassName PageResult
 * @Description TODO
 * @CreateDate 2019-10-17 16:30
 * @UpdateDate 2019-10-17 16:30
 **/
@Data
public class PageResult<T> {
    private Long total;
    private Integer totalPage;
    private List<T> items;

    public PageResult(){

    }

    public PageResult(Long total, List<T> items){
        this.total=total;
        this.items=items;
    }

    public PageResult(Long total, Integer totalPage, List<T> items){
        this.total=total;
        this.totalPage=totalPage;
        this.items=items;
    }
}
