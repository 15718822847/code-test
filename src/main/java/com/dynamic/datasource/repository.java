package com.dynamic.datasource;

import com.aop.model.OperationLog;
import com.dynamic.datasource.annotation.DataSource;
import com.dynamic.datasource.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class repository {

    @Autowired
    NamedParameterJdbcTemplate template;

    @DataSource(value = DataSourceType.MASTER)
    public List<OperationLog> portal() {
        String sql = "select id from declaration";
        Map map = new HashMap();
        map.put("a","a");
        List<OperationLog> operationLog = template.queryForList(sql,map);
        //template.query(sql,map,  new BeanPropertyRowMapper<OperationLog>(OperationLog.class));
        return operationLog;
    }

    @DataSource(value = DataSourceType.SLAVE)
    public List<model> psrm() {
        String sql = "select address_id from c1_address where ROWNUM <100";
        Map map = new HashMap();
        map.put("a","a");
        List<model> operationLog = template.queryForList(sql,map);
        return operationLog;
    }

    public List<model> psrm1() {
        String sql = "select id from declaration";
        Map map = new HashMap();
        map.put("a","a");
        List<model> operationLog = template.queryForList(sql,map);
        return operationLog;
    }
}
