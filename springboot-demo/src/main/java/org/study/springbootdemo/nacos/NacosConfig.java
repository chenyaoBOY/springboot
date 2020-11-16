package org.study.springbootdemo.nacos;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenyao
 * @date 2019/12/5 18:28
 * @description
 */
@RestController
@RequestMapping("/nacos")
public class NacosConfig {
    /**
     * 需要和  @NacosPropertySource(dataId = "first",autoRefreshed = true) 配合使用
     * @see NacosApp
     * 如果nacos控制台 连接不上 这里注入就会报错 项目启动不了
     * autoRefreshed支持刷新
     */
//    @NacosValue(value = "${nacos.name}",autoRefreshed = true)
    private String nacosValue;

    @RequestMapping("/port")
    public String getConfig(){

        return nacosValue;
    }

}
