package net.zsbj.controller;

import net.zsbj.model.Fault;
import net.zsbj.model.Parameter;
import net.zsbj.service.intf.ParameterService;
import net.zsbj.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/zsbj")
public class ParameterController {

    @Autowired
    ParameterService parameterService;


    /**
     * 获取分页列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/parameter", method = RequestMethod.GET)
    @ResponseBody
    public Result findRuleRepositoryList(@RequestParam(value = "pageNum") Integer pageNum,
                                         @RequestParam(value = "pageSize") Integer pageSize) {
        List<Parameter> list = parameterService.findParameterList(pageNum, pageSize);
        return Result.success(list);
    }

    /**
     * 通过id获取对象
     * @param id
     * @return
     */
    @RequestMapping(value = "/parameter/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result findRuleRepositoryById(@PathVariable("id") Integer id) {
        Parameter p = parameterService.findById(id);
        return Result.success(p);
    }


    /**
     * 增加
     */
    @RequestMapping(value = "/parameter", method = RequestMethod.POST)
    @ResponseBody
    public Result add(@RequestBody Parameter p) {
        parameterService.add(p);
        return Result.success(p);
    }

    /**
     * 更新
     * @param f
     * @return
     */
    @RequestMapping(value = "/parameter/update", method = RequestMethod.POST)
    @ResponseBody
    public Result modify(@RequestBody Parameter p) {
        parameterService.modify(p);
        return Result.success(p);
    }

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/parameter/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Result remove(@PathVariable("id") Integer id) {
        parameterService.remove(id);
        return Result.success(id);
    }

    /**
     * 批量删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/parameter/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result removeList(@RequestParam("ids") String ids) {
        String[] idsString = ids.split(",");
        List<Integer> idInt = new ArrayList<Integer>();
        for (String idString : idsString
        ) {
            Integer id = Integer.valueOf(idString);
            idInt.add(id);
        }
        parameterService.removeList(idInt);
        return Result.success(idInt);
    }
}
