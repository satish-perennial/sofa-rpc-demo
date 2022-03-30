package com.example.sofarpc.server.services.impl;

import com.example.sofarpc.server.services.SumService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SumServiceImpl implements SumService {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public int sum(int a, int b) {

        int sum = a + b;
        logger.info("Received A = {} AND B = {}",a,b);
        return sum;
    }
}
