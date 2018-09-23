package com.bdt.controller;

import com.bdt.entity.Operator;
import com.bdt.form.BaseBackList;
import com.bdt.service.OperatorService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;

import static springfox.documentation.builders.PathSelectors.regex;

@CrossOrigin
@RequestMapping("/api")
@RestController
@EnableSwagger2
public class OperatorController {

	private final static Logger logger = LoggerFactory.getLogger(OperatorController.class);

	@Resource
	public OperatorService operatorService;
	
	@Bean
	public Docket demoApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.bdt.controller")).paths(regex("/api.*")).build()
				.apiInfo(metaData());
	}

	private ApiInfo metaData() {
		ApiInfo apiInfo = new ApiInfo("Spring Boot REST API Demo by Torre Yang", "Spring Boot REST API for Simple Demo", "1.0",
				"termsOfServiceUrl",
				new Contact("Torre Yang", "https://github.com/Testworm/",
						"klyweiwei@163.com"),
				"Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0");
		return apiInfo;
	}
	
	@ApiOperation(value = "查询", response = com.bdt.entity.Operator.class, responseContainer = "operator")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })

	@ResponseBody
	@RequestMapping(value="/operatorQryAll", method = RequestMethod.GET)
	public BaseBackList queryAll() {
		BaseBackList backList = new BaseBackList();
		backList.setList(operatorService.queryAll());
		backList.setSuccess();
		return backList;
	}

//	@ApiOperation(value = "以基金名字查询")
//	@ResponseBody
//	@RequestMapping(value = "/func_queryFund", method = RequestMethod.POST)
//	public BaseBackList queryByFund(@RequestParam(value = "基金", required = true) String fund){
//		BaseBackList baseBackList = new BaseBackList();
//		baseBackList.setList(operatorService.queryByFundName(fund));
//		baseBackList.setSuccess();
//		baseBackList.setTotal_sum((operatorService.queryByFundName(fund)).size());
//		logger.info("执行func_queryFund");
//		return baseBackList;
//	}


}

