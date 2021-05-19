package com.neu.tools;

import com.neu.factory.EJBFactory;

/**
 * @author BlankSpace
 */
public class GetEJBService {

    public static Object getService(String target) {
        if (target.equals("bill")) {
            System.out.println("调用 BillServiceEJB ");
            return EJBFactory.getEJB("ejb:/server_war_exploded/BillServiceEJB!com.neu.service.bill.BillService");
        }
        if (target.equals("provider")) {
            System.out.println("调用 ProviderServiceEJB ");
            return EJBFactory.getEJB("ejb:/server_war_exploded/ProviderServiceEJB!com.neu.service.provider.ProviderService");
        }
        if (target.equals("role")) {
            System.out.println("调用 RoleServiceEJB ");
            return EJBFactory.getEJB("ejb:/server_war_exploded/RoleServiceEJB!com.neu.service.role.RoleService");
        }
        if (target.equals("user")) {
            System.out.println("调用 UserServiceEJB ");
            return EJBFactory.getEJB("ejb:/server_war_exploded/UserServiceEJB!com.neu.service.user.UserService");
        }
        return null;
    }

}
