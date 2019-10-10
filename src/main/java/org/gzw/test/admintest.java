package org.gzw.test;

import org.gzw.dao.*;
import org.gzw.entity.*;
import org.gzw.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class admintest {

    @Test
    public void test01(){
      // AdminService adminService = (AdminService)applicationContext.getBean("adminService");
//        List<Admin> admins = adminService.selectByExamplewithrole();
//        for (Admin admin:admins){
//            System.out.println(admin);
//        }
//        Admin admin = adminService.selectByPrimaryKey(1);
//        System.out.println(admin);
//
//        rolesMapper.insertSelective(new Roles(null,"but"));
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = ioc.getBean(OrderDao.class);
        Order order = new Order();
        order.setOrderid(1);
        order.setTotalprice(20);
        orderDao.updateOrder(order);
//        List<Orderitem> orderitemfinall = orderitemDao.Orderitemfinall();
//        for (Orderitem admin:orderitemfinall){
//            System.out.println(admin);
//        }
//        AfficheMapper afficheMapper = ioc.getBean(AfficheMapper.class);
////        Affiche affiche = afficheMapper.selectByPrimaryKeyandAdmin(1);
////        System.out.println(affiche);
//        List<Affiche> affiches = afficheMapper.selectByExampleandAdmin(null);
//        System.out.println(affiches);
      //  OrderMapper orderMapper = ioc.getBean(OrderMapper.class);
//        List<Order> orders = orderMapper.selectByExamplewithshipmentanduser(null);
//        System.out.println(orders);


    }
    @Test
    public void test02(){
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        AfficheDao afficheDao = ioc.getBean(AfficheDao.class);
        List<Affiche> affichefinall = afficheDao.Affichefinall();
        for (Affiche affiche:affichefinall){
            System.out.println(affiche);
        }
    }
    @Test
    public void test03(){
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = ioc.getBean(OrderDao.class);
//        List<Order> orders = orderDao.Orderfinall();
//        for (Order order:orders){
//            System.out.println(order);
//        }
        Order order = orderDao.Orderfinbyid(1);
        System.out.println(order);
    }
    @Test
    public void test04(){
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductDao productDao = ioc.getBean(ProductDao.class);
        List<Product> productfinall = productDao.Productfinall();


        for (Product order:productfinall){
            System.out.println(order);
        }
    }

}
