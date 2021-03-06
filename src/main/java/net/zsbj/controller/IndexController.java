package net.zsbj.controller;

import net.zsbj.model.RuleRepository;
import net.zsbj.service.intf.RuleRepositoryService;
import net.zsbj.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/zsbj")
public class IndexController {


	@Autowired
	private RuleRepositoryService ruleRepositoryService;


	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public Result test(Integer platformId, Integer merchantId, String orderSn) {
		return Result.success("");
	}

}
