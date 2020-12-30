package net.zsbj.controller;

import net.zsbj.model.Rule;
import net.zsbj.service.intf.RuleService;
import net.zsbj.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/zsbj")
public class RuleController {
    @Autowired
    RuleService ruleService;

    @RequestMapping(value = "/rules", method = RequestMethod.GET)

    @ResponseBody
    public Result findRuleRepositoryList(@RequestParam(value = "pageNum") Integer pageNum,
                                         @RequestParam(value = "pageSize") Integer pageSize) {
        List<Rule> list = ruleService.findRuleList(pageNum, pageSize);
        return Result.success(list);
    }

    @RequestMapping(value = "/rule/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result findRuleRepositoryById(@PathVariable("id") Integer id) {
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
    public Result modify(Rule r) {
        ruleService.modify(r);
        return Result.success("");
    }

    @RequestMapping(value = "/rule/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Result remove(@PathVariable("id") Integer id) {
        ruleService.remove(id);
        return Result.success("");
    }

    /**
     * 批量删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/rule/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result removeList(@RequestParam("ids") String ids) {
        String[] idsString = ids.split(",");
        List<Integer> idInt = new ArrayList<Integer>();
        for (String idString : idsString
        ) {
            Integer id = Integer.valueOf(idString);
            idInt.add(id);
        }
        ruleService.removeList(idInt);
        return Result.success("");
    }
}
