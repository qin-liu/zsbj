package net.zsbj.service.impl;

import com.github.pagehelper.PageHelper;
import net.zsbj.dao.RuleMapper;
import net.zsbj.model.Rule;
import net.zsbj.service.intf.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RuleServiceImpl implements RuleService {
	@Autowired
	private RuleMapper ruleMapper;

	public List<Rule> findRuleList(Integer pageNum, Integer pageSize)
	{
		PageHelper.startPage(pageNum, pageSize);
		return ruleMapper.selectAll();
	}
	public Rule findById(Integer id)
	{
		return ruleMapper.selectByPrimaryKey(id);
	}
	public void add(Rule r)
	{
		ruleMapper.insert(r);
	}

	public void modify(Rule r)
	{
		ruleMapper.updateByPrimaryKey(r);
	}

	@Transactional
	public void remove(Integer id)
	{
		ruleMapper.deleteByPrimaryKey(id);
	}

	@Transactional
	public void removeList(List<Integer> idList)
	{
		ruleMapper.removeList(idList);
	}
	
}
