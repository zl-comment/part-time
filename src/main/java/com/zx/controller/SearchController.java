package com.zx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller("SearchController")
public class SearchController {
    @RequestMapping("search")
    public void search(String data,String ocname,String salary){

        System.out.println("搜索"+data);
        System.out.println("搜索"+ocname);

    }

}
