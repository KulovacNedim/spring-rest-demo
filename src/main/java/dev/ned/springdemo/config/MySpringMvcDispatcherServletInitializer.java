package dev.ned.springdemo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        return new Class[] {  DemoAppConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("123121321321231231212132231213212312123123132");
        return new String[] { "/"};
    }
}
