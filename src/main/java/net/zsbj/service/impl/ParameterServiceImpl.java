package net.zsbj.service.impl;

import com.github.pagehelper.PageHelper;
import net.zsbj.dao.ParameterMapper;
import net.zsbj.model.Parameter;
import net.zsbj.service.intf.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ParameterServiceImpl implements ParameterService {
    @Autowired
    ParameterMapper parameterMapper;

    public List<Parameter> findParameterList(Integer pageNum, Integer pageSize)
    {
        PageHelper.startPage(pageNum, pageSize);
        return parameterMapper.selectAll();
    }

    public Parameter findById(Integer id)
    {
        return parameterMapper.selectByPrimaryKey(id);
    }

    public void add(Parameter r)
    {
        parameterMapper.insert(r);
    }

    public void modify(Parameter r)
    {
        parameterMapper.updateByPrimaryKeySelective(r);
    }

    @Transactional
    public void remove(Integer id)
    {
        parameterMapper.deleteByPrimaryKey(id);
    }

    @Transactional
    public void removeList(List<Integer> idList)
    {
        parameterMapper.removeList(idList);
    }
}
