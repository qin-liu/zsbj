package net.zsbj.service.intf;

import net.zsbj.model.Rule;
import net.zsbj.model.RuleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RuleService {
    public List<Rule> findRuleList(Integer pageNum, Integer pageSize);
    public Rule findById(Integer id);
    public void add(Rule r);
    public void modify(Rule r);
    public void remove(Integer id);
    public void removeList(List<Integer> idList);
}
