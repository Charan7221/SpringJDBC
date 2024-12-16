package com.springServelet;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException
    {
        System.out.println( "Hello World!" );
        Tomcat tomcat = new Tomcat();
        Context ctx = tomcat.addContext( "", null );
        Tomcat.addServlet(ctx,"HelloServlet",new HelloServlet());
        ctx.addServletMappingDecoded("/hello","HelloServlet");

        tomcat.start();
        tomcat.getServer().await();
    }
}
