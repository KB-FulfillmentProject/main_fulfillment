package com.ot.main.delivery.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryListResponseDTO {

	private Long id;

	private Integer trackingNumber;

	private String userName;

	private String hp1;

	private String hp2;

	private String hp3;

	private String address;

	private String zipcode;

	private String productName;

	private Integer stockCount; 

	private String statusDelivery;

	private String productCode;
}
