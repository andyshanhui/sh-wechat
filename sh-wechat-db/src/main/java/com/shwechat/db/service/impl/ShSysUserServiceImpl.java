package com.shwechat.db.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shwechat.db.entity.ShSysUser;
import com.shwechat.db.mapper.ShSysUserMapper;
import com.shwechat.db.service.ShSysUserService;

@Service
public class ShSysUserServiceImpl extends ServiceImpl<ShSysUserMapper, ShSysUser> implements ShSysUserService{

}
