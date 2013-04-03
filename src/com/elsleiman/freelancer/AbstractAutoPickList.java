package com.elsleiman.freelancer;

import java.util.ArrayList;
import java.util.List;

public  abstract class AbstractAutoPickList<T> implements IAutoPick<T> {

		List<T> list = new ArrayList<T>();

		@Override
		public void addItem(T a) {
			list.add(a);
		}

}
