package com.neu.dao.provider;

import com.neu.pojo.Provider;

import java.sql.Connection;
import java.util.List;

/**
 * @author BlankSpace
 */
public interface ProviderDao {

	/**
	 * 增加供应商
	 * @param connection
	 * @param provider
	 * @return
	 * @throws Exception
	 */
	int add(Connection connection, Provider provider)throws Exception;


	/**
	 * 通过供应商名称、编码获取供应商列表-模糊查询-providerList
	 * @param connection
	 * @param proName
	 * @return
	 * @throws Exception
	 */
	List<Provider> getProviderList(Connection connection, String proName, String proCode)throws Exception;

	/**
	 * 通过proId删除Provider
	 * @param delId
	 * @return
	 * @throws Exception
	 */
	int deleteProviderById(Connection connection, String delId)throws Exception;


	/**
	 * 通过proId获取Provider
	 * @param connection
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Provider getProviderById(Connection connection, String id)throws Exception;

	/**
	 * 修改用户信息
	 * @param connection
	 * @param
	 * @return
	 * @throws Exception
	 */
	int modify(Connection connection, Provider provider)throws Exception;

}
