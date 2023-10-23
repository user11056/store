package com.cy.store.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
//@RequestMapping("pay")
public class PayController extends BaseController {

/*	@Autowired
	private IOrderService orderService;
*/
	@PostMapping("pay")
	//引数なしで一旦調整
	public String payment(HttpSession session, Model model) {
		
		// セッション情報取得
		Integer uid = getUidFromSession(session);
		String username = getUsernameFromSession(session);
		
		//何らかの処理を使う
		
		return "paySuccess";
	}
}
