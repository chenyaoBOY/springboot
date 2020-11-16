package org.study.ssm.druid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.ssm.druid.entity.UsersExample;
import org.study.ssm.druid.mapper.UsersDao;

/**
 * @author chenyao
 * @date 2020/11/16 15:35
 * @description
 */
@RestController
public class EntranceController {

    @Autowired
    private UsersDao usersDao;

    @GetMapping("/count.do")
    public long count(){
        return usersDao.countByExample(new UsersExample());
    }
}
