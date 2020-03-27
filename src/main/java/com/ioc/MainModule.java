package com.ioc;

public class MainModule {
    public DependModuleA moduleA;
    public DependModuleB moduleB;
    public DependModuleA getModuleA() {
        return moduleA;
    }
    public void setModuleA(DependModuleA moduleA) {
        this.moduleA = moduleA;
    }
    public DependModuleB getModuleB() {
        return moduleB;
    }
    public void setModuleB(DependModuleB moduleB) {
        this.moduleB = moduleB;
    }

}

interface DependModuleA{
    public void funcFromModuleA();
}

interface DependModuleB{
    public void funcFromModuleB();
}

class DependModuleAImpl implements DependModuleA{

    @Override
    public void funcFromModuleA() {
        System.out.println("This is func from Module A");
    }

}

class DependModuleBImpl implements DependModuleB{

    @Override
    public void funcFromModuleB() {
        System.out.println("This is func from Module B");
    }

}
