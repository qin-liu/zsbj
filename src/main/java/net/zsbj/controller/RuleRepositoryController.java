package net.zsbj.controller;

import com.github.pagehelper.PageInfo;
import net.zsbj.model.RuleRepository;
import net.zsbj.service.intf.RuleRepositoryService;
import net.zsbj.utils.ParamParser;
import net.zsbj.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/zsbj")
public class RuleRepositoryController {

    @Autowired
    RuleRepositoryService ruleRepositoryService;

    /**
     * 获取分页列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/ruleRepositories", method = RequestMethod.GET)
    @ResponseBody
    public Result findRuleRepositoryList(@RequestParam(value = "pageNum") Integer pageNum,
                                         @RequestParam(value = "pageSize") Integer pageSize) {
        List<RuleRepository> list = ruleRepositoryService.findRuleRepositoryList(pageNum, pageSize);
        PageInfo<RuleRepository> pageInfo = new PageInfo<>(list);
        return Result.success(pageInfo);
    }

    /**
     * 根据id获取对象
     * @param id
     * @return
     */
    @RequestMapping(value = "/ruleRepository/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result findRuleRepositoryById(@PathVariable("id") Integer id) {
        RuleRepository r = ruleRepositoryService.findById(id);
        return Result.success(r);
    }

    /**
     * 新增
     * @param r
     * @return
     */
    @RequestMapping(value = "/ruleRepository", method = RequestMethod.POST)
    @ResponseBody
    public Result add(@RequestBody RuleRepository r) {
        ruleRepositoryService.add(r);
        return Result.success(r);
    }

    /**
     * 更新
     * @param r
     * @return
     */
    @RequestMapping(value = "/ruleRepository/update", method = RequestMethod.POST)
    @ResponseBody
    public Result modify(@RequestBody RuleRepository r) {
        ruleRepositoryService.modify(r);
        return Result.success(r);
    }

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/ruleRepository/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Result remove(@PathVariable("id") Integer id) {
        ruleRepositoryService.remove(id);
        return Result.success(id);
    }

    /**
     * 批量删除
     * @return
     */
    @RequestMapping(value = "/ruleRepository/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result removeList(@RequestParam("ids") String ids) {
        List<Integer> idList = ParamParser.parserParam(ids);
        ruleRepositoryService.removeList(idList);
        return Result.success(idList);
    }
}
