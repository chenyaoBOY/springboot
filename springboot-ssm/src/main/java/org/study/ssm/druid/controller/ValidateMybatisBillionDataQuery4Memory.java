package org.study.ssm.druid.controller;

import org.apache.ibatis.cursor.Cursor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.ssm.druid.config.ActiveResultHandler;
import org.study.ssm.druid.config.LocalWebOrderResultHandler;
import org.study.ssm.druid.entity.*;
import org.study.ssm.druid.mapper.ActiveRuleParametersDao;
import org.study.ssm.druid.mapper.LocalWebOrderDao;
import org.study.ssm.druid.mapper.UsersDao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author chenyao
 * @date 2020/11/16 15:35
 * @description
 */
@RestController
public class ValidateMybatisBillionDataQuery4Memory {

    @Autowired
    private UsersDao usersDao;
    @Autowired
    private ActiveRuleParametersDao activeRuleParametersDao;
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    @Autowired
    private LocalWebOrderDao localWebOrderDao;

    @GetMapping("/count.do")
    public long count(){
        return usersDao.countByExample(new UsersExample());
    }

    @GetMapping("/get/active.do")
    public List<ActiveRuleParameters> active(){
        return activeRuleParametersDao.selectByExample(new ActiveRuleParametersExample());
    }

    @GetMapping("/batch/get/active.do")
    public String batchActive(){
        ActiveResultHandler handler = new ActiveResultHandler();
        sqlSessionTemplate.select("org.study.ssm.druid.mapper.ActiveRuleParametersDao.selectByExample",handler);
        handler.processRemain();
        return "ok";
    }
    @GetMapping("/batch/get/webOrder.do")
    public String batchProcessLocalWebOrder(){
        LocalWebOrderResultHandler handler = new LocalWebOrderResultHandler();
        sqlSessionTemplate.select("org.study.ssm.druid.mapper.LocalWebOrderDao.selectByExample",handler);
        handler.processRemain();
        return "ok";
    }

    @GetMapping("/batch/insert.do")
    public String batchInsert(){
        List<LocalWebOrder> list = getList();
        for (int i = 0; i < 20000; i++) {
            localWebOrderDao.batchInsert(list);
        }
        return "ok";
    }
    @GetMapping("/batchSelect.do")
    public String batchSelect(){
        List<LocalWebOrder> s = localWebOrderDao.selectByExample(new LocalWebOrderExample());
        System.out.println(s.size());
        return "ok";
    }
    @GetMapping("/batchSelectSingle.do")
    public String batchSelectSingle(){
        List<String> s = localWebOrderDao.selectOrderSn();
        System.out.println(s.size());
        return "ok";
    }

    @GetMapping("/cursor/getAll.do")
    @Transactional
    public String cursorGetAll(Long index){
        LocalWebOrderExample ex = new LocalWebOrderExample();
        if(index != null){
            ex.createCriteria().andIdLessThan(index);
        }
        Cursor<LocalWebOrder> localWebOrders = localWebOrderDao.selectByCursor(ex);
        List<LocalWebOrder> list =  new ArrayList<>(1000);
        for (LocalWebOrder localWebOrder : localWebOrders) {
        }
        System.out.println(localWebOrders.getCurrentIndex());
        return "ok";
    }
    private List<LocalWebOrder> getList() {
        List<LocalWebOrder> res = new ArrayList<>(1000);
        for (int i = 0; i <1000; i++) {
            LocalWebOrder order = new LocalWebOrder();
            order.setOrderSn(UUID.randomUUID().toString());
            order.setProductName("卡还是大噶山豆根山豆根撒旦给撒大噶收到");
            order.setProductId(1000L);
            order.setProductPrice(100D);
            order.setTotalPrice(1000D);
            order.setCurrency("RMB");
            order.setCity("卡还是大噶山豆根山豆根撒旦给撒大噶收到");
            order.setArea("卡还是大噶山豆根山豆根撒旦给撒大噶收到");
            order.setCountry("卡还是大噶山豆根山豆根撒旦给撒大噶收到");
            order.setSendName("卡还是大噶山豆根山豆根撒旦给撒大噶收到");
            order.setSendNumber(100);
            order.setPhone("17710168219");
            order.setEmail("卡还是大噶山豆根山豆根撒旦给撒大噶收到");
            order.setOrderStatus(1);
            order.setOrderAmount(100);
            order.setOrderCity("卡还是大噶山豆根山豆根撒旦给撒大噶收到");
            order.setCreatTime(new Date());
            order.setUpdateTime(new Date());
            order.setIsDel(0);
            res.add(order);
        }
        return res;
    }
}
