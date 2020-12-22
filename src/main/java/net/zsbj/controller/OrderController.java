package net.zsbj.controller;

import net.zsbj.model.RuleRepository;
import net.zsbj.service.intf.RuleRepositoryService;
import net.zsbj.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
@RequestMapping("/1")
public class OrderController {


	@Autowired
	private RuleRepositoryService ruleRepositoryService;


	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public Result test(Integer platformId, Integer merchantId, String orderSn) {
		List<RuleRepository> list = ruleRepositoryService.findRuleRepositoryList();
		return Result.success(list);
	}
}
