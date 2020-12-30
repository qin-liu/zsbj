package net.zsbj.service.intf;

import net.zsbj.model.RuleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RuleRepositoryService {
    public List<RuleRepository> findRuleRepositoryList(Integer pageNum, Integer pageSize);
    public RuleRepository findById(Integer id);
    public void add(RuleRepository r);
    public void modify(RuleRepository r);
    public void remove(Integer id);
    public void removeList(List<Integer> idList);

}
