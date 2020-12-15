package org.study.ssm.druid.config;

import com.alibaba.fastjson.JSON;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.study.ssm.druid.entity.ActiveRuleParameters;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenyao
 * @date 2020/11/23 13:40
 * @description
 */
//@Component("activeResultHandler")
//@Scope("prototype")
public class ActiveResultHandler implements ResultHandler<ActiveRuleParameters>,BatchProcessInterface {
    private final static int size  = 10;
    private List<ActiveRuleParameters> list = new ArrayList<>(size);

    @Override
    public void handleResult(ResultContext<? extends ActiveRuleParameters> resultContext) {
        ActiveRuleParameters bean = resultContext.getResultObject();
        list.add(bean);
        if(list.size() == size){
            processBusiness();
            list.clear();
        }
    }

    private void processBusiness() {
        System.out.println(JSON.toJSONString(list.get(0)));
    }
    @Override
    public void processRemain(){
        processBusiness();
    }
}
