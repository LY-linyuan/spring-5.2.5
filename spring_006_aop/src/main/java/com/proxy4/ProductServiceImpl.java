package com.proxy4;

import com.proxy4.Service;

/**
 * @Author 临渊
 * @Date 2022-08-06 14:37
 */
public class ProductServiceImpl implements Service {
    @Override
    public void buy() {
        System.out.println("商品购买业务实现");
    }
}
