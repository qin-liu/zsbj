package net.zsbj.service.intf;

import net.zsbj.model.RuleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RuleRepositoryService {
    public List<RuleRepository> findRuleRepositoryList();

}
