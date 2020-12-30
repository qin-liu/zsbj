package net.zsbj.service.impl;

import com.github.pagehelper.PageHelper;
import net.zsbj.dao.RuleCategoryMapper;
import net.zsbj.model.RuleCategory;
import net.zsbj.service.intf.RuleCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RuleCategoryServiceImpl implements RuleCategoryService {
    @Autowired
    RuleCategoryMapper ruleCategoryMapper;

    public List<RuleCategory> findRuleCategoryListInRepository(Integer repositoryId)
    {
        return ruleCategoryMapper.selectByRepositoryId(repositoryId);
    }

    public RuleCategory findById(Integer id)
    {
        return ruleCategoryMapper.selectByPrimaryKey(id);
    }

    public void add(RuleCategory r)
    {
        ruleCategoryMapper.insert(r);
    }

    public void modify(RuleCategory r)
    {
        ruleCategoryMapper.updateByPrimaryKeySelective(r);
    }

    @Transactional
    public void remove(Integer id)
    {
        ruleCategoryMapper.deleteByPrimaryKey(id);
    }

    @Transactional
    public void removeList(List<Integer> idList)
    {
        ruleCategoryMapper.removeList(idList);
    }
}
