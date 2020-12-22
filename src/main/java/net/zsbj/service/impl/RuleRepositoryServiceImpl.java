package net.zsbj.service.impl;

import net.zsbj.dao.RuleRepositorysMapper;
import net.zsbj.model.RuleRepository;
import net.zsbj.service.intf.RuleRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuleRepositoryServiceImpl implements  RuleRepositoryService {
    @Autowired
    RuleRepositorysMapper ruleRepositoryMapper;

    public List<RuleRepository> findRuleRepositoryList()
    {
        return ruleRepositoryMapper.selectAll();
    }
}
