package net.zsbj.controller;

import com.github.pagehelper.PageInfo;
import net.zsbj.model.RuleCategory;
import net.zsbj.model.RuleRepository;
import net.zsbj.service.intf.RuleCategoryService;
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
public class RuleCategoryController {
    @Autowired
    RuleCategoryService ruleCategoryService;

    /**
     * 查找知识库下的所有分类
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/ruleCategories/{repositoryId}", method = RequestMethod.GET)
    @ResponseBody
    public Result findRuleCategoryListInRuleRepository(@PathVariable(value = "repositoryId") Integer repositoryId) {
        List<RuleCategory> list = ruleCategoryService.findRuleCategoryListInRepository(repositoryId);
        PageInfo<RuleCategory> pageInfo = new PageInfo<>(list);
        return Result.success(pageInfo);
    }

    /**
     * 根据id获取对象
     * @param id
     * @return
     */
    @RequestMapping(value = "/ruleCategory/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result findRuleRepositoryById(@PathVariable("id") Integer id) {
        RuleCategory r = ruleCategoryService.findById(id);
        return Result.success(r);
    }

    /**
     * 新增
     * @param r
     * @return
     */
    @RequestMapping(value = "/ruleCategory", method = RequestMethod.POST)
    @ResponseBody
    public Result add(@RequestBody RuleCategory r) {
        ruleCategoryService.add(r);
        return Result.success(r);
    }

    /**
     * 更新
     * @param r
     * @return
     */
    @RequestMapping(value = "/ruleCategory/update", method = RequestMethod.POST)
    @ResponseBody
    public Result modify(@RequestBody RuleCategory r) {
        ruleCategoryService.modify(r);
        return Result.success(r);
    }

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/ruleCategory/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Result remove(@PathVariable("id") Integer id) {
        ruleCategoryService.remove(id);
        return Result.success(id);
    }

    /**
     * 批量删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/ruleCategory/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result removeList(@RequestParam("ids") String ids) {
        List<Integer> idList = ParamParser.parserParam(ids);
        ruleCategoryService.removeList(idList);
        return Result.success(idList);
    }
}
