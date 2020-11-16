package org.study.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.study.ssm.druid.DruidApp;
import org.study.ssm.druid.entity.UsersExample;
import org.study.ssm.druid.mapper.UsersDao;
import org.study.ssm.standard.SpringbootSSM;

/**
 * @author chenyao
 * @date 2020/11/16 15:30
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DruidApp.class})
public class DruidTest {
    @Autowired
    private UsersDao usersDao;

    @Test
    public void test(){
        System.out.println(usersDao.countByExample(new UsersExample()));
    }
}
