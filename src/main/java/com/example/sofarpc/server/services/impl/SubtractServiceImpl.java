package com.example.sofarpc.server.services.impl;

import com.example.sofarpc.server.services.SubtractService;
import com.example.sofarpc.server.services.SumService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubtractServiceImpl implements SubtractService {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public int subtract(int a, int b) {

        int subtract = a - b;
        logger.info("Received A = {} AND B = {}",a,b);
        return subtract;
    }
}
