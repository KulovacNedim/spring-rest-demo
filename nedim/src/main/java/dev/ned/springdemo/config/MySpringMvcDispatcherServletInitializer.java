package dev.ned.springdemo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("3 nedim src  - get ServlerConfigClasses");
        return new Class[] {  DemoAppConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("4 nedim src - getServletMappings");
        return new String[] { "/"};
    }
}
