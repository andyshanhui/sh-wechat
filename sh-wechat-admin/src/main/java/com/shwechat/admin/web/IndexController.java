package com.shwechat.admin.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/index")
public class IndexController {
	
//	private final Log logger = LogFactory.get(IndexController.class);
	
    @RequestMapping("/index")
    public Object index() {
        return "hello world, this is admin service";
    }

}
