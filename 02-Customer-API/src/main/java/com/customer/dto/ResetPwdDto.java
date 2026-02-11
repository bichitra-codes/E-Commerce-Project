package com.customer.dto;

import lombok.Data;

@Data
public class ResetPwdDto {
	
	private String customerEmail;
	private String currentPassword;
	private String newPassword;
	private String configPassword;

}

  //    DTOs are used to carry only required data between client ↔ controller/service.
  //   So instead of using the main CustomerEntity, 
   //                  we create a small object only for THIS operation