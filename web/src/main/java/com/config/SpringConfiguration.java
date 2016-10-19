package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by Talha on 10/18/2016.
 */

public class SpringConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {

        return new Class[]{WebApplicationConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
//        return new Class<?>[0];
        return null;
    }

    @Override
    protected String[] getServletMappings() {
//        return new String[0];
        return new String[] {"/"};
    }
}