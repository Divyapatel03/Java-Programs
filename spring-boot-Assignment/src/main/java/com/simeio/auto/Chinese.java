package com.simeio.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Chinese implements IFoodMenu{

	@Override
	public List<String> showItems() {
		List<String> list=Arrays.asList("manchurian","noodeles","roles","pasta");
		return list;
	}

}
