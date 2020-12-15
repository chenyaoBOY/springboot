package org.study.ssm.druid.config;

/**
 * @author chenyao
 * @date 2020/11/23 13:51
 * @description
 */
public interface BatchProcessInterface {

    /**
     * 处理集合中剩余不足size的部分
     */
    void processRemain();
}
