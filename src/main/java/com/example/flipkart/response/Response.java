package com.example.flipkart.response;

import java.util.List;

import com.example.flipkart.dto.FlipkartDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Response {
	private int statuscode;
	private String message;
	private int port;
	private String appname;
	private List<FlipkartDTO> productDetails;

}
