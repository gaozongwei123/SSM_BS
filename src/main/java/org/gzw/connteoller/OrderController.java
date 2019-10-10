package org.gzw.connteoller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.gzw.entity.Order;
import org.gzw.entity.Product;
import org.gzw.entity.Shipment;
import org.gzw.entity.User;
import org.gzw.service.OrderService;
import org.gzw.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;
    @RequestMapping("/list")
    public String orderlist(@RequestParam(value = "pn",defaultValue = "1") Integer pn, Model model){

        List<Order> orders=orderService.Orderfinall();
     
        model.addAttribute("olist",orders);
        return "order-list";
    }

    @RequestMapping("/add")
    public String orderadd(Model model){
        List<Product> products=productService.Productfinall();
        model.addAttribute("products",products);
        return "order-add";
    }
    @RequestMapping("/adds")
    public String orderadds(Order order){

        orderService.insertOrder(order);
        return "order-list";
    }
    @RequestMapping(value = "/orderbyid/{orderid}",method = RequestMethod.GET)
    public String orderbyid(@PathVariable("orderid") int orderid, Model model){
        Order order = orderService.Orderfinbyid(orderid);
        model.addAttribute("order",order);
        return "order-fall";
    }
    @RequestMapping(value = "/orderupdate/{orderid}")
    public String updateorderbyid(@PathVariable("orderid") int orderid,Model model){
        Order order = orderService.Orderfinbyid(orderid);
        model.addAttribute("order",order);
        return "order-edit";
    }
    @RequestMapping(value = "/updates",method = RequestMethod.POST)
    public String updates(Order order){
    orderService.updateOrder(order);
        return "redirect:/order/list";
    }
}
