package com.elsleiman.freelancer;

public class FirstInPickList<T> extends AbstractAutoPickList<T>  {

	@Override
	public T getNextTask() {
		T a = list.get(0);
		list.remove(0);
		return a;
		
	}
}
