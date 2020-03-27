package com.ioc;

public class IOCDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        SimpleIOCContainer container = new SimpleIOCContainer();
        DependModuleA moduleA = (DependModuleA) container.getBean("moduleA");
        moduleA.funcFromModuleA();
        DependModuleB moduleB = (DependModuleB) container.getBean("moduleB");
        moduleB.funcFromModuleB();
        MainModule mainModule = (MainModule) container.getBean("mainModule");
        mainModule.getModuleA().funcFromModuleA();
        mainModule.getModuleB().funcFromModuleB();
        container.getBean("mainModule");
    }
}
