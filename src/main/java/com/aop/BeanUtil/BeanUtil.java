package com.aop.BeanUtil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
public class BeanUtil implements ApplicationContextAware {
    private  static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(@NotNull ApplicationContext applicationContext){
        BeanUtil.applicationContext = applicationContext;
    }

    public static <T> T getBean(Class<T> bean){
        return applicationContext.getBean(bean);
    }
}