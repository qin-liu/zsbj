package net.zsbj.dao;

import net.zsbj.config.mybatis.MyMapper;
import net.zsbj.model.Rule;

import java.util.List;

public interface RuleMapper extends MyMapper<Rule> {

    List<Rule> selectByRuleCategoryId(Integer categoryID);

}
