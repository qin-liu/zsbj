package net.zsbj.service.intf;

import net.zsbj.model.Fault;
import net.zsbj.model.RuleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FaultService {
    public List<Fault> findFaultList(Integer pageNum, Integer pageSize);
    public Fault findById(Integer id);
    public void add(Fault f);
    public void modify(Fault f);
    public void remove(Integer id);
    public void removeList(List<Integer> idList);
}
