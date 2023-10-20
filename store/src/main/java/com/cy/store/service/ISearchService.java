package com.cy.store.service;

import java.util.List;

import com.cy.store.entity.Product;


public interface ISearchService {

	List<Product> searchList(String searchWord);
}
