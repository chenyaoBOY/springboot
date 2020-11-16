package org.study.ssm.standard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.study.ssm.standard.domain.ShopOrderExample;
import org.study.ssm.standard.mapper.ShopOrderMapper;
import org.study.ssm.standard.service.ShopOrderService;

/**
 * @author chenyao
 * @date 2020/5/27 15:28
 * @description
 */
@Service
public class ShopOrderServiceImpl implements ShopOrderService {

    @Autowired
    private ShopOrderMapper shopOrderMapper;

    @Override
    public int count() {
        int i = shopOrderMapper.countByExample(new ShopOrderExample());
        return i;
    }
}
