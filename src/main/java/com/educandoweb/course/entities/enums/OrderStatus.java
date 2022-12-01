package com.educandoweb.course.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1), PAID(2), SHIPED(3), DELIVERED(4), CANCELED(5);

	private Integer code;

	private OrderStatus(Integer code) {
		this.code = code;
	}

	public Integer getCode() {
		return this.code;
	}

	public static OrderStatus valueOf(Integer code) {
		for (var status : OrderStatus.values()) {
			if (status.getCode() == code) {
				return status;
			}
		}

		throw new IllegalArgumentException("Invalid order status code");
	}
}
