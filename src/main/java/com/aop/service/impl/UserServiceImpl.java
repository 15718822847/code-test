package com.aop.service.impl;

import com.aop.BeanUtil.BeanUtil;
import com.aop.annotation.OperationLogDetail;
import com.aop.enums.OperationType;
import com.aop.enums.OperationUnit;
import com.aop.service.UserService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @OperationLogDetail(detail = "通过手机号[{{tel}}]获取用户名",level = 3,operationUnit = OperationUnit.USER,operationType = OperationType.SELECT)
    @Override
    public String findUserName(String tel) {
        System.out.println("tel:" + tel);
        /**
         * spring 不建议这种内部调用的操作，以aop为起点，内部调用，是代理类调用，不会
         * 产生注解效果
         * 修改为以本类为起点，ApplicationContext得到本类中方法触发，可以产生注解效果
         */
        //this.findUserId(UUID.randomUUID().toString());
        BeanUtil.getBean(this.getClass()).findUserId(UUID.randomUUID().toString());
        return "zhangsan";
    }

    @OperationLogDetail(detail = "通过手机号[{{id}}]获取用户名",level = 3,operationUnit = OperationUnit.USER,operationType = OperationType.SELECT)
    @Override
    public String findUserId(String id) {
        System.out.println("id:" + id);
        return id;
    }
}
