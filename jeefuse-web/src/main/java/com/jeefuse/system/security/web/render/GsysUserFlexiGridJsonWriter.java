/**
 * Copyright (c) 2009-2013 jeefuse.com, Licensed under GPL (the "License")
 * Email:yonclv@gmail.com
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.jeefuse.system.security.web.render;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;

import com.jeefuse.base.modules.json.FlexidGridJsonWriter;
import com.jeefuse.base.utils.page.Page;
import com.jeefuse.system.security.model.GsysUser;
import com.jeefuse.system.security.model.parse.GsysUserField;

/**
 * 输出GsysUser FlexiGrid json格式数据.
 * 
 * @author yonclv
 * @generated
 */
public class GsysUserFlexiGridJsonWriter extends FlexidGridJsonWriter<GsysUser> {

	/** @generated */
	public GsysUserFlexiGridJsonWriter(Page<GsysUser> page) {
			super(page);
	}

	/** @generated */
	public GsysUserFlexiGridJsonWriter(int pageNo, long total, List<GsysUser> items) {
		super(pageNo, total, items);
	}

	/** @generated */
	@Override
	protected void writeJsonModel(JsonGenerator g, GsysUser model) throws JsonProcessingException, IOException {
		g.writeStringField(GsysUserField.id.getFieldName(),model.getId());//1 id
		g.writeStringField(GsysUserField.username.getFieldName(),model.getUsername());//2 username
		g.writeStringField(GsysUserField.createTime.getFieldName(), model.getCreateTimeToStr());//3 createTime
		g.writeStringField(GsysUserField.email.getFieldName(),model.getEmail());//4 email
		g.writeStringField(GsysUserField.enabled.getFieldName(), model.getEnabled());//5 enabled
		g.writeStringField(GsysUserField.level.getFieldName(),model.getLevel());//6 level
		g.writeStringField(GsysUserField.loginName.getFieldName(),model.getLoginName());//7 loginName
		//		g.writeStringField(GsysUserField.password.getFieldName(),model.getPassword());//9 password
		g.writeStringField(GsysUserField.remark.getFieldName(),model.getRemark());//10 remark
		g.writeStringField(GsysUserField.sex.getFieldName(),model.getSex());//11 sex
		g.writeStringField(GsysUserField.telephone.getFieldName(),model.getTelephone());//12 telephone
		g.writeStringField(GsysUserField.updateTime.getFieldName(), model.getUpdateTimeToStr());//13 updateTime
		g.writeStringField(GsysUserField.lastLoginTime.getFieldName(), model.getLastLoginTimeToStr());//14 lastLoginTime
	}

}