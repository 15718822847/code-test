package com.dynamic.datasource.configuration;

public class DynamicDataSourceContextHolder {
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    /**
     * 设置数据源的变量
     */
    public static void setDateSourceType(String dsType)
    {
        System.out.println("切换到{"+dsType+"}数据源");
        CONTEXT_HOLDER.set(dsType);
    }

    /**
     * 获得数据源的变量
     */
    public static String getDateSourceType()
    {
        return CONTEXT_HOLDER.get();
    }

    /**
     * 清空数据源变量
     */
    public static void clearDateSourceType()
    {
        CONTEXT_HOLDER.remove();
    }
}
