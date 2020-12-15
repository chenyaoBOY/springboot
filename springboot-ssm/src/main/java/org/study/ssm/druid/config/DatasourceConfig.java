package org.study.ssm.druid.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author chenyao
 * @date 2020/11/16 14:42
 * @description
 */
@Configuration
public class DatasourceConfig {

    @Bean
    public DataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setUsername("root");
        ds.setPassword("root");
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/local?characterEncoding=utf-8&useSSL=false");
        ds.setTestOnBorrow(false);
        ds.setTestOnReturn(false);
        ds.setTestWhileIdle(false);
        return ds;
    }
}
