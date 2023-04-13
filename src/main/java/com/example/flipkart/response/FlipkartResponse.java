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
public class FlipkartResponse {
	private int applicationport;
	private String applicationname;
	private int statuscode;
	private String message;
	private List<FlipkartDTO> productDetails;
}
