package com.revature.spring_mvc;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

public class AppDriver {

    public static void main(String[] args) throws LifecycleException {
        Tomcat appServer = new Tomcat();
        String rootContextPath = "/mvc-demo";
        appServer.setPort(8080);
        appServer.getConnector();
        appServer.addContext(rootContextPath, new File(".").getAbsolutePath());
        AnnotationConfigWebApplicationContext beanContainer = new AnnotationConfigWebApplicationContext();
        beanContainer.register(AppConfig.class);
        appServer.addServlet(rootContextPath, "DispatcherServlet", new DispatcherServlet(beanContainer)).addMapping("/");
        appServer.start();
    }
}
