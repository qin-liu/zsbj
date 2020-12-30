package net.zsbj.service.intf;

import net.zsbj.model.RuleCategory;
import net.zsbj.model.RuleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RuleCategoryService {
    public List<RuleCategory> findRuleCategoryListInRepository(Integer repositoryId);
    public RuleCategory findById(Integer id);
    public void add(RuleCategory r);
    public void modify(RuleCategory r);
    public void remove(Integer id);
    public void removeList(List<Integer> idList);
}
