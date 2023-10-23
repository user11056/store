package com.cy.store.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cy.store.entity.Order;
import com.cy.store.service.IOrderService;
import com.cy.store.util.JsonResult;

/** 处理用户相关请求的控制器类 */
@RestController
@RequestMapping("payment")
public class PayController extends BaseController {
    @Autowired
    private IOrderService orderService;

    @PostMapping("/")
    public JsonResult<Order> create(Integer oid,HttpSession session) {
        // 从Session中取出uid和username
        Integer uid = getUidFromSession(session);
        String username = getUsernameFromSession(session);
        // 调用业务对象执行业务
        Order data = orderService.create(oid, uid, username);
        // 返回成功与数据
        return new JsonResult<Order>(OK, data);
    }
}
