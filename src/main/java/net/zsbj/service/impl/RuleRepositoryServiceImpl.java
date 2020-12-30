package net.zsbj.service.impl;

import com.github.pagehelper.PageHelper;
import net.zsbj.dao.RuleRepositorysMapper;
import net.zsbj.model.RuleRepository;
import net.zsbj.service.intf.RuleRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RuleRepositoryServiceImpl implements  RuleRepositoryService {
    @Autowired
    RuleRepositorysMapper ruleRepositorysMapper;

    public List<RuleRepository> findRuleRepositoryList(Integer pageNum, Integer pageSize)
    {
        PageHelper.startPage(pageNum, pageSize);
        return ruleRepositorysMapper.selectAll();
    }

    public RuleRepository findById(Integer id)
    {
        return ruleRepositorysMapper.selectByPrimaryKey(id);
    }

    public void add(RuleRepository r)
    {
        ruleRepositorysMapper.insert(r);
    }

    public void modify(RuleRepository r)
    {
        ruleRepositorysMapper.updateByPrimaryKeySelective(r);
    }

    @Transactional
    public void remove(Integer id)
    {
        ruleRepositorysMapper.deleteByPrimaryKey(id);
    }

    @Transactional
    public void removeList(List<Integer> idList)
    {
        ruleRepositorysMapper.removeList(idList);
    }
}
