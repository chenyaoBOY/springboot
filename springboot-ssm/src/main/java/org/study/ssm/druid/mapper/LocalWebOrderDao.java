package org.study.ssm.druid.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.cursor.Cursor;
import org.study.ssm.druid.entity.LocalWebOrder;
import org.study.ssm.druid.entity.LocalWebOrderExample;

public interface LocalWebOrderDao {
    long countByExample(LocalWebOrderExample example);

    int deleteByExample(LocalWebOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LocalWebOrder record);

    int insertSelective(LocalWebOrder record);

    List<LocalWebOrder> selectByExample(LocalWebOrderExample example);

    Cursor<LocalWebOrder> selectByCursor(LocalWebOrderExample example);


    LocalWebOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LocalWebOrder record, @Param("example") LocalWebOrderExample example);

    int updateByExample(@Param("record") LocalWebOrder record, @Param("example") LocalWebOrderExample example);

    int updateByPrimaryKeySelective(LocalWebOrder record);

    int updateByPrimaryKey(LocalWebOrder record);

    void batchInsert(List<LocalWebOrder> list);

    List<String> selectOrderSn();
}