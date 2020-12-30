package net.zsbj.dao;

import net.zsbj.config.mybatis.MyMapper;
import net.zsbj.model.RuleCategory;

import java.util.List;

public interface RuleCategoryMapper extends MyMapper<RuleCategory> {
    List<RuleCategory> selectByRepositoryId(Integer repositoryId);
}
