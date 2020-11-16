package org.study.ssm.standard.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.study.ssm.standard.domain.ShopOrder;
import org.study.ssm.standard.domain.ShopOrderExample;

import java.util.List;

@Repository
public interface ShopOrderMapper {
    int countByExample(ShopOrderExample example);

    int deleteByExample(ShopOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopOrder record);

    int batchInsert(List<ShopOrder> list);

    int insertSelective(ShopOrder record);

    List<ShopOrder> selectByExample(ShopOrderExample example);

    ShopOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopOrder record, @Param("example") ShopOrderExample example);

    int updateByExample(@Param("record") ShopOrder record, @Param("example") ShopOrderExample example);

    int updateByPrimaryKeySelective(ShopOrder record);

    int updateByPrimaryKey(ShopOrder record);
}