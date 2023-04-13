package com.example.flipkart.request;

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
public class FlipkartRequest {

	private int id;
	private String wproductid;
	private String wproductname;
	private long wproductprice;

}
