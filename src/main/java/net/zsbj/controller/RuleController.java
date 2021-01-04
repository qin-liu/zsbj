package net.zsbj.controller;

import com.github.pagehelper.PageInfo;
import net.zsbj.model.Rule;
import net.zsbj.service.intf.RuleService;
import net.zsbj.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import net.zsbj.utils.ParamParser;

@Controller
@RequestMapping("/zsbj")
public class RuleController {
    @Autowired
    RuleService ruleService;

    @RequestMapping(value = "/rules", method = RequestMethod.GET)

    @ResponseBody
    public Result findRuleList(@RequestParam(value = "pageNum") Integer pageNum,
                               @RequestParam(value = "pageSize") Integer pageSize) {
        List<Rule> list = ruleService.findRuleList(pageNum, pageSize);
        PageInfo<Rule> pageInfo = new PageInfo<>(list);
        return Result.success(pageInfo);
    }

    @RequestMapping(value = "/rules/{ruleCategoryId}", method = RequestMethod.GET)

    @ResponseBody
    public Result findRuleListByCategoryId(@PathVariable(value = "ruleCategoryId") Integer ruleCategoryId) {
        List<Rule> list = ruleService.findByCategoryId(ruleCategoryId);
        return Result.success(list);
    }

    @RequestMapping(value = "/rule/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result findRuleById(@PathVariable("id") Integer id) {
        Rule r = ruleService.findById(id);
        return Result.success(r);
    }

    @RequestMapping(value = "/rule", method = RequestMethod.POST)
    @ResponseBody
    public Result add(@RequestBody Rule r) {
        ruleService.add(r);
        return Result.success("");
    }

    @RequestMapping(value = "/rule/update", method = RequestMethod.POST)
    @ResponseBody
    public Result modify(@RequestBody Rule r) {
        ruleService.modify(r);
        return Result.success("");
    }

    @RequestMapping(value = "/rule/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Result remove(@PathVariable("id") Integer id) {
        ruleService.remove(id);
        return Result.success(id);
    }

    /**
     * 批量删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/rule/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result removeList(@RequestParam("ids") String ids) {
        ruleService.removeList(ParamParser.parserParam(ids));
        return Result.success("");
    }
}
