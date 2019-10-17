package com.gwmall.item.service;

import com.gwmall.item.pojo.Item;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author FengZongMin
 * @version 1.0
 * @ClassName ItemService
 * @Description TODO
 * @CreateDate 2019-10-12 0:35
 * @UpdateDate 2019-10-12 0:35
 **/
@Service
public class ItemService {
    public Item saveItem(Item item){
        int id=new Random().nextInt(100);
        item.setId(id);
        return item;
    }
}
