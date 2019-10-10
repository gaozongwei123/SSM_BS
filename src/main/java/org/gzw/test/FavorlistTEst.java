package org.gzw.test;

import org.gzw.entity.Favorlist;
import org.gzw.service.FavorlistService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class FavorlistTEst {


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

    @Test
    public void test02() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        FavorlistService favorlistService = (FavorlistService) applicationContext.getBean("favorlistService");
        Favorlist favorlist = favorlistService.Favorlistfinbyid(1);
        System.out.println(favorlist);
    }

    @Test
    public void test03() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        FavorlistService favorlistService = (FavorlistService) applicationContext.getBean("favorlistService");
        Favorlist favorlist = new Favorlist();
        favorlist.setUserid(1);
        favorlist.setProductid(4);
        favorlist.setFavordescp("aaa");
        favorlist.setMark("aaa");
        favorlistService.insertFavorlist(favorlist);
    }

    @Test
    public void test04() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        FavorlistService favorlistService = (FavorlistService) applicationContext.getBean("favorlistService");
        Favorlist favorlist = new Favorlist();
        favorlist.setFavorlistid(3);
        favorlist.setUserid(1);
        favorlist.setProductid(4);
        favorlist.setFavordescp("aaa");
        favorlist.setMark("cccc");
        favorlistService.insertFavorlist(favorlist);
    }

    @Test
    public void test05() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        FavorlistService favorlistService = (FavorlistService) applicationContext.getBean("favorlistService");
        Favorlist favorlist = new Favorlist();
        favorlist.setFavorlistid(3);
        favorlist.setUserid(1);
        favorlist.setProductid(4);
        favorlist.setFavordescp("aaa");
        favorlist.setMark("cccc");
        favorlistService.deleFavorlist(3);
    }


}
