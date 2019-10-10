package org.gzw.test;

import org.gzw.entity.Affiche;
import org.gzw.service.AfficheService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AfficheServiceimpltest {



    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AfficheService afficheService = (AfficheService)applicationContext.getBean("afficheService");
        List<Affiche> affichefinall = afficheService.Affichefinall();
        for (Affiche affiche: affichefinall){
            System.out.println(affiche);
        }

    }

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AfficheService AfficheService = (AfficheService) applicationContext.getBean("afficheService");
        Affiche Affiche = AfficheService.Affichefinbyid(1);
        System.out.println(Affiche);

    }

    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AfficheService AfficheService = (AfficheService) applicationContext.getBean("afficheService");
        Affiche Affiche=new Affiche();
        Affiche.setAffichetitle("网站第一天");
        Affiche.setAffichecontents("运行一天了好棒");
        Affiche.setAdminid(1);
        Affiche.setMark("被抓住");
        AfficheService.insertAffiche(Affiche);

    }
    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AfficheService AfficheService = (AfficheService) applicationContext.getBean("afficheService");
        Affiche Affiche=new Affiche();
        Affiche.setAffichetitle("网站第一天");
        Affiche.setAffichecontents("运行一天了好棒");
        Affiche.setAdminid(1);
        Affiche.setMark("被抓住");
        Affiche.setAfficheid(4);
        AfficheService.updateAffiche(Affiche);

    }
    @Test
    public void testa(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AfficheService AfficheService = (AfficheService) applicationContext.getBean("afficheService");
        Affiche Affiche=new Affiche();
        Affiche.setAffichetitle("网站第一天");
        Affiche.setAffichecontents("运行一天了好棒");
        Affiche.setAdminid(1);
        Affiche.setMark("被抓住");
        Affiche.setAfficheid(8);
        AfficheService.deleAffiche(8);

    }




}
