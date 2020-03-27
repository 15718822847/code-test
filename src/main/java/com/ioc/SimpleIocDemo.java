package com.ioc;

public class SimpleIocDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        MainModule mainModule = new MainModule();
        mainModule.setModuleA(new DependModuleAImpl());
        mainModule.setModuleB(new DependModuleBImpl());
        mainModule.getModuleA().funcFromModuleA();
        mainModule.getModuleB().funcFromModuleB();
    }
}
