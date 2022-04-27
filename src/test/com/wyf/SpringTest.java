package com.wyf;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @className: com-> SpringTest
 * @author: 王一飞
 * @createDate: 2022-04-11 21:11
 * @description: 测试类
 */
// （运行器）使Junit运行于spring环境
@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
@SpringBootTest
@Transactional
public class SpringTest {
    //    @Resource
    //    private JdbcTemplate jdbcTemplate;

    //  测试是否连接数据库
    @Test
    public void a() {
        //        Long aLong = jdbcTemplate.queryForObject("select count(*) from enterprise_file_field", Long.class);
        System.out.println("123");
    }
}
