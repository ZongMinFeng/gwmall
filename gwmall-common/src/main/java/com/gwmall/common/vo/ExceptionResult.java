package com.gwmall.common.vo;

import com.gwmall.common.enums.ExceptionEnum;
import lombok.Data;

/**
 * @author FengZongMin
 * @version 1.0
 * @ClassName ExceptionResult
 * @Description TODO
 * @CreateDate 2019-10-12 1:54
 * @UpdateDate 2019-10-12 1:54
 **/
@Data
public class ExceptionResult {
    private int status;
    private String message;
    private Long timestamp;

    public ExceptionResult(ExceptionEnum em){
        this.status=em.getCode();
        this.message=em.getMsg();
        this.timestamp=System.currentTimeMillis();
    }
}
