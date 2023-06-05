package com.simeio.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Continental implements IFoodMenu {

	@Override
	public List<String> showItems() {
		List<String> list=Arrays.asList("roast chicken","french fries","baked potato");
		return list;
	}

}
