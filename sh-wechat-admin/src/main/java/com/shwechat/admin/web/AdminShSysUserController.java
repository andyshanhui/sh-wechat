package com.shwechat.admin.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shwechat.db.entity.ShSysUser;
import com.shwechat.db.service.ShSysUserService;

@RestController
@RequestMapping("/admin/sysuser")
public class AdminShSysUserController {
	
	@Autowired
	private ShSysUserService userService;
	
	@GetMapping("/create")
	public Object create() {
		ShSysUser user = new ShSysUser();
		user.setUsername("Daneil");
		user.setNickname("Daneil");
		user.setPassword("123456");
		boolean b = userService.save(user);
		if (b) {
			System.out.println("add success");
		} else {
			System.out.println("add fail");
		}
		return null;
	}

}
