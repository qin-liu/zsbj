package net.zsbj.service.impl;

import com.github.pagehelper.PageHelper;
import net.zsbj.dao.FaultMapper;
import net.zsbj.model.Fault;
import net.zsbj.service.intf.FaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FaultServiceImpl implements FaultService {

    @Autowired
    FaultMapper faultMapper;

    public List<Fault> findFaultList(Integer pageNum, Integer pageSize)
    {
        PageHelper.startPage(pageNum, pageSize);
        return faultMapper.selectAll();
    }

    public Fault findById(Integer id)
    {
        return faultMapper.selectByPrimaryKey(id);
    }

    public void add(Fault r)
    {
        faultMapper.insert(r);
    }

    public void modify(Fault r)
    {
        faultMapper.updateByPrimaryKeySelective(r);
    }

    @Transactional
    public void remove(Integer id)
    {
        faultMapper.deleteByPrimaryKey(id);
    }

    @Transactional
    public void removeList(List<Integer> idList)
    {
        faultMapper.removeList(idList);
    }
}
