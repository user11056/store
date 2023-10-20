package com.cy.store.mapper;

import java.util.List;

import com.cy.store.entity.Product;


public interface SearchMapper {

    List<Product> searchList(String searchWord);

}
