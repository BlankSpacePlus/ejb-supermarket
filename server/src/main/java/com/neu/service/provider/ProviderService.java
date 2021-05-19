package com.neu.service.provider;

import com.neu.pojo.Provider;

import javax.ejb.Remote;
import java.util.List;

/**
 * @author BlankSpace
 */
@Remote
public interface ProviderService {

	/**
	 * 增加供应商
	 * @param provider
	 * @return
	 */
	boolean add(Provider provider);


	/**
	 * 通过供应商名称、编码获取供应商列表-模糊查询-providerList
	 * @param proName
	 * @return
	 */
	List<Provider> getProviderList(String proName, String proCode);

	/**
	 * 通过proId删除Provider
	 * @param delId
	 * @return
	 */
	int deleteProviderById(String delId);


	/**
	 * 通过proId获取Provider
	 * @param id
	 * @return
	 */
	Provider getProviderById(String id);

	/**
	 * 修改用户信息
	 * @param provider
	 * @return
	 */
	boolean modify(Provider provider);

}
