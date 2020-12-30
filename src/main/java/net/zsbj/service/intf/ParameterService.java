package net.zsbj.service.intf;

import net.zsbj.model.Fault;
import net.zsbj.model.Parameter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ParameterService {
    public List<Parameter> findParameterList(Integer pageNum, Integer pageSize);
    public Parameter findById(Integer id);
    public void add(Parameter f);
    public void modify(Parameter f);
    public void remove(Integer id);
    public void removeList(List<Integer> idList);
}
