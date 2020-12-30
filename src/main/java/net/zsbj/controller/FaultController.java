package net.zsbj.controller;

import net.zsbj.model.Fault;
import net.zsbj.service.intf.FaultService;
import net.zsbj.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/zsbj")
public class FaultController {
    @Autowired
    FaultService faultService;

    /**
     * 获取分页列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/fault", method = RequestMethod.GET)
    @ResponseBody
    public Result findRuleRepositoryList(@RequestParam(value = "pageNum") Integer pageNum,
                                         @RequestParam(value = "pageSize") Integer pageSize) {
        List<Fault> list = faultService.findFaultList(pageNum, pageSize);
        return Result.success(list);
    }

    /**
     * 通过id获取对象
     * @param id
     * @return
     */
    @RequestMapping(value = "/fault/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result findRuleRepositoryById(@PathVariable("id") Integer id) {
        Fault f = faultService.findById(id);
        return Result.success(f);
    }


    /**
     * 增加
     */
    @RequestMapping(value = "/fault", method = RequestMethod.POST)
    @ResponseBody
    public Result add(@RequestBody Fault f) {
        faultService.add(f);
        return Result.success(f);
    }

    /**
     * 更新
     * @param f
     * @return
     */
    @RequestMapping(value = "/fault/update", method = RequestMethod.POST)
    @ResponseBody
    public Result modify(@RequestBody Fault f) {
        faultService.modify(f);
        return Result.success("");
    }

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/fault/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Result remove(@PathVariable("id") Integer id) {
        faultService.remove(id);
        return Result.success("");
    }

    /**
     * 批量删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/fault/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result removeList(@RequestParam("ids") String ids) {
        String[] idsString = ids.split(",");
        List<Integer> idInt = new ArrayList<>();
        for (String idString : idsString
        ) {
            Integer id = Integer.valueOf(idString);
            idInt.add(id);
        }
        faultService.removeList(idInt);
        return Result.success("");
    }

}
