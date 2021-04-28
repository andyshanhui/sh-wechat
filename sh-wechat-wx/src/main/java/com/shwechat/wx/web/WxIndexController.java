package com.shwechat.wx.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wx/index")
public class WxIndexController {
	
	@GetMapping("/index")
	public Object getIndex() {
		return "The Zhush WeChat management system has been set up successfully";
	}

}
