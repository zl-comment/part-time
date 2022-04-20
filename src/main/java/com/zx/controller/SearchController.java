package com.zx.controller;

import com.zx.service.SearchService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;


@Controller("SearchController")
@SessionAttributes("user")
public class SearchController {
    @Resource
    private SearchService searchService;

    public SearchService getSearchService() {
        return searchService;
    }

    public void setSearchService(SearchService searchService) {
        this.searchService = searchService;
    }

    @RequestMapping("search")
    public @ResponseBody Object
    search(String data, String ocname, String salary, String requirement){
        System.out.println("搜索"+data);
        System.out.println("搜索"+ocname);
        System.out.println("搜索"+salary);
        System.out.println("搜索"+requirement);

       return searchService.search(data, ocname, salary, requirement,1);
    }

}
