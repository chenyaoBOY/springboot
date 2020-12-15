package org.study.ssm.druid.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.study.ssm.druid.entity.ActiveRuleParameters;
import org.study.ssm.druid.entity.ActiveRuleParametersExample;

public interface ActiveRuleParametersDao {
    long countByExample(ActiveRuleParametersExample example);

    int deleteByExample(ActiveRuleParametersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActiveRuleParameters record);

    int insertSelective(ActiveRuleParameters record);

    List<ActiveRuleParameters> selectByExample(ActiveRuleParametersExample example);

    ActiveRuleParameters selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActiveRuleParameters record, @Param("example") ActiveRuleParametersExample example);

    int updateByExample(@Param("record") ActiveRuleParameters record, @Param("example") ActiveRuleParametersExample example);

    int updateByPrimaryKeySelective(ActiveRuleParameters record);

    int updateByPrimaryKey(ActiveRuleParameters record);
}