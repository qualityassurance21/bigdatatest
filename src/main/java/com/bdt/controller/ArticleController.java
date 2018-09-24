package com.bdt.controller;

import com.bdt.entity.Article;
import com.bdt.form.BaseBackList;
import com.bdt.service.ArticleService;
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
public class ArticleController {

    private final static Logger logger = LoggerFactory.getLogger(ArticleController.class);

    @Resource
    public ArticleService articleService;

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

    @ApiOperation(value = "文章全量查询", response = com.bdt.entity.Article.class, responseContainer = "article")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list")})

    @ResponseBody
    @RequestMapping(value="/articleQryAll", method = RequestMethod.GET)
    public BaseBackList queryAll() {
        BaseBackList backList = new BaseBackList();
        backList.setList(articleService.queryAll());
        backList.setSuccess();
        return backList;
    }

    @ApiOperation(value = "文章模糊查询")
    @ResponseBody
    @RequestMapping(value="/articleBlurSearch", method = RequestMethod.POST)
    public BaseBackList artilceBlurSearch(@RequestParam(value="title", required = true) String title) {
        BaseBackList backList = new BaseBackList();
        backList.setList(articleService.blurSearch(title));
        backList.setSuccess();
        return backList;
    }

    @ApiOperation(value = "文章分页查询")
    @ResponseBody
    @RequestMapping(value="/articleSearchByPage", method = RequestMethod.POST)
    public BaseBackList searchByPage(@RequestParam(required = true) int n) {
        BaseBackList backList = new BaseBackList();
        backList.setList(articleService.searchByPage(n));
        backList.setCurrent_page(1);
        backList.setTotal_sum((articleService.searchByPage(n)).size());
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


