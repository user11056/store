package com.cy.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.store.entity.Product;
import com.cy.store.mapper.SearchMapper;
import com.cy.store.service.ISearchService;

/** 处理省/市/区数据的业务层实现类 */
@Service
public class SearchServiceImp implements ISearchService {
	@Autowired
	private SearchMapper searchMapper;

	public List<Product> searchList(String searchWord) {

		List<Product> list = searchMapper.searchList(searchWord);

		return list;

	}

}
