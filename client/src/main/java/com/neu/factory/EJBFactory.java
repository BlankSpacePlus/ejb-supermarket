package com.neu.factory;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

/**
 * EJB工厂
 * @author BlankSpace
 */
public class EJBFactory {

    public static Object getEJB(String jndipath) {
        try {
            Properties jndiProps = new Properties();
            jndiProps.put(Context.URL_PKG_PREFIXES,"org.jboss.ejb.client.naming");
            jndiProps.put("jboss.naming.client.ejb.context", true);
            final Context context = new InitialContext(jndiProps);
            return context.lookup(jndipath);
        } catch (NamingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
