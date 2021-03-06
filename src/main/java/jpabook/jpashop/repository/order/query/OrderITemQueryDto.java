package jpabook.jpashop.repository.order.query;

import lombok.Data;

@Data
public class OrderITemQueryDto {

	private Long orderId;
	private String itemName;
	private int orderPrice;
	private int count;

	public OrderITemQueryDto(Long orderId, String itemName, int orderPrice, int count) {
		this.orderId = orderId;
		this.itemName = itemName;
		this.orderPrice = orderPrice;
		this.count = count;
	}
}
