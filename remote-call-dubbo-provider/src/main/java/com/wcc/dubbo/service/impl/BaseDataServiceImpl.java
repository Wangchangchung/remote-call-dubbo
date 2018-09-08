package com.wcc.dubbo.service.impl;

import com.wcc.dubbo.service.BaseDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author charse
 * @create 2018-09-03
 * @Description:
 */
public class BaseDataServiceImpl implements BaseDataService{

    public static final Logger logger = LoggerFactory.getLogger(BaseDataServiceImpl.class);

    public String query(String id) {
        logger.info("call_query_start");
        return  "query by " + id;
    }

    public String sayHell0(String name) {
        logger.info("call_sayHello_start");
        return "hello " + name;
    }
}
