package com.cy.store.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cy.store.entity.Order;
import com.cy.store.service.IOrderService;

@Controller
@RequestMapping("orders")
public class OrderController extends BaseController {
	
	@Autowired
	private IOrderService orderService;
	
	@PostMapping("create")
	public String create(Integer aid, Integer[] cids, HttpSession session, Model model) {
		
		// セッション情報取得
		Integer uid = getUidFromSession(session);
		String username = getUsernameFromSession(session);
		
		// 注文情報作成
		Order data = orderService.create(aid, cids, uid, username);
		
		// 次ページにorder情報引き渡し
		model.addAttribute("order", data);
		
		return "payment";
	}
}
