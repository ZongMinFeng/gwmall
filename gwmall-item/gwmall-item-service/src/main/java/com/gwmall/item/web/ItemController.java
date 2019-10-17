package com.gwmall.item.web;

import com.gwmall.common.enums.ExceptionEnum;
import com.gwmall.common.exception.GwmallException;
import com.gwmall.item.pojo.Item;
import com.gwmall.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FengZongMin
 * @version 1.0
 * @ClassName ItemController
 * @Description TODO
 * @CreateDate 2019-10-12 0:38
 * @UpdateDate 2019-10-12 0:38
 **/
@RestController
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public ResponseEntity<Item> saveItem(Item item){
        System.out.println("item = " + item);//debug
        //判断 校验价格
        if(item.getPrice()==null){
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
//            throw new RuntimeException("价格不能为空");
            throw new GwmallException(ExceptionEnum.PRICE_CANNOT_BE_NULL);
        }
//        return itemService.saveItem(item);
        item=itemService.saveItem(item);
        System.out.println("item = " + item);//debug
        return ResponseEntity.status(HttpStatus.CREATED).body(item);
    }
}
