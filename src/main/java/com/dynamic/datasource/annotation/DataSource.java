package com.dynamic.datasource.annotation;

import com.dynamic.datasource.enums.DataSourceType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {

    public DataSourceType value() default DataSourceType.MASTER;
}
