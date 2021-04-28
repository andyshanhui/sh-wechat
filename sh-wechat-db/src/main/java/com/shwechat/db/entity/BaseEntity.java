package com.shwechat.db.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @ClassName: BaseEntity
 * @Description: TODO(描述)
 * @author zhush
 * @Email andycabbage@163.com
 * @date 2021-04-24 04:11:11
 */
@Getter
@Setter
public class BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	// 创建者
	private String creator;
	
	// 创建时间
	@TableField(fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private LocalDateTime createTime;
	
	// 更新者
	private String regenerator;
	
	// 更新时间
	private LocalDateTime updateTime;

}
