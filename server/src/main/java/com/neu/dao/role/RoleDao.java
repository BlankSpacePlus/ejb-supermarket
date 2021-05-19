package com.neu.dao.role;

import com.neu.pojo.Role;

import java.sql.Connection;
import java.util.List;

/**
 * @author BlankSpace
 */
public interface RoleDao {

	List<Role> getRoleList(Connection connection)throws Exception;

}
