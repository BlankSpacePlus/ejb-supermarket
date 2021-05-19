package com.neu.service.role;

import com.neu.dao.BaseDao;
import com.neu.dao.role.RoleDao;
import com.neu.dao.role.RoleDaoImpl;
import com.neu.pojo.Role;

import javax.ejb.Stateless;
import java.sql.Connection;
import java.util.List;

@Stateless(name = "RoleServiceEJB")
public class RoleServiceBean implements RoleService{
    
    private RoleDao roleDao;

    public RoleServiceBean() {
        roleDao = new RoleDaoImpl();
    }

    @Override
    public List<Role> getRoleList() {
        Connection connection = null;
        List<Role> roleList = null;
        try {
            connection = BaseDao.getConnection();
            roleList = roleDao.getRoleList(connection);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            BaseDao.closeResource(connection, null, null);
        }
        return roleList;
    }

}
