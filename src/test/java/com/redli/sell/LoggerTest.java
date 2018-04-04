package com.redli.sell;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import lombok.extern.slf4j.Slf4j;

/**
 * @author redLi
 * @package com.redli
 * @time 2018/03/26 21:50
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {
    @Test
    public void test1() {
        log.debug("debug...");
        log.info("info...");
        log.error("error...");
    }
}
