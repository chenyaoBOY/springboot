package org.study.ssm.druid.config;

import com.alibaba.fastjson.JSON;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.study.ssm.druid.entity.ActiveRuleParameters;
import org.study.ssm.druid.entity.LocalWebOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenyao
 * @date 2020/11/23 13:40
 * @description
 */
//@Component("activeResultHandler")
//@Scope("prototype")
public class LocalWebOrderResultHandler implements ResultHandler<LocalWebOrder>,BatchProcessInterface {
    private final static int size  = 10000;
    private static int count  = 0;
    private List<LocalWebOrder> list = new ArrayList<>(size);

    @Override
    public void handleResult(ResultContext<? extends LocalWebOrder> resultContext) {
        LocalWebOrder bean = resultContext.getResultObject();
        list.add(bean);
        if(list.size() == size){
            processBusiness();
            list.clear();
        }
    }

    private void processBusiness() {
        count++;
    }
    @Override
    public void processRemain(){
        processBusiness();
        System.out.println("总共执行次数："+count);
    }
}
