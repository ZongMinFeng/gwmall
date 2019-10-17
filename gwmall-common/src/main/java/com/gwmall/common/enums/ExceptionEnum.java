package com.gwmall.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author FengZongMin
 * @version 1.0
 * @ClassName ExceptionEnum
 * @Description TODO
 * @CreateDate 2019-10-12 1:44
 * @UpdateDate 2019-10-12 1:44
 **/
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {
    PRICE_CANNOT_BE_NULL(400, "价格不能为空！"),
    ;
    private int code;
    private String msg;
}
