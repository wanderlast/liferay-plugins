/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.knowledgebase.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * <p>
 * This interface is a model that represents the KB_Article table in the
 * database.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       Article
 * @see       com.liferay.knowledgebase.model.impl.ArticleImpl
 * @see       com.liferay.knowledgebase.model.impl.ArticleModelImpl
 * @generated
 */
public interface ArticleModel extends BaseModel<Article> {
	public long getPrimaryKey();

	public void setPrimaryKey(long pk);

	@AutoEscape
	public String getUuid();

	public void setUuid(String uuid);

	public long getArticleId();

	public void setArticleId(long articleId);

	public long getResourcePrimKey();

	public void setResourcePrimKey(long resourcePrimKey);

	public long getGroupId();

	public void setGroupId(long groupId);

	public long getCompanyId();

	public void setCompanyId(long companyId);

	public long getUserId();

	public void setUserId(long userId);

	public String getUserUuid() throws SystemException;

	public void setUserUuid(String userUuid);

	@AutoEscape
	public String getUserName();

	public void setUserName(String userName);

	public Date getCreateDate();

	public void setCreateDate(Date createDate);

	public Date getModifiedDate();

	public void setModifiedDate(Date modifiedDate);

	public long getParentResourcePrimKey();

	public void setParentResourcePrimKey(long parentResourcePrimKey);

	public int getVersion();

	public void setVersion(int version);

	@AutoEscape
	public String getTitle();

	public void setTitle(String title);

	@AutoEscape
	public String getContent();

	public void setContent(String content);

	@AutoEscape
	public String getDescription();

	public void setDescription(String description);

	public int getPriority();

	public void setPriority(int priority);

	public Article toEscapedModel();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Article article);

	public int hashCode();

	public String toString();

	public String toXmlString();
}