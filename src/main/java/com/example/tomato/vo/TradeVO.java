package com.example.tomato.vo;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
------------- -------- ------ 
NO            NOT NULL NUMBER 
BOARD_NO      NOT NULL NUMBER 
ITEM_CATEGORY NOT NULL NUMBER 
ADDRESS_NO    NOT NULL NUMBER 
BUYER_NO               NUMBER 
STATUS_NO     NOT NULL NUMBER 
PRICE         NOT NULL NUMBER
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TradeVO {
	private int no;
	private int boardNo;
	private int itemCategory;
	private int addressNo;
	private int buyerNo;
	private int statusNo;
	private int price;
}
