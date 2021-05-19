package com.neu.service.user;

import com.neu.pojo.User;

import javax.ejb.Remote;
import java.util.List;

/**
 * @author BlankSpace
 */
@Remote
public interface UserService {

	/**
	 * 增加用户信息
	 * @param user
	 * @return
	 */
	boolean add(User user);

	/**
	 * 用户登录
	 * @param userCode
	 * @param userPassword
	 * @return
	 */
	User login(String userCode, String userPassword);

	/**
	 * 根据条件查询用户列表
	 * @param queryUserName
	 * @param queryUserRole
	 * @return
	 */
	List<User> getUserList(String queryUserName, int queryUserRole, int currentPageNo, int pageSize);
	/**
	 * 根据条件查询用户表记录数
	 * @param queryUserName
	 * @param queryUserRole
	 * @return
	 */
	int getUserCount(String queryUserName, int queryUserRole);

	/**
	 * 根据userCode查询出User
	 * @param userCode
	 * @return
	 */
	User selectUserCodeExist(String userCode);

	/**
	 * 根据ID删除user
	 * @param delId
	 * @return
	 */
	boolean deleteUserById(Integer delId);

	/**
	 * 根据ID查找user
	 * @param id
	 * @return
	 */
	User getUserById(String id);

	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	boolean modify(User user);

	/**
	 * 根据userId修改密码
	 * @param id
	 * @param pwd
	 * @return
	 */
	boolean updatePwd(int id, String pwd);

}
