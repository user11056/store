package com.cy.store.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class SearchWord {

	@NotBlank(message = "商品名を入力してください")
	@Size(max=100)
    private String searchWord;
}


