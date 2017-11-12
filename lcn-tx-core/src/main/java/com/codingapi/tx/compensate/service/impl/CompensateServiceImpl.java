package com.codingapi.tx.compensate.service.impl;

import com.codingapi.tx.compensate.service.CompensateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * create by lorne on 2017/11/11
 */
@Service
public class CompensateServiceImpl implements CompensateService {


    private Logger logger = LoggerFactory.getLogger(CompensateServiceImpl.class);

    @Override
    public void saveLocal(long currentTime, String modelName, String uniqueKey, String data, String methodStr, String className, String json) {
        logger.warn("currentTime:" + currentTime + ",state:" + json + ",modelName:" + modelName + "," +
            "uniqueKey:" + uniqueKey + ",methodStr:" + methodStr + ",className:" + className + ",data:" + data);
    }
}
