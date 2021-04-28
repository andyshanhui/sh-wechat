package com.shwechat.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shwechat.db.entity.ShSysUser;

@Repository
@Mapper
public interface ShSysUserMapper extends BaseMapper<ShSysUser>{

}
