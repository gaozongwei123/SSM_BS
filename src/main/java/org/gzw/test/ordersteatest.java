package org.gzw.test;

import org.gzw.entity.Favorlist;
import org.gzw.service.FavorlistService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ordersteatest {
    @Test
    public void test01() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        FavorlistService favorlistService = (FavorlistService) applicationContext.getBean("favorlistService");
        List<Favorlist> faaa = favorlistService.Favorlistfinall();
        for (Favorlist favorlist : faaa) {
            System.out.println(favorlist);
        }
    }

}
