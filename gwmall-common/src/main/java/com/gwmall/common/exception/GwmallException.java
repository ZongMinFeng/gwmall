package com.gwmall.common.exception;

import com.gwmall.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author FengZongMin
 * @version 1.0
 * @ClassName GwmallException
 * @Description TODO
 * @CreateDate 2019-10-12 1:42
 * @UpdateDate 2019-10-12 1:42
 **/
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class GwmallException extends RuntimeException{
    private ExceptionEnum exceptionEnum;

}
