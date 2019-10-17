package com.gwmall.common.advice;

import com.gwmall.common.enums.ExceptionEnum;
import com.gwmall.common.exception.GwmallException;
import com.gwmall.common.vo.ExceptionResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author FengZongMin
 * @version 1.0
 * @ClassName CommonExceptionHandler
 * @Description 通用异常处理器
 * @CreateDate 2019-10-12 1:27
 * @UpdateDate 2019-10-12 1:27
 **/
@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(GwmallException.class)
    public ResponseEntity<ExceptionResult> handleException(GwmallException e){
        ExceptionEnum exceptionEnum = e.getExceptionEnum();
        return ResponseEntity.status(exceptionEnum.getCode()).body(new ExceptionResult(exceptionEnum));
    }
}
