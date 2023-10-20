package com.cy.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.cy.store.entity.Product;
import com.cy.store.entity.SearchWord;
import com.cy.store.service.ISearchService;

@Controller
public class SearchController extends BaseController {
	@Autowired
	private ISearchService searchService;

	@GetMapping("/search")
	//@RequestMapping(method={RequestMethod.GET})
	public String searchList(@Validated @ModelAttribute SearchWord searchWord, BindingResult result, Model model) {

		System.out.println(searchWord);
		if (result.hasErrors()) {
			
			System.out.println("エラー");
			
			return "index";
		}
		
		List<Product> data = searchService.searchList(searchWord.getSearchWord());
		model.addAttribute("searchlist", data);

		return "search";
		
//        if(list.size() == 0) {
//			model.addAttribute("message0", "注文エラーが発生しております、商品がすでに注文されています");
//			return "cart";
//        } else {
	}
}
