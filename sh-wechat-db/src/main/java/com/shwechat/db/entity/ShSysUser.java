package com.shwechat.db.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * 
 * @ClassName: ShSysUser
 * @Description: 系统用户
 * @author zhush
 * @Email andycabbage@163.com
 * @date 2021-04-24 04:10:41
 */
@Data
@TableName("sh_sys_user")
public class ShSysUser extends BaseEntity {
	
	@TableId
	private long id;
	
	// 用户账号
	private String username;
	
	// 用户昵称
	private String nickname;
	
	// 用户密码
	private String password;
	
	// 用户性别（0男 1女 2未知）
	private String sex;
	
	// 头像图片
	private String avatar;
	
	// 帐号状态（0正常 1停用）
	private String status;
	
	// 最近一次登录IP地址
	private String lastLoginIp;
	
	// 最近一次登录时间
	private LocalDateTime lastLoginTime;
	
	// 删除标志（0代表存在 1代表删除）
	private String deleted;
	
	// 备注
	private String remark;
	
}
