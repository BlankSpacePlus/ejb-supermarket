package com.neu.service.role;

import com.neu.pojo.Role;

import javax.ejb.Remote;
import java.util.List;

/**
 * @author BlankSpace
 */
@Remote
public interface RoleService {

	List<Role> getRoleList();

}
