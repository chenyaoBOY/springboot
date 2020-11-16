package org.study.ssm.druid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.study.ssm.standard.SpringbootSSM;


/**
 * @author chenyao
 * @date 2020/11/16 14:41
 * @description 模拟当数据库主动断开连接时  druid会报什么错误
 *  1当数据库直接关闭服务时：
 *  com.mysql.jdbc.exceptions.jdbc4.CommunicationsException: Communications link failure
 *  Software caused connection abort: recv failed
 *  The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server
 *  Connection refused: connect
 *  会不断重试连接
 *
 *  2当jdbc连接时长超过数据库设置的 wait_timeout参数 并在期间没有数据库操作，
 *  java.net.SocketException: Software caused connection abort: socket write error
 */
@SpringBootApplication
@MapperScan("org.study.ssm.druid.mapper")
public class DruidApp {

    public static void main(String[] args) {
        SpringApplication.run(DruidApp.class, args);
    }

}
