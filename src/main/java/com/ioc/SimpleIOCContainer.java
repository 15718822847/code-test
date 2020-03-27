package com.ioc;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SimpleIOCContainer {
    private Properties properties = new Properties();
    public Map<String, Object> moduleMap = new HashMap<>();
    {
        try {
            properties.load(new FileInputStream(new File("D:\\code-test\\src\\main\\java\\com\\ioc\\SimpleIOC.properties")));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public Object getBean(String moduleName) throws ClassNotFoundException {
        Object instanceObj;
        if(moduleMap.get(moduleName)!=null){
            System.out.println("return old bean");
            return moduleMap.get(moduleName);
        }
        System.out.println("create new bean");
        String fullClassName = properties.getProperty(moduleName);
        if(fullClassName == null)
            throw new ClassNotFoundException();
        else{
            Class<? extends Object> clazz = Class.forName(fullClassName);
            try {
                instanceObj = clazz.newInstance();
                instanceObj = buildAttachedModules(moduleName,instanceObj);
                moduleMap.put(moduleName, instanceObj);
                return instanceObj;
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    private Object buildAttachedModules(String modulename , Object instanceObj) {
        Set<String> propertiesKeys = properties.stringPropertyNames();
        Field[] fields = instanceObj.getClass().getDeclaredFields();
        for (String key : propertiesKeys) {
            if(key.contains(modulename)&&!key.equals(modulename)){
                try {
                    Class<? extends Object> clazz = Class.forName(properties.getProperty(properties.getProperty(key)));
                    for (Field field : fields) {
                        if(field.getType().isAssignableFrom(clazz))
                            //field.setAccessible(true);
                            field.set(instanceObj, clazz.newInstance());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
        return instanceObj;
    }
}
