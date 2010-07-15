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

package com.liferay.mail.model.impl;

import com.liferay.mail.model.Folder;
import com.liferay.mail.model.FolderModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.Date;

/**
 * <p>
 * This interface is a model that represents the Mail_Folder table in the
 * database.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       FolderImpl
 * @see       com.liferay.mail.model.Folder
 * @see       com.liferay.mail.model.FolderModel
 * @generated
 */
public class FolderModelImpl extends BaseModelImpl<Folder>
	implements FolderModel {
	public static final String TABLE_NAME = "Mail_Folder";
	public static final Object[][] TABLE_COLUMNS = {
			{ "folderId", new Integer(Types.BIGINT) },
			{ "companyId", new Integer(Types.BIGINT) },
			{ "userId", new Integer(Types.BIGINT) },
			{ "userName", new Integer(Types.VARCHAR) },
			{ "createDate", new Integer(Types.TIMESTAMP) },
			{ "modifiedDate", new Integer(Types.TIMESTAMP) },
			{ "accountId", new Integer(Types.BIGINT) },
			{ "fullName", new Integer(Types.VARCHAR) },
			{ "displayName", new Integer(Types.VARCHAR) },
			{ "remoteMessageCount", new Integer(Types.INTEGER) }
		};
	public static final String TABLE_SQL_CREATE = "create table Mail_Folder (folderId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,accountId LONG,fullName VARCHAR(75) null,displayName VARCHAR(75) null,remoteMessageCount INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table Mail_Folder";
	public static final String ORDER_BY_JPQL = " ORDER BY folder.fullName ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Mail_Folder.fullName ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.mail.model.Folder"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.mail.model.Folder"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.mail.model.Folder"));

	public FolderModelImpl() {
	}

	public long getPrimaryKey() {
		return _folderId;
	}

	public void setPrimaryKey(long pk) {
		setFolderId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_folderId);
	}

	public long getFolderId() {
		return _folderId;
	}

	public void setFolderId(long folderId) {
		_folderId = folderId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getAccountId() {
		return _accountId;
	}

	public void setAccountId(long accountId) {
		_accountId = accountId;

		if (!_setOriginalAccountId) {
			_setOriginalAccountId = true;

			_originalAccountId = accountId;
		}
	}

	public long getOriginalAccountId() {
		return _originalAccountId;
	}

	public String getFullName() {
		if (_fullName == null) {
			return StringPool.BLANK;
		}
		else {
			return _fullName;
		}
	}

	public void setFullName(String fullName) {
		_fullName = fullName;

		if (_originalFullName == null) {
			_originalFullName = fullName;
		}
	}

	public String getOriginalFullName() {
		return GetterUtil.getString(_originalFullName);
	}

	public String getDisplayName() {
		if (_displayName == null) {
			return StringPool.BLANK;
		}
		else {
			return _displayName;
		}
	}

	public void setDisplayName(String displayName) {
		_displayName = displayName;
	}

	public int getRemoteMessageCount() {
		return _remoteMessageCount;
	}

	public void setRemoteMessageCount(int remoteMessageCount) {
		_remoteMessageCount = remoteMessageCount;
	}

	public Folder toEscapedModel() {
		if (isEscapedModel()) {
			return (Folder)this;
		}
		else {
			return (Folder)Proxy.newProxyInstance(Folder.class.getClassLoader(),
				new Class[] { Folder.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					Folder.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		FolderImpl clone = new FolderImpl();

		clone.setFolderId(getFolderId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setAccountId(getAccountId());
		clone.setFullName(getFullName());
		clone.setDisplayName(getDisplayName());
		clone.setRemoteMessageCount(getRemoteMessageCount());

		return clone;
	}

	public int compareTo(Folder folder) {
		int value = 0;

		value = getFullName().compareTo(folder.getFullName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		Folder folder = null;

		try {
			folder = (Folder)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = folder.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{folderId=");
		sb.append(getFolderId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", accountId=");
		sb.append(getAccountId());
		sb.append(", fullName=");
		sb.append(getFullName());
		sb.append(", displayName=");
		sb.append(getDisplayName());
		sb.append(", remoteMessageCount=");
		sb.append(getRemoteMessageCount());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.liferay.mail.model.Folder");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>folderId</column-name><column-value><![CDATA[");
		sb.append(getFolderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accountId</column-name><column-value><![CDATA[");
		sb.append(getAccountId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullName</column-name><column-value><![CDATA[");
		sb.append(getFullName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>displayName</column-name><column-value><![CDATA[");
		sb.append(getDisplayName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remoteMessageCount</column-name><column-value><![CDATA[");
		sb.append(getRemoteMessageCount());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _folderId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _accountId;
	private long _originalAccountId;
	private boolean _setOriginalAccountId;
	private String _fullName;
	private String _originalFullName;
	private String _displayName;
	private int _remoteMessageCount;
	private transient ExpandoBridge _expandoBridge;
}