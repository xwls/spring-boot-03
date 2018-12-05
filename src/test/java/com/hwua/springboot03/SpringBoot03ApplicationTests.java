package com.hwua.springboot03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot03ApplicationTests {

    private Logger logger = LoggerFactory.getLogger(SpringBoot03ApplicationTests.class);

    @Test
    public void contextLoads() {
//        trace > debug > info > warn > error
        logger.trace("这是trace日志信息。。。。。");
        logger.debug("这是debug日志信息。。。。。");
        logger.info("这是info日志信息。。。。。");
        logger.warn("这是warn日志信息。。。。。");
        logger.error("这是error日志信息。。。。。");
    }

}
